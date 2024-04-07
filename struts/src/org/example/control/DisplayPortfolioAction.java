package org.example.control;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.example.model.Position;
import org.example.services.InvestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

//http://localhost:8080/mywebapp/portfolio.do
public class DisplayPortfolioAction extends Action {
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {
        List<Position> allPositions = InvestService.getPortfolio();
        request.setAttribute("allPositions", allPositions);
        return mapping.findForward("viewPortfolio");
    }
}