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
            <form action="addtocart">
            <div class="card w-50 mx-auto my-5">
                <div class="card-header text-center">Register formulare</div>
                <div class="card-body text-center">
                        <div class="form-group1">
                            <label for="width"></label>
                            <select name="width" id="width">
                               <optgroup label="Carport width">
                               <option>....................Vælge bredde til dit carport....................</option>
                               <option value="240">240 cm</option>
                               <option value="270">270 cm</option>
                               <option value="300">300 cm</option>
                               <option value="330">330 cm</option>
                               <option value="360">360 cm</option>
                               <option value="390">390 cm</option>
                               <option value="420">420 cm</option>
                               <option value="450">450 cm</option>
                               <option value="480">480 cm</option>
                               <option value="510">510 cm</option>
                               <option value="540">540 cm</option>
                               <option value="570">570 cm</option>
                               <option value="600">600 cm</option>
                               <option value="630">630 cm</option>
                               <option value="660">660 cm</option>
                               </optgroup>
                           </select>
                        </div>
                        <br>

                        <div class="form-group2">
                            <label for="length"></label>
                            <select name="length" id="length">
                                <optgroup label="Carport length">
                                <option>....................Vælge Længde til dit carport....................</option>
                                <option value="240">240 cm</option>
                                <option value="270">270 cm</option>
                                <option value="300">300 cm</option>
                                <option value="330">330 cm</option>
                                <option value="360">360 cm</option>
                                <option value="390">390 cm</option>
                                <option value="420">420 cm</option>
                                <option value="450">450 cm</option>
                                <option value="480">480 cm</option>
                                <option value="510">510 cm</option>
                                <option value="540">540 cm</option>
                                <option value="570">570 cm</option>
                                <option value="600">600 cm</option>
                                <option value="630">630 cm</option>
                                <option value="660">660 cm</option>
                                <option value="690">690 cm</option>
                                <option value="720">720 cm</option>
                                <option value="750">750 cm</option>
                                <option value="780">780 cm</option>
                                </optgroup>
                            </select>
                        </div>
                    <br>

                        <div class="form-group4">
                            <label for="r_width"></label>
                            <select name="r_width" id="r_width">
                                <optgroup label="redskabsrum width">
                                <option>....................Uden redskabsrum.....................</option>
                                <option value="210">210 cm</option>
                                <option value="240">240 cm</option>
                                <option value="270">270 cm</option>
                                <option value="300">300 cm</option>
                                <option value="330">330 cm</option>
                                <option value="360">360 cm</option>
                                <option value="390">390 cm</option>
                                <option value="420">420 cm</option>
                                <option value="450">450 cm</option>
                                <option value="480">480 cm</option>
                                <option value="510">510 cm</option>
                                <option value="540">540 cm</option>
                                <option value="570">570 cm</option>
                                <option value="600">600 cm</option>
                                <option value="630">630 cm</option>
                                <option value="660">660 cm</option>
                                <option value="690">690 cm</option>
                                <option value="720">720 cm</option>
                                </optgroup>
                            </select>
                        </div>
                        <br>
                        <div class="form-group5">
                            <label for="r_length"></label>
                            <select name="r_length" id="r_length">
                                <optgroup label="redskabsrum length">
                                <option>....................Uden redskabsrum.....................</option>
                                <option value="150">150 cm</option>
                                <option value="180">180 cm</option>
                                <option value="210">210 cm</option>
                                <option value="240">240 cm</option>
                                <option value="270">270 cm</option>
                                <option value="300">300 cm</option>
                                <option value="330">330 cm</option>
                                <option value="360">360 cm</option>
                                <option value="390">390 cm</option>
                                <option value="420">420 cm</option>
                                <option value="450">450 cm</option>
                                <option value="480">480 cm</option>
                                <option value="510">510 cm</option>
                                <option value="540">540 cm</option>
                                <option value="570">570 cm</option>
                                <option value="600">600 cm</option>
                                <option value="630">630 cm</option>
                                <option value="660">660 cm</option>
                                </optgroup>
                            </select>
                        </div>
                        <br>
                        <br>

                        <form>
                            <h5>Kontakt samtykke</h5>
                            <input type="radio" id="Fog" name="fav_language" value="">
                            <label for="Fog">Fog må benytte de afgivne oplysninger til at kontakte mig</label><br>
                            <label for="fog">i forbindelse med tilbud på QuickByg carport*</label>
                        </form>
                        <br>
                        <br>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary">Bestil tilbud</button>
                        </div>
                </div>
            </div>
            </form>
            <form action="creatOrdre">
                <button type="submit" class="btn btn-primary">Betal</button>
            </form>
        </div>


        <c:forEach items="${sessionScope.cart}" var="cart">
            width: ${cart}
        </c:forEach>
        <br>
        <br>

        <c:forEach items="${sessionScope.cart1}" var="cart1">
            Length: ${cart1}
        </c:forEach>
        <br>
        <br>
        <c:forEach items="${sessionScope.cart2}" var="cart2">
            R_width: ${cart2}
        </c:forEach>
        <br>
        <br>
        <c:forEach items="${sessionScope.cart3}" var="cart3">
            R_Length: ${cart3}
        </c:forEach>
        <br>
        <br>



    </jsp:body>

</t:pagetemplate>