<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="/error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
         You are now logged in as admin
    </jsp:attribute>

    <jsp:attribute name="footer">
        Admin page
    </jsp:attribute>

    <jsp:body>

        <c:forEach var="item" items="${applicationScope.materialerMap}">

        ${item.value.price_per_unit}

        </c:forEach>


    </jsp:body>

</t:pagetemplate>
