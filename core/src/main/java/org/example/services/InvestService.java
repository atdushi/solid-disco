package org.example.services;

import org.example.model.Position;
import ru.tinkoff.piapi.contract.v1.Account;
import ru.tinkoff.piapi.contract.v1.InstrumentShort;
import ru.tinkoff.piapi.core.InvestApi;
import ru.tinkoff.piapi.core.models.Money;
import ru.tinkoff.piapi.core.models.Portfolio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InvestService {
    static String token = "";

    public static List<Position> getPortfolio() {
        InvestApi api = InvestApi.createReadonly(token);
        List<Account> accounts = api.getUserService().getAccountsSync();
        String mainAccount = accounts.get(0).getId();
        Portfolio portfolio = api.getOperationsService().getPortfolioSync(mainAccount);
        List<ru.tinkoff.piapi.core.models.Position> positions = portfolio.getPositions();

        List result = new ArrayList<Position>();
        for (ru.tinkoff.piapi.core.models.Position position : positions) {
            String figi = position.getFigi();
            BigDecimal quantity = position.getQuantity();
            Money currentPrice = position.getCurrentPrice();
            List<InstrumentShort> instrumentList = api.getInstrumentsService().findInstrumentSync(figi);
            String instrument = instrumentList.size() > 0 ? instrumentList.get(0).getName() : position.getInstrumentType();

            result.add(
                    new Position(figi,
                            quantity,
                            currentPrice.getValue(),
                            currentPrice.getCurrency(),
                            instrument));
        }

        return result;
    }
}
