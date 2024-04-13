package org.example.backingbeans;

import jakarta.ejb.EJB;
import jakarta.faces.bean.ManagedBean;
import org.example.model.Position;
import org.example.services.PortfolioServiceRemote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class PortfolioPageBean {
    @EJB
    PortfolioServiceRemote portfolioServiceImplementation;

    public List<Position> getAllPositions() {
        if (portfolioServiceImplementation == null){
            ArrayList<Position> result = new ArrayList<>();
            result.add(new Position("empty", new BigDecimal(0), new BigDecimal(0), "empty", "empty"));
            return result;
        }
        return portfolioServiceImplementation.getPortfolio();
    }
}
