<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Tinkoff Invest Portfolio</title>
</head>
<body>
<jsp:include page="/header.jsp"/>

<div id="books">
    <ul>
        <c:forEach items="${allPositions}" var="nextPosition">
            <li>
                <h2>${nextPosition.figi}</h2>
                <p>
					<span>${nextPosition.name} - <fmt:formatNumber value="${nextPosition.quantity}" type="number"/>
					       <fmt:formatNumber value="${nextPosition.price}" type="currency" currencyCode="RUB"/>
                    </span>
                </p>
            </li>
        </c:forEach>
    </ul>
</div>

<jsp:include page="/footer.jsp"/>
</body>
</html>