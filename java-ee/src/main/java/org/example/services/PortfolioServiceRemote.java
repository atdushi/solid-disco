package org.example.services;

import jakarta.ejb.Remote;
import org.example.model.Position;

import java.util.List;

@Remote
public interface PortfolioServiceRemote {
    List<Position> getPortfolio();
}
