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

        <div class="container">
            <div class="card w-50 mx-auto my-5">
                <h2 class="card-header text-center" style="background: lightskyblue">Velkommen</h2>
                <div class="card-body" style="background: lightskyblue">
                    <form action="login.jsp" method="post">
                        <div class="w3-container w3-blue">
                            <div class="text-center">
                                <h1>Log venligst på systemet først</h1>
                            </div>
                            <br>
                            <div class="text-center">
                                <button type="submit" class="btn btn-primary">Login</button>
                            </div>
                    </form>
                </div>
                <br>
                <div class="text-center">
                    <h6>Eller opret dig her</h6>
                </div>
                <br>
                <form action="createUser.jsp" method="post">
                    <div class="text-center">
                        <button type="submit" class="btn btn-primary">CreatUser</button>
                    </div>
                </form>
            </div>
        </div>



    </jsp:body>

</t:pagetemplate>