package org.example.backingbeans;

import jakarta.annotation.Resource;
import jakarta.ejb.EJB;
import jakarta.faces.bean.ManagedBean;
import jakarta.jms.*;
import org.example.model.Position;
import org.example.services.PortfolioServiceRemote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class PortfolioPageBean {
    @EJB
    PortfolioServiceRemote portfolioServiceImplementation;

    @Resource(mappedName="jms/ConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(mappedName="jms/PortfolioManamgementQueue")
    private Queue queue;

    public List<Position> getAllPositions() {
        ArrayList<Position> result = new ArrayList<>();
        if (portfolioServiceImplementation == null){
            result.add(new Position("empty", new BigDecimal(0), new BigDecimal(0), "empty", "empty"));
        }else{
            List<Position> positions = portfolioServiceImplementation.getPortfolio();
            result.addAll(positions);
        }

        send(result);

        return result;
    }

    private void send(List<Position> positionList){
        try
        {
            Connection connection = connectionFactory.createConnection();

            Session session = connection.createSession(false, 0);

            MessageProducer messageProducer = session.createProducer(queue);

            for (Position position :positionList ) {
                MapMessage message = session.createMapMessage();
                message.setString("figi", position.getFigi());
                message.setString("name", position.getName());
                messageProducer.send(message);
            }

            connection.close();
        }
        catch (JMSException e)
        {
            System.out.println(e);
        }
    }
}
