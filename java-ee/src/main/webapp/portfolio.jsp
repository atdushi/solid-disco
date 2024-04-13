<%@ page import="org.example.model.Position" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Tinkoff Invest</title>
</head>
<body>
<jsp:useBean id="portfolioBean" scope="application" class="org.example.backingbeans.PortfolioPageBean"/>
<h1>My portfolio</h1>

<c:forEach items="${portfolioBean.allPositions}" var="nextPosition">
    <li>
        <h2>${nextPosition.figi}</h2>
        <p>
                ${nextPosition.name} - ${nextPosition.quantity}, ${nextPosition.price}
        </p>
    </li>
</c:forEach>

</body>
</html>
