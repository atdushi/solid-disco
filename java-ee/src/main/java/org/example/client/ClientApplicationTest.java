package org.example.client;

import org.example.services.PortfolioServiceRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientApplicationTest {
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();

//            java:global/<module-name>/<bean-name>
            var service = (PortfolioServiceRemote) jndi.lookup("java:global/mywebapp/PortfolioServiceImplementation");
//                    jndi.lookup("org.example.services.PortfolioServiceRemote");

            var portfolio = service.getPortfolio();
            System.out.println(portfolio);

        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}
