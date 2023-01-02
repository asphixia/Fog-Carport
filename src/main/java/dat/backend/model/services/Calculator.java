package dat.backend.model.services;


import dat.backend.model.entities.Materialer;

import java.util.Map;

public class Calculator {

    int stolpeAntal;
    int antal;
    double stolpePrice;
    int spærAntal;
    double spærPrice;
    double remSidePrice;
    double remPrice;
    double remSpærPrice;
    int tagplade = 0;
    double tagpladePris = 0;
    double længde;
    double bredde;
    double antalPakker = 0;
    double unitTagplade;
    double unitPriceStolpe;
    double unitPriceSpær;
    double unitPriceRem;
    double unitPriceRemSide;



    int frontAndBackRem = 2;
    int sideRem = 2;
    int remPåTaget = 2;
    int antalBeslag = 30;
    int antalSkruer = 2;
    double carportPrice;
    double moms = 1.25;

    private Map<Integer, Materialer> materialeMap;


    public Calculator(Map<Integer, Materialer> materialeMap) {
        this.materialeMap = materialeMap;
    }


    public int udregnStolpeAntal(int længde) {


        if (længde >= 3) {

            stolpeAntal = 6;
        } else {
            stolpeAntal = 4;

        }
        return stolpeAntal;
    }


    public int udregnSpærAntal(int længde) {


        spærAntal = (int) Math.ceil(længde / 0.55);

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

    public int tagpladeAntal(int længde, int bredde) {

        tagplade = (int) Math.ceil((længde * bredde)/1.09);

        return tagplade;


    }

    public double tagpladePrice(double længde) {
        if (længde <=3.6) {

            unitTagplade = materialeMap.get(16).getPrice_per_unit();

            tagpladePris = tagplade * unitTagplade;
        }
        else {
             unitTagplade = materialeMap.get(15).getPrice_per_unit();
        }
        return tagpladePris;
    }





    public int antalBeslag() {


        return antalBeslag;


    }

    public int antalSkruer() {


        return antalSkruer;
    }


    public double udregnStolpePrice() {

        unitPriceStolpe = materialeMap.get(11).getPrice_per_unit();

        stolpePrice = (stolpeAntal * 3 * unitPriceStolpe);

        return stolpePrice;
        //int unitPrice = inde.price_per_unit
        // price = (antal x 3) X unitPrice

        //return price;.getAttribute("materiale_Id", 4)
    }

    public double udregnSpærPrice(double længde) {

         unitPriceSpær = materialeMap.get(10).getPrice_per_unit();

        spærPrice = ((spærAntal * længde) * unitPriceSpær);

        return spærPrice;
    }
    public double remFrontogBackPrice(double bredde) {

        unitPriceRem = materialeMap.get(1).getPrice_per_unit();

        remPrice = (2 * bredde) * unitPriceRem;

        return remPrice;

    }
    

    public double remSidePrice(double længde){

        unitPriceRemSide = materialeMap.get(1).getPrice_per_unit();

        remSidePrice = 2 * bredde * unitPriceRemSide;

        return remSidePrice;
    }

    public double remSpærPrice(double længde){

        double unitPriceRemSpær = materialeMap.get(1).getPrice_per_unit();

        remSpærPrice = 2 * længde * unitPriceRemSpær;

        return remSpærPrice;
    }

    public double tagpladeSkruerPakkeAntal(double bredde,double længde) {

        //double unitTagpladeSkruer = materialeMap.get(17).getPrice_per_unit();
        // double antalPakkePerAreal =(3/(6*7.8)); // Length*width of carport


        double areal = bredde*længde; // Roof area of carport
        if (areal <=6) {
            antalPakker = 1;
        }
        if (areal>6 && areal<15){
            antalPakker = 2;
        }
        else
            antalPakker = 3;

        return antalPakker;
    }

    public double tagpladeSkruerPakkePris(int width){

        double getPricePerUnit = (materialeMap.get(17).getPrice_per_unit());

        double price = getPricePerUnit*antalPakker;

        return price;
    }




    public double universalBeslagPris(){ //højre og venstre beslag har det samme pris

        double pris = materialeMap.get(19).getPrice_per_unit()*(spærAntal*2);

        return pris;
    }

    public double antalHulband(double længde){


        if (længde<3) {
            antal = 1;
        } else
            antal =2;

        return antal;
    }

    public double hulbandPris(){

        double prisPerAntal = materialeMap.get(18).getPrice_per_unit();
        double pris = prisPerAntal*prisPerAntal;

        return pris;
    }


    public double sternOgVandbredSkruer(){        // Always one independent of carport dimensions
        int pakkeAntalSternOgVandbred = 1;
        return pakkeAntalSternOgVandbred;
    }

    public double prisSternOgVandbredSkruer(){

        int pris = materialeMap.get(20).getPrice_per_unit();

        return pris;
    }

    public double totalCarportPrice(){

        udregnStolpePrice();

        carportPrice = stolpePrice + stolpeAntal * (moms);

        return carportPrice;
    }

}


