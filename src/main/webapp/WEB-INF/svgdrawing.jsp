<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<t:pagetemplate>

    <jsp:body>

        <div class="container">
            <hr/>
            <div class="row mt-3">
                    ${requestScope.svg}
                <div class="col">
                    <form action="betal">
                        <button name="order">Betal</button>
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
