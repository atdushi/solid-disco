package org.example;

import org.example.services.InvestService;
import org.example.model.Position;

public class ConsoleApplication {
    public static void main(String[] args) {
        for (Position position : InvestService.getPortfolio()) {
            System.out.println(position);
        }
    }
}