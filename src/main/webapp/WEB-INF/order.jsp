<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
         Welcome to the logged in area
    </jsp:attribute>

    <jsp:attribute name="footer">
        Logged in area
    </jsp:attribute>

    <jsp:body>

      <h2>Det virker du</h2>
        <br>
        <br>

        Antal linier i kurven: ${requestScope.cartsize}

        <br>
        <br>
        <br>
        Indhold i kurv:

        <c:forEach var="item" items="${sessionScope.cart.carportList}">

            Width:    ${item.width}      length:    ${item.lenghte}
            r_width:  ${item.r_width}    r_length:  ${item.r_lenght}


        </c:forEach>

        <div class="container mt-3">
            <hr/>
            <div class="row mt-4">
                <div class="col">
                    <form action="order">
                        <button name="order">Bestil</button>
                    </form>
                </div>
                <div class="col">
                    <form action="welcome">
                        <button name="Back">Back</button>
                    </form>
                </div>
            </div>
        </div>


    </jsp:body>

</t:pagetemplate>