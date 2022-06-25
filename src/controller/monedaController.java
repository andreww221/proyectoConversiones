package controller;

/**
 *
 * @author Andrew
 * 
 * 
 * Clase creada con el fin de definir las operaciones de conversion de monedas
 * 
 */
public class monedaController {

    public double dolarEstaunidenseA(double valor, Object divisa) {

        double resultado = valor;

        if (divisa == "dólar australiano") {

            resultado = valor * 1.44;

        } else if (divisa == "dólar canadiense") {

            resultado = valor * 1.29;

        } else if (divisa == "peso colombiano") {

            resultado = valor * 4138.50;

        } else if (divisa == "peso chileno") {

            resultado = valor * 917.87;

        } else if (divisa == "peso mexicano") {

            resultado = valor * 19.87;

        } else if (divisa == "peso uruguayo") {

            resultado = valor * 39.87;

        } else if (divisa == "yen japonés") {

            resultado = valor * 135.21;

        } else if (divisa == "euros") {

            resultado = valor * 0.95;

        }

        return resultado;

    }

    public double dolarCanadienseA(double valor, Object divisa) {

        double resultado = valor;

        if (divisa == "dólar australiano") {

            resultado = valor * 1.12;

        } else if (divisa == "dólar estadounidense") {

            resultado = valor * 0.78;

        } else if (divisa == "peso colombiano") {

            resultado = valor * 3210.44;

        } else if (divisa == "peso chileno") {

            resultado = valor * 712.04;

        } else if (divisa == "peso mexicano") {

            resultado = valor * 15.41;

        } else if (divisa == "peso uruguayo") {

            resultado = valor * 30.93;

        } else if (divisa == "yen japonés") {

            resultado = valor * 104.89;

        } else if (divisa == "euros") {

            resultado = valor * 0.73;

        }

        return resultado;

    }

    public double dolarAustralianoA(double valor, Object divisa) {

        double resultado = valor;

        if (divisa == "dólar canadiense") {

            resultado = valor * 0.90;

        } else if (divisa == "dólar estadounidense") {

            resultado = valor * 0.69;

        } else if (divisa == "peso colombiano") {

            resultado = valor * 2875.82;

        } else if (divisa == "peso chileno") {

            resultado = valor * 637.82;

        } else if (divisa == "peso mexicano") {

            resultado = valor * 13.80;

        } else if (divisa == "peso uruguayo") {

            resultado = valor * 27.71;

        } else if (divisa == "yen japonés") {

            resultado = valor * 93.90;

        } else if (divisa == "euros") {

            resultado = valor * 0.66;

        }

        return resultado;

    }

    public double pesoColombianoA(double valor, Object divisa) {

        double resultado = valor;

        if (divisa == "dólar canadiense") {

            resultado = valor * 0.00031;

        } else if (divisa == "dólar estadounidense") {

            resultado = valor * 0.00024;

        } else if (divisa == "dólar australiano") {

            resultado = valor * 0.00035;

        } else if (divisa == "peso chileno") {

            resultado = valor * 0.22;

        } else if (divisa == "peso mexicano") {

            resultado = valor * 0.0049;

        } else if (divisa == "peso uruguayo") {

            resultado = valor * 0.0097;

        } else if (divisa == "yen japonés") {

            resultado = valor * 0.033;

        } else if (divisa == "euros") {

            resultado = valor * 0.00023;

        }

        return resultado;

    }

    public double pesoChilenoA(double valor, Object divisa) {

        double resultado = valor;

        if (divisa == "dólar canadiense") {

            resultado = valor * 0.0014;

        } else if (divisa == "dólar estadounidense") {

            resultado = valor * 0.0011;

        } else if (divisa == "dólar australiano") {

            resultado = valor * 0.0016;

        } else if (divisa == "peso colombiano") {

            resultado = valor * 4.54;

        } else if (divisa == "peso mexicano") {

            resultado = valor * 0.022;

        } else if (divisa == "peso uruguayo") {

            resultado = valor * 0.043;

        } else if (divisa == "yen japonés") {

            resultado = valor * 0.15;

        } else if (divisa == "euros") {

            resultado = valor * 0.0010;

        }

        return resultado;

    }

    public double pesoMexicanoA(double valor, Object divisa) {

        double resultado = valor;

        if (divisa == "dólar canadiense") {

            resultado = valor * 0.065;

        } else if (divisa == "dólar estadounidense") {

            resultado = valor * 0.050;

        } else if (divisa == "dólar australiano") {

            resultado = valor * 0.072;

        } else if (divisa == "peso colombiano") {

            resultado = valor * 208.32;

        } else if (divisa == "peso chileno") {

            resultado = valor * 46.20;

        } else if (divisa == "peso uruguayo") {

            resultado = valor * 2.01;

        } else if (divisa == "yen japonés") {

            resultado = valor * 6.81;

        } else if (divisa == "euros") {

            resultado = valor * 0.048;

        }

        return resultado;

    }

    public double pesoUruguayoA(double valor, Object divisa) {

        double resultado = valor;

        if (divisa == "dólar canadiense") {

            resultado = valor * 0.032;

        } else if (divisa == "dólar estadounidense") {

            resultado = valor * 0.025;

        } else if (divisa == "dólar australiano") {

            resultado = valor * 0.036;

        } else if (divisa == "peso colombiano") {

            resultado = valor * 104.17;

        } else if (divisa == "peso chileno") {

            resultado = valor * 23.10;

        } else if (divisa == "peso mexicano") {

            resultado = valor * 0.50;

        } else if (divisa == "yen japonés") {

            resultado = valor * 3.40;

        } else if (divisa == "euros") {

            resultado = valor * 0.024;

        }

        return resultado;

    }
    
    public double yenJaponesA(double valor, Object divisa) {

        double resultado = valor;

        if (divisa == "dólar canadiense") {
            
            resultado = valor*0.0095;

        } else if (divisa == "dólar estadounidense") {
            
            resultado = valor*0.0074;

        } else if (divisa == "dólar australiano") {
            
            resultado = valor*0.011;

        } else if (divisa == "peso colombiano") {
            
            resultado = valor*30.61;

        } else if (divisa == "peso chileno") {
            
            resultado = valor*6.79;

        } else if (divisa == "peso mexicano") {
            
            resultado = valor*0.15;

        } else if (divisa == "peso uruguayo") {
            
            resultado = valor*0.29;

        } else if (divisa == "euros") {
            
            resultado = valor*0.0070;

        }

        return resultado;

    }
    
    public double euroA(double valor, Object divisa) {

        double resultado = valor;

        if (divisa == "dólar canadiense") {
            
            resultado = valor*1.36;

        } else if (divisa == "dólar estadounidense") {
            
            resultado = valor*1.06;

        } else if (divisa == "dólar australiano") {
            
            resultado = valor*1.52;

        } else if (divisa == "peso colombiano") {
            
            resultado = valor*4370.75;

        } else if (divisa == "peso chileno") {
            
            resultado = valor*969.38;

        } else if (divisa == "peso mexicano") {
            
            resultado = valor*20.97;

        } else if (divisa == "peso uruguayo") {
            
            resultado = valor*42.11;

        } else if (divisa == "yen japonés") {
            
            resultado = valor*142.62;

        }

        return resultado;

    }
    
    
    
    
    

}
