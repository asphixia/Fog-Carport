<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<t:pagetemplate>

    <jsp:body>
        <div class="container">
            <div class="card w-50 mx-auto my-5">
                <h2 class="card-header text-center" style="background-color: dodgerblue">Payment</h2>
                <div class="card-body" style="background-color: #04AA6D">
                    <form action="materialeMap" method="post">
                        <div class="text-center">
                            <div class="form-group">
                                <h3>Billing Address</h3>
                                <br><br>
                                <label for="fname"><i class="fa fa-user"></i> Full Name : </label>
                                <input type="text" style="width: 35%" id="fname" name="firstname"
                                       placeholder="John M. Doe">

                                <label for="email"><i class="fa fa-envelope"></i> Email : </label>
                                <input type="text" style="width: 35%" id="email" name="email"
                                       placeholder="john@example.com">
                                <br><br>
                                <label for="adr"><i class="fa fa-address-card-o"></i> Address : </label>
                                <input type="text" style="width: 36%" id="adr" name="address"
                                       placeholder="542 W. 15th Street">

                                <label for="city"><i class="fa fa-institution"></i> City : </label>
                                <input type="text" style="width: 36%" id="city" name="city" placeholder="New York">
                                <br><br>
                                <label for="state">State : </label>
                                <input type="text" style="width: 40%" id="state" name="state" placeholder="NY">

                                <label for="zip">Zip :</label>
                                <input type="text" style="width: 40%" id="zip" name="zip" placeholder="10001">
                                <br><br>
                                <div class="form-group">
                                    <h3>Payment</h3>
                                    <label for="fname">Accepted Cards</label>
                                    <div class="icon-container">
                                        <i class="fa fa-cc-visa" style="color:navy;"></i>
                                        <i class="fa fa-cc-amex" style="color:blue;"></i>
                                        <i class="fa fa-cc-mastercard" style="color:red;"></i>
                                        <i class="fa fa-cc-discover" style="color:orange;"></i>
                                    </div>
                                </div>
                                <br>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-50">

                                            <label for="cname">Name on Card : </label>
                                            <input type="text" style="width: 25%" id="cname" name="cardname"
                                                   placeholder="John More Doe">

                                            <label for="ccnum">Credit card number :</label>
                                            <input type="text" style="width: 30%" id="ccnum" name="cardnumber"
                                                   placeholder="1111-2222-3333-4444">
                                            <br><br>
                                            <label for="expmonth">Exp Month : </label>
                                            <input type="text" style="width: 20%" id="expmonth" name="expmonth"
                                                   placeholder="September">

                                            <label for="expyear">Exp Year :</label>
                                            <input type="text" style="width: 20%" id="expyear" name="expyear"
                                                   placeholder="2018">

                                            <label for="cvv">CVV : </label>
                                            <input type="text" style="width: 20%" id="cvv" name="cvv"
                                                   placeholder="352">
                                        </div>
                                    </div>
                                </div>
                                <br><br>
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary" style="width: 300px">Pay
                                    </button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="card w-50 mx-auto my-5">
                <h2 class="card-header text-center" style="background-color: dodgerblue">Bestilling</h2>
                <div class="card-body" style="background-color: lightskyblue">
                        <div class="text-center">
                            <div class="form-group">

                                Carport Bredde på : ${sessionScope.cart.lastCarport.width} cm
                                <br>
                                Carport Længde på : ${sessionScope.cart.lastCarport.lenghte} cm
                                <br>
                                Redskabsrum bredde på : ${sessionScope.cart.lastCarport.r_width} cm
                                <br>
                                Redskabsrum Længde på : ${sessionScope.cart.lastCarport.r_lenght} cm
                                <br>
                                <br>
                                Total Price: ${sessionScope.price} KR
                                <br>
                            </div>
                            <br>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <br>


    </jsp:body>

</t:pagetemplate>