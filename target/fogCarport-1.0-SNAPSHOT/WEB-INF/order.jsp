<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:pagetemplate>

    <jsp:body>
        <div class="container">
            <div class="card w-50 mx-auto my-5">
                <h2 class="card-header text-center" style="background-color: dodgerblue">KURV</h2>
                <div class="card-body" style="background-color: #04AA6D">
                        <div class="text-center">
                            <div class="form-group">
                                <h2>Din Kurv</h2>
                                <br>
                                <br>

                                <h2>Din bestillinge er</h2>


                                <div class="w3-container w3-blue">

                                    Carport Bredde på : ${sessionScope.cart.lastCarport.width} cm
                                    <br>
                                    Carport Længde på : ${sessionScope.cart.lastCarport.lenghte} cm
                                    <br>
                                    Redskabsrum bredde på : ${sessionScope.cart.lastCarport.r_width} cm
                                    <br>
                                    Redskabsrum Længde på : ${sessionScope.cart.lastCarport.r_lenght} cm
                                    <br>
                                    Total Price: ${sessionScope.price} KR
                                    <br>


                                </div>
                            </div>
                        </div>
                </div>
            </div>
        </div>
         <br>
        <p>Carport demo</p>
        <a href="svg">Se tegning</a>
        <br>




        <div class="container mt-3">
            <hr/>
            <div class="row mt-4">
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
        </div>


    </jsp:body>

</t:pagetemplate>