package com.virtualpairprogrammers.controllers;

import org.example.model.Position;
import org.example.services.InvestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/*
 * Нужно убрать из pom.xml Thymeleaf и раскоментить resolver (prefix, suffix) в application.properties
 */
@Controller
public class FirstController {
    @RequestMapping("/home.html")
    public ModelAndView firstPage() {
        List<Position> allPositions = InvestService.getPortfolio();

        ModelAndView view =  new ModelAndView("welcome");

        view.addObject("dateAndTime", new Date());
        view.addObject("allPositions", allPositions);

        return view;
//        return new ModelAndView("/WEB-INF/jsp/welcome.jsp", "dateAndTime", dateAndTime);
    }
}
