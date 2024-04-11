<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1>Welcome to Tinkoff Invest Portfolio, the date and time is ${dateAndTime}</h1>

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