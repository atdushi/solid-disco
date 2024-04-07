package org.example.servlets;

import org.example.model.Position;
import org.example.services.InvestService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DisplayPortfolioServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        List<Position> allPositions = InvestService.getPortfolio();
        request.setAttribute("allPositions", allPositions);

        // forward to the displayAllBooks.jsp page to display the results
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/portfolio.jsp");
        dispatch.forward(request, response);
    }
}
