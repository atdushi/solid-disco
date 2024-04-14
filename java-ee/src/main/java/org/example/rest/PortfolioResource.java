package org.example.rest;

import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.example.model.Position;
import org.example.services.PortfolioServiceRemote;

import java.util.List;

/*
    http://localhost:8080/mywebapp/rest/portfolio/
 */

@Path("/portfolio")
public class PortfolioResource {
    @EJB
    PortfolioServiceRemote portfolioServiceImplementation;

    @GET
    @Path("/positions")
    public List<Position> getAllPositions(){
        return portfolioServiceImplementation.getPortfolio();
    }

    @GET
    @Produces("text/plain")
    public String hello(){
        return "hello";
    }
}
