<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
         Welcome to the frontpage
    </jsp:attribute>

    <jsp:attribute name="footer">
        Welcome to the frontpage
    </jsp:attribute>

    <jsp:body>

        <p>EACH STEP COUNT</p>

        <div class="container mt-3">
        <hr/>
        <div class="row mt-4">
        <div class="col">

            <ul>
                <h4>Carport</h4>
                <a class="nav-item nav-link" href="${pageContext.request.contextPath}/login.jsp"><img src="${pageContext.request.contextPath}/images/Net-image/CarportMedTag.png" width="350px" height="300px" class="img-fluid"/></a>
            </ul>
        </div>
        <div class="col">

            <ul>
                <h4>QuickByg</h4>
                <a class="nav-item nav-link" href="${pageContext.request.contextPath}/login.jsp"><img src="${pageContext.request.contextPath}/images/Net-image/QuckByg.png" width="250px" height="200px" class="img-fluid"/></a>
            </ul>
        </div>
    </jsp:body>

</t:pagetemplate>