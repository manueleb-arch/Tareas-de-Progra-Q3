/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta_restaurante;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Cuenta_restaurante {

    /**
     * @param args the command line arguments
     * Objetivo 
     * 1. conocer las diferencias tipos de ciclos de repeticion
     * 2. analizar los componentes de todo ciclo de repeticion
     * 3. construir un algoritmo con un ciclo de repeticion
     */
    /*
        Desorrollar un algoritmo que simule la cuenta de un restaurante
        que se tiene que pagar en tre un grupo de amigos (7) dividido
        en partes iguales.
    
        ciclo de repeticion
        1. While 
        2. Do while
        3. For
        4. foreach
    
    componentes de ciclos de repeticion
        1. variable de control -> volor de inicio
        2. condicion           -> limite de repeticion
            todo ciclo de repeticion se ejecuta y repite 
            siempe y cuando la condicion se mantenga verdadera
        3. modificador de la variable control.
        */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double promediop = 0;
        int gastoi= 0;
        
        int nump = 1; //variable
        int  gastoa = 0;
        while(nump <= 7){
            //intrucciones arepetir
            System.out.printf("Persona %d) Cuanto consumiste? ",nump);
            gastoi = sc.nextInt();
            
            gastoa += gastoi;
            System.out.printf("P: %d\tGasto Ind: %d\tGasto ACUM: %d",nump,gastoi,gastoa);
            System.out.println("");
                //gastoi += 1; //nump = numero de persona + 1
            
            //opcion +2
            //opcion + 1
            //nump + 1; //nump - nump +1;
            
            //opcion+2
            nump++;//incremento unitario (POSTINCREMENTO)
           
        }//finde while
        nump --;//post decrementa
        promediop = gastoa/7;
       // promediop =  gastoa / nump;
        System.out.printf("Total personas: %d",nump);
        System.out.println("");
        
        System.out.printf("\nGasto Promedio x Persona: %.2f",promediop);
        System.out.println("");
    }//fin main
    
}//fin class
