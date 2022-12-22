package dat.backend.model.services;


import dat.backend.control.MaterialeMap;
import dat.backend.model.entities.Carport;
import dat.backend.model.entities.Materialer;

import java.util.Map;

public class Calculator {

    int stolpeAntal;
    int stolpePrice;
    int spærAntal;
    int spærPrice;

    private Map<Integer, Materialer> materialeMap;


    public Calculator(Map<Integer, Materialer> materialeMap) {
        this.materialeMap = materialeMap;
    }

    public Calculator() {

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

    public int udregnfrontAndBackRemAntal() {

        int frontAndBackRem = 2;

        return frontAndBackRem;
    }

    public int sideRemAntal() {

        int sideRem = 2;

        return sideRem;

    }

    public int remPåTagetAntal() {

        int remPåTaget = 2;

        return remPåTaget;
    }

    public int tagpladeAntal(int længde) {

        int tagplade = 0;

        tagplade = (int) Math.ceil(længde / 3.6);

        return tagplade;


    }

    public int antalBeslag() {

        int antalBeslag = 30;

        return antalBeslag;


    }

    public int antalSkruer() {

        int antalSkruer = 2;


        return antalSkruer;
    }


    public int udregnStolpePrice() {

        int unitPriceStolpe = materialeMap.get(1).getPrice_per_unit();

        int stolpePrice = stolpeAntal * (3 * unitPriceStolpe);
        return stolpePrice;
        //int unitPrice = inde.price_per_unit
        // price = (antal x 3) X unitPrice

        //return price;.getAttribute("materiale_Id", 4)
    }

    public int udregnSpærPrice(int lengthe) {

        int unitPriceSpær = materialeMap.get(1).getPrice_per_unit();

        int spærPrice = (spærAntal * lengthe) * unitPriceSpær;

        return spærPrice;
    }

    public int remFrontogBack(int width){

        int unitPriceRem = materialeMap.get(1).getPrice_per_unit();

        int remPrice = (2 * width) * unitPriceRem;

        return remPrice;
    }

    public int remSide(int width){

        int unitPriceRemSide = materialeMap.get(1).getPrice_per_unit();
        int remSidePrice = 2 * width * unitPriceRemSide;

        return remSidePrice;
    }

    public int remSpær(int width){

        int unitPriceRemSpær = materialeMap.get(1).getPrice_per_unit();
        int remSpærPrice = 2 * width * unitPriceRemSpær;
        return remSpærPrice;
    }

    public int totalCarportPrice(){
        udregnStolpePrice();
        int carportPrice = stolpePrice+stolpeAntal;
        return carportPrice;
    }
}


