

import java.util.Scanner;

/*2. Uso de la librería Math Desarrolle un programa que pida al usuario el radio de un círculo.
Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, calcule
el área y circunferencia de dicho círculo y muestre el resultado al usuario.
*/

public class Uso_de_la_libreria_Math {

    public static void main(String[] args) {
        Scanner circulo = new Scanner(System.in);
        double r = 0;
        double a = 0;
        double c = 0;
        double resA = 0;
        double resC = 0;
        
       
       /* 
        System.out.println("Ingresa la letra (m) si el diametro es en metros");
        String respuesta = circulo.nextLine();
        
            if(respuesta.equalsIgnoreCase("m")){
                System.out.println("Ingresa el radio del circulo");
        r = circulo.nextDouble();
        
      resA = (Math.PI)*Math.pow(r, 2);
      resC = (2 * r *Math.PI);
        System.out.printf("\n El perimetro de la area es de :%.0fm",resA);
        System.out.printf("\n El perimetro de la circunferencia es de :%.0fm",resC);
        System.out.println();

                }
            
            else{
        System.out.println("Introduce la letra cm para continuar");
        }*/
    ///*
       //Esta es la tercera opcion si es en cm el diametro
                    
                    System.out.println("Ingresa la letra (cm) si el diametro es en centimetros");
                     String respuesta1 = circulo.nextLine();

                        if(respuesta1.equalsIgnoreCase("cm")){
                            System.out.println("Ingresa el radio del circulo");
                            r = circulo.nextDouble();
            
                           resA = (Math.PI)*Math.pow(r, 2);
                            resC = (2 * r *Math.PI);
                            System.out.printf("\n El perimetro de la area es de :%.0fcm",resA);
                            System.out.printf("\n El perimetro de la circunferencia es de :%.0fcm",resC);
                            System.out.println();
                        }
    
                        else{
                            System.out.println("Introduce la letra cm para continuar");
                        }
                        //*/
                /* Primera face que hice
                        System.out.println("Ingresa el radio del circulo");
        r = circulo.nextDouble();
        resA = (Math.PI)*Math.pow(r, 2);
        cmresC = (2 * r *Math.PI);
        System.out.printf("\n El perimetro de la area es de :%.0fm",resA);
        System.out.printf("\n El perimetro de la circunferencia es de :%.0fm",resC);
        System.out.println();
        */

       }
    }   

    

