<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<c:set var="todaysDate" value="<%= new java.util.Date() %>"/>

<h1><bean:message key="portfolio.text"/></h1>

<div id="links">
	<ul>
		<li><a href='all-books.do'>Portfolio</a></li>
		<li><a href='tc.jsp'>Terms and Conditions</a></li>
	</ul>
</div>