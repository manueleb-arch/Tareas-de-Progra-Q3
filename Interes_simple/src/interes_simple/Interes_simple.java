/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes_simple;

import java.util.Scanner;

/**
 *
 * @author manue
 * 3. Interés simple Escriba un programa que calcule el interés simple de un préstamo. El sistema
debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
 */
public class Interes_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Generado = new Scanner(System.in);
        
        double CP = 0;
        int ITA = 0;
        int ANIODP = 0;
        double IGEN = 0;
        double cp = 0;
        double tap= 0;
        double adp= 0;
        double tp = 0;
        System.out.println("Ingresa el capital inicial del prestamo");
        CP = Generado.nextDouble();
        
        System.out.println("Cual es el interes anual de tu prestamo");
        ITA = Generado.nextInt();
        
        System.out.println("Ingresa los anios que te dieronde plazo para pagar el prestamo");
        ANIODP = Generado.nextInt();
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("=====================================================================");
        System.out.println("|||||||||||||||||||||||||||INTERES SIMPLE||||||||||||||||||||||||||||");
        System.out.println("=====================================================================");
        
        cp =CP;
        System.out.printf("\n Capital inicial:  ---------------------------  %.2f $",cp);
        System.out.println();
        System.out.println("=====================================================================");
        tap = ITA;
        System.out.printf("\n Interes del prestamo:  ----------------------  %.0f Porcientos",tap);
        System.out.println();
        System.out.println("=====================================================================");
        adp = ANIODP;
        System.out.printf("\n Anios del prestamo:  ------------------------  %.0f Anios",adp);
        System.out.println();
        System.out.println("=====================================================================");
        IGEN = (CP * ITA * ANIODP)/100;
        System.out.printf("\n El interes total generado es de:  -----------  %.2f $",IGEN);
        System.out.println();
        System.out.println("=====================================================================");
        tp = CP + IGEN;
        System.out.printf("\n El total a pagar es de:  --------------------  %.2f $",tp);
        System.out.println();
        System.out.println("=====================================================================");



        
    }//fin del main
    
}//fin del class
