package org.example.messagedrivenbeans;

import jakarta.ejb.MessageDriven;
import jakarta.jms.JMSException;
import jakarta.jms.MapMessage;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

@MessageDriven(mappedName = "jms/PortfolioManamgementQueue")
public class PortfolioMessageDrivenBean implements MessageListener {
    public void onMessage(Message originalMessage) {
        try {
            MapMessage message = (MapMessage) originalMessage;
            String figi = message.getString("figi");
            String name = message.getString("name");
            System.out.println(figi + " " + name);
        } catch (JMSException e) {
            System.out.println("Bad message received!!!!");
            throw new RuntimeException(e);
        }
    }
}
