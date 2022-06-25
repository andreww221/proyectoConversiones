
package controller;

/**
 *
 * @author Andrew
 * Clase creada con el fin de definir las operaciones de conversion de temperaturas
 */
public class temperaturaController {

    public double gradosCelsiusA(double valor, String convertir) {

        double resultado = valor;

        if (convertir == "Grados Kelvin") {
            resultado =  valor+273.15 ;
            System.out.println("resultado");
            

        }

        if (convertir == "Grados Fahrenheit") {
            resultado = (valor*9/5)+32  ;
        }

           return resultado;

    }
    
    
    
    
    
    
    
     public double gradosKelvinA(double valor, String convertir) {

        double resultado = valor;

        if (convertir == "Grados Celcius") {
            resultado = valor-273.15;

        }

        if (convertir == "Grados Fahrenheit") {
            resultado = (valor-273.15)*9/5+32;
        }

       return resultado;

    }
    
     
       public double gradosFahrenheitA(double valor, String convertir) {

        double resultado = valor;

        if (convertir == "Grados Kelvin") {
            
            resultado =(valor-32)*5/9+273.15;

        }

        if (convertir == "Grados Celcius") {
             resultado =(valor-32)*5/9;
        }

         return resultado;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
