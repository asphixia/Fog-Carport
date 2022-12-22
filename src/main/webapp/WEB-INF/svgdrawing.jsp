<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
         SVG drawing
    </jsp:attribute>

    <jsp:attribute name="footer">
        SVG
    </jsp:attribute>

    <jsp:body>

      <h1>SVG Tegning til folket</h1>

        ${requestScope.svg}


    </jsp:body>

</t:pagetemplate>