package dat.backend.model.services;


import dat.backend.control.MaterialeMap;
import dat.backend.model.entities.Carport;
import dat.backend.model.entities.Materialer;

import java.util.Map;

public class Calculator {

    int stolpeAntal;
    double stolpePrice;
    int spærAntal;
    int spærPrice;
    double remSidePrice;
    int remPåTaget = 2;
    double remPrice;
    double remSpærPrice;
    double tagplade=0;
    double tagpladePris = 0;
    double længde;
    double bredde;
    double antalPakker=0;
    int antalSkruerUniversal;
    int hulband;
    int antalbolt;
    int antalskiver;
    double tagetpris;
    int frontAndBackRem = 2;

    private Map<Integer, Materialer> materialeMap;



    public Calculator(Map<Integer, Materialer> materialeMap) {
        this.materialeMap = materialeMap;
    }

    public Calculator() {

    }

    public double udregnStolpeAntal(int længde) {   // Antal stolper er relateret til længden på carporten


        if (længde >= 300) {

            stolpeAntal = 6;
        } else {
            stolpeAntal = 4;

        }
        return stolpeAntal;
    }


    public double udregnSpærAntal(double længde) {


        spærAntal = (int) Math.ceil(længde / 55);

        return spærAntal;

    }

    public int frontAndBackRemAntal() {

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

    public double remPåTagetPris(){

        double remPris = materialeMap.get(8).getPrice_per_unit() * 100;

        tagetpris = remPåTaget * remPris;

        return tagetpris;
    }

    public double tagpladeAntal(double længde, double bredde) {


        tagplade = Math.ceil((længde * bredde) / 109);


        return tagplade;


    }


    public double tagpladePrice(double længde) {
        if (længde <=360) {

            double unitTagplade = materialeMap.get(16).getPrice_per_unit();

            double tagpladePris = tagplade * unitTagplade;
        } else {
            double unitTagplade = materialeMap.get(15).getPrice_per_unit();

            double tagpladePris = tagplade * unitTagplade;
        }

        return tagpladePris;
    }

    public double udregnStolpePrice() {

        double unitPriceStolpe = materialeMap.get(1).getPrice_per_unit() * 100;

        double stolpePrice = (stolpeAntal * 3 * unitPriceStolpe);
        return stolpePrice;
    }


    public double udregnSpærPrice(double længde) {

        double unitPriceSpær = materialeMap.get(1).getPrice_per_unit() * 100;

        double spærPrice =  ((spærAntal * længde) * unitPriceSpær);

        return spærPrice;
    }


    public double remFrontogBackPrice(double bredde){

        double unitPriceRem = materialeMap.get(1).getPrice_per_unit() * 100;

        double remPrice = (2 * bredde) * unitPriceRem;

        return remPrice;
    }

    public double remSidePris(double længde){

        double unitPriceRemSide = materialeMap.get(1).getPrice_per_unit() * 100;
        double remSidePrice = 2 * længde * unitPriceRemSide;

        return remSidePrice;
    }

    public double remSpærPris(double længde){

        double unitPriceRemSpær = materialeMap.get(1).getPrice_per_unit() * 100;

        double remSpærPrice = 2 * længde * unitPriceRemSpær;

        return remSpærPrice;
    }

    public double tagpladeSkruerPakkeAntal(double bredde,double længde) {


        double areal = bredde*længde; // Roof area of carport
        if (areal <=60000) {
            antalPakker = 1;
        }
        if (areal>60000 && areal<150000){
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

        if (længde<300) {
            hulband = 1;
        } else
            hulband =2;

        return hulband;
    }

    public double hulbandPris(){

        double prisPerAntal = materialeMap.get(18).getPrice_per_unit();
        double pris = prisPerAntal*hulband;


        return pris;
    }


    public int sternOgVandbredSkruer(){        // Always one independent of carport dimensions

        int pakkeAntalSternOgVandbred = 1;
        return pakkeAntalSternOgVandbred;
    }

    public double prisSternOgVandbredSkruer(){

        int pris = materialeMap.get(20).getPrice_per_unit() * 100;

        return pris;
    }

    public int skruerTilUniversalbeslag(double længde) {

        if (længde<300) {

            antalSkruerUniversal = 1;

        } if (længde>300 && længde <600)

            antalSkruerUniversal =2;

        else {
            antalSkruerUniversal = 3;
        }
        return antalSkruerUniversal;


    }

    public double skruerTilUniversalbeslagPris(){

        int prisPerAntal = materialeMap.get(21).getPrice_per_unit();
        int pris =prisPerAntal*antalSkruerUniversal;

        return pris;
    }

    public int braeddeBolt(double længde){


        if (længde<300) {
            antalbolt = 12;  // 3 bolte per stolpe
        } else
            antalbolt =18;

        return antalbolt;
    }

    public double braeddeboltPris(){

        double prisPerBolt = materialeMap.get(22).getPrice_per_unit();
        double pris = prisPerBolt*antalbolt;
        return pris;


    }


    public int firkantSkiver( double længde){

        if (længde<300) {
            antalskiver = 8;  // 2 firkantskiver per stolpe
        } else
            antalskiver =12;

        return antalskiver;
    }


    public double firkantSkiverPris(){

        double prisPerSkive=materialeMap.get(23).getPrice_per_unit();
        double pris = antalskiver*prisPerSkive;

        return pris;
    }


}






