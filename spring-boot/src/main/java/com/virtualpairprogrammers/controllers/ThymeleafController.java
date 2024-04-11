package com.virtualpairprogrammers.controllers;

import org.example.model.Position;
import org.example.services.InvestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ThymeleafController {
    @RequestMapping("/")
    public ModelAndView  getIndex(){
        List<Position> allPositions = InvestService.getPortfolio();
        ModelAndView model =  new ModelAndView("index");
        model.addObject("allPositions", allPositions);
        return model;
    }
}
