package dat.backend.model.services;


import dat.backend.model.entities.Materialer;

import java.util.Map;

public class Calculator {

    int stolpeAntal;
    int stolpePrice;
    int spærAntal;
    int spærPrice;
    int frontAndBackRem = 2;
    int sideRem = 2;
    int remPåTaget = 2;
    int tagplade = 0;
    int antalBeslag = 30;
    int antalSkruer = 2;
    int remPrice;
    int remSidePrice;
    int remSpærPrice;
    double carportPrice;
    double moms = 1.25;

    private Map<Integer, Materialer> materialeMap;


    public Calculator(Map<Integer, Materialer> materialeMap) {
        this.materialeMap = materialeMap;
    }


    public int udregnStolpeAntal(int lengthe) {


        if (lengthe >= 7.8) {

            stolpeAntal = 6;
        } else {
            stolpeAntal = 4;

        }
        return stolpeAntal;
    }


    public int udregnSpærAntal(int lengthe) {


        spærAntal = (int) Math.ceil(lengthe / 0.55);

        return spærAntal;

    }

    public int frontAndBackRemAntal() {

        return frontAndBackRem;
    }

    public int sideRemAntal() {

        return sideRem;

    }

    public int remPåTagetAntal() {


        return remPåTaget;
    }

    public int tagpladeAntal(int længde) {

        tagplade = (int) Math.ceil(længde / 3.6);

        return tagplade;


    }

    public int antalBeslag() {


        return antalBeslag;


    }

    public int antalSkruer() {


        return antalSkruer;
    }


    public int udregnStolpePrice() {

        int unitPriceStolpe = materialeMap.get(11).getPrice_per_unit();

        stolpePrice = stolpeAntal * (3 * unitPriceStolpe);

        return stolpePrice;
        //int unitPrice = inde.price_per_unit
        // price = (antal x 3) X unitPrice

        //return price;.getAttribute("materiale_Id", 4)
    }

    public int udregnSpærPrice(int lengthe) {

        int unitPriceSpær = materialeMap.get(10).getPrice_per_unit();

        spærPrice = (spærAntal * lengthe) * unitPriceSpær;

        return spærPrice;
    }
    public int remFrontogBackPrice(int lengthe) {

        int unitPriceRem = materialeMap.get(1).getPrice_per_unit();

        remPrice = (2 * lengthe) * unitPriceRem;

        return remPrice;

    }
    

    public int remSidePrice(int width){

        int unitPriceRemSide = materialeMap.get(2).getPrice_per_unit();

        remSidePrice = 2 * width * unitPriceRemSide;

        return remSidePrice;
    }

    public int remSpærPrice(int lengthe){

        int unitPriceRemSpær = materialeMap.get(8).getPrice_per_unit();

        remSpærPrice = 2 * lengthe * unitPriceRemSpær;

        return remSpærPrice;
    }

    public double totalCarportPrice(){

        udregnStolpePrice();

        carportPrice = stolpePrice + stolpeAntal * (moms);

        return carportPrice;
    }

}


