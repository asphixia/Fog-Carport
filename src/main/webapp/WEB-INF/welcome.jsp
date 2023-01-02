<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:pagetemplate>


    <jsp:body>

        <body class="container-fluid">
        <div class="card" id="div1">
            <h2 class="card-header text-center text-light bg-danger">Byg Carport</h2>
            <form class="form" action="addtocart" method="get">
                <table class="table table-hover table-striped">
                    <div class="card-body text-center"><h5>Carport bredde</h5>
                        <div class="form-group1">
                            <label for="width"></label>
                            <select name="width" id="width">
                                <optgroup label="Carport width">
                                    <option>....................Vælge bredde til dit carport....................
                                    </option>
                                    <option value="240">240 cm</option>
                                    <option value="270">270 cm</option>
                                    <option value="3">300 cm</option>
                                    <option value="4">330 cm</option>
                                    <option value="5">360 cm</option>
                                    <option value="6">390 cm</option>
                                    <option value="7">420 cm</option>
                                    <option value="8">450 cm</option>
                                    <option value="9">480 cm</option>
                                    <option value="10">510 cm</option>
                                    <option value="11">540 cm</option>
                                    <option value="12">570 cm</option>
                                    <option value="13">600 cm</option>
                                </optgroup>
                            </select>
                        </div>
                        <br>

                        <div class="form-group2">
                            <div class="card-body text-center"><h5>Carport Længde</h5>
                                <label for="lengthe"></label>
                                <select name="lengthe" id="lengthe">
                                    <optgroup label="Carport lengthe">
                                        <option>....................Vælge Længde til dit carport....................
                                        </option>
                                        <option value="240">240 cm</option>
                                        <option value="270">270 cm</option>
                                        <option value="300">300 cm</option>
                                        <option value="4">330 cm</option>
                                        <option value="5">360 cm</option>
                                        <option value="6">390 cm</option>
                                        <option value="7">420 cm</option>
                                        <option value="8">450 cm</option>
                                        <option value="9">480 cm</option>
                                        <option value="10">510 cm</option>
                                        <option value="11">540 cm</option>
                                        <option value="12">570 cm</option>
                                        <option value="13">600 cm</option>
                                        <option value="14">630 cm</option>
                                        <option value="15">660 cm</option>
                                        <option value="16">690 cm</option>
                                        <option value="17">720 cm</option>
                                        <option value="18">750 cm</option>
                                        <option value="19">780 cm</option>
                                    </optgroup>
                                </select>
                            </div>
                            <br>

                            <div class="form-group4">
                                <div class="card-body text-center"><h5>Redskabsrum Bredde</h5>
                                    <label for="r_width"></label>
                                    <select name="r_width" id="r_width">
                                        <optgroup label="redskabsrum width" style="width: 40%">
                                            <option>......................Uden redskabsrum.......................</option>
                                            <option value="1">210 cm</option>
                                            <option value="2">240 cm</option>
                                            <option value="3">270 cm</option>
                                            <option value="4">300 cm</option>
                                            <option value="5">330 cm</option>
                                            <option value="6">360 cm</option>
                                            <option value="7">390 cm</option>
                                            <option value="8">420 cm</option>
                                            <option value="9">450 cm</option>
                                            <option value="10">480 cm</option>
                                            <option value="11">510 cm</option>
                                            <option value="12">540 cm</option>
                                            <option value="13">570 cm</option>
                                            <option value="14">600 cm</option>
                                            <option value="15">630 cm</option>
                                            <option value="16">660 cm</option>
                                            <option value="17">690 cm</option>
                                            <option value="18">720 cm</option>
                                        </optgroup>
                                    </select>
                                </div>
                                <br>
                                <div class="form-group5">
                                    <div class="card-body text-center"><h5>Redskabsrum Længde</h5>
                                        <label for="r_length"></label>
                                        <select name="r_length" id="r_length">
                                            <optgroup label="redskabsrum length">

                                                <option>....................Uden redskabsrum.....................
                                                </option>
                                                <option value="1">150 cm</option>
                                                <option value="2">180 cm</option>
                                                <option value="3">210 cm</option>
                                                <option value="4">240 cm</option>
                                                <option value="5">270 cm</option>
                                                <option value="6">300 cm</option>
                                                <option value="7">330 cm</option>
                                                <option value="8">360 cm</option>
                                                <option value="9">390 cm</option>
                                                <option value="10">420 cm</option>
                                                <option value="11">450 cm</option>
                                                <option value="12">480 cm</option>
                                                <option value="13">510 cm</option>
                                                <option value="14">540 cm</option>
                                                <option value="15">570 cm</option>
                                                <option value="16">600 cm</option>
                                                <option value="17">630 cm</option>
                                                <option value="18">660 cm</option>
                                            </optgroup>
                                        </select>
                                    </div>
                                    <br>
                                    <br>

                                    <br>
                                    <br>

                                    <form>
                                        <h5>Kontakt samtykke</h5>
                                        <input type="radio" id="Fog" name="fav_language" value="">
                                        <label for="Fog">Fog må benytte de afgivne oplysninger til at kontakte
                                            mig</label><br>
                                        <label for="fog">i forbindelse med tilbud på QuickByg carport*</label>
                                </div>
                            </div>
                        </div>
                    </div>
        </div>
        <br>

        <div class="container mt-3">
            <div class="text-center">
            <hr/>
            <div class="row mt-3">
                <div class="col">
                    <button name="AddToCart" class="btn btn-primary">AddToCart</button>
                    </form>

                </div>
                <div class="col">
                    <form action="order">
                        <button name="Order" class="btn btn-primary">See Cart</button>
                    </form>
                </div>
            </div>
        </div>
        </div>
        </form>
        </div>
        <br>


        Antal linier i kurven: ${requestScope.cartsize}

        <br>
        <br>
        <br>

        Indhold i kurven :
        <c:forEach var="item" items="${sessionScope.cart.carportList}">

            Bredde : ${item.width} Længde : ${item.lenghte}  RedskabsrumBredde : ${item.r_width} RedskabsrumLængde : ${item.r_lenght}
            <br>
            <br>

        </c:forEach>

        <br>
        <br>
        <br>

    </jsp:body>

</t:pagetemplate>