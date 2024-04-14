package org.example.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Named;
import jakarta.jws.WebService;
import org.example.model.Position;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Stateless
@WebService(name = "portfolioWebService")
public class PortfolioServiceImplementation implements PortfolioServiceRemote {
    public List<Position> getPortfolio() {
        // test data
        var result = new ArrayList<Position>();
        result.add(new Position("test1", new BigDecimal(1), new BigDecimal(1), "test1", "test1"));
        result.add(new Position("test2", new BigDecimal(1), new BigDecimal(1), "test2", "test2"));
        result.add(new Position("test3", new BigDecimal(1), new BigDecimal(1), "test3", "test3"));
        return result;
    }
}
