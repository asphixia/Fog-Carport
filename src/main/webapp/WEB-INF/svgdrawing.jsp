<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<t:pagetemplate>
    <jsp:attribute name="header">
         SVG drawing
    </jsp:attribute>

    <jsp:attribute name="footer">
        SVG


    </jsp:attribute>
    <jsp:body>


        ${requestScope.svg}


    </jsp:body>

</t:pagetemplate>
