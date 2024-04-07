package org.example.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.tinkoff.piapi.core.InvestApi;

public class Example {
//    static final Logger log = LoggerFactory.getLogger(Example.class);
//
//    public static void main(String[] args) {
//        var token = "";
//        var api = InvestApi.createReadonly(token);
//
//        getPortfolioExample(api);
//    }
//
//    private static void getPortfolioExample(InvestApi api) {
//        var accounts = api.getUserService().getAccountsSync();
//        var mainAccount = accounts.get(0).getId();
//
//        //Получаем и печатаем портфолио
//        var portfolio = api.getOperationsService().getPortfolioSync(mainAccount);
//        var totalAmountBonds = portfolio.getTotalAmountBonds();
//        log.info("общая стоимость облигаций в портфеле {}", totalAmountBonds);
//
//        var totalAmountEtf = portfolio.getTotalAmountEtfs();
//        log.info("общая стоимость фондов в портфеле {}", totalAmountEtf);
//
//        var totalAmountCurrencies = portfolio.getTotalAmountCurrencies();
//        log.info("общая стоимость валют в портфеле {}", totalAmountCurrencies);
//
//        var totalAmountFutures = portfolio.getTotalAmountFutures();
//        log.info("общая стоимость фьючерсов в портфеле {}", totalAmountFutures);
//
//        var totalAmountShares = portfolio.getTotalAmountShares();
//        log.info("общая стоимость акций в портфеле {}", totalAmountShares);
//
//        log.info("текущая доходность портфеля {}", portfolio.getExpectedYield());
//
//        var positions = portfolio.getPositions();
//        log.info("в портфолио {} позиций", positions.size());
//        for (int i = 0; i < positions.size(); i++) {
//            var position = positions.get(i);
//            var figi = position.getFigi();
//            var quantity = position.getQuantity();
//            var currentPrice = position.getCurrentPrice();
//            var expectedYield = position.getExpectedYield();
//            var a = api.getInstrumentsService().findInstrumentSync(figi);
//            log.info(
//                    "{}, позиция с figi: {}, количество инструмента: {}, текущая цена инструмента: {}, текущая расчитанная доходность: {}",
//                    a.size() > 0 ? a.get(0).getName() : position.getInstrumentType(), figi, quantity, currentPrice, expectedYield
//            );
//        }
//    }
}