/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiempo_de_relax;

import java.util.Scanner;

/**
 *
 * @author manue
 * Objetivos
 *  1. Seleccion Multiple
 *      a.Estructura
 *      b.Tipo de condicion
 * 2.Formato de cadena (printf)
 */
public class Tiempo_de_relax {

    /**
     * Desarrolar algoritmo que me permita escojer un pais a visitar.
     * Posterior a ello, debemos nosotros escojer las posibles ciudades
     * a recorrer, sin embargo, solo se puede una ciudad.
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int seleccionMenu = 0;
        char seleccionSubMenu = '@';
        
        System.out.println("Agencia de viajes");
        System.out.printf("|%20s| |%-20s| \n", "Tania's Travels","Buen Viaje");
        System.out.println("=====================================================================");
        System.out.println("1. Japon");
        System.out.println("2. Francia");
        System.out.println("3. Nueva Zelanda");
        System.out.println("4. Canada");
        System.out.print("Respuesta:");
        seleccionMenu = sc.nextInt();
        
        /*
        if/else -> Rango valores
        switch -> igualdad / todas estan mismo nivel
        */
        
        switch(seleccionMenu){
            case 1:
                System.out.println("Nihon e yokoso");
                System.out.println("Bienvenido a Japon");
                System.out.println();
                System.out.println("=====================================================================");
                
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("C. Kioto");
                System.out.println("Respuesta:");
                System.out.println("=====================================================================");
                System.out.println("Cualquier ciudad..?");
                        System.out.println("por que no esta la opcion");
                        System.out.println("que escogistes");
                
                sc.nextLine();//limpieza de buffer
                seleccionSubMenu =sc.nextLine().toUpperCase().charAt(0);
                switch(seleccionSubMenu){
                    case 'A':
                        System.out.println("Super Nintendo Wold Tour");
                        break;
                    case 'B':
                        System.out.println("Car Meet");
                        break;
                    case'C':
                        System.out.println("Pabellon dorado segun Google");
                    default://Sirve para 
                        System.out.println("Cualquier ciudad..?");
                        System.out.println("por que no esta la opcion");
                        System.out.println("que escogistes");
                }//fin del switch sub menu
                break;
            case 2:
                System.out.println("Bienvenue en France");
                System.out.println("Bienvenido a Francia");
                System.out.println();
                System.out.println("=====================================================================");
                System.out.println("1. Paris");
                System.out.println("2. Marsella");
                System.out.println("3. Lyon");
                System.out.println("Respuesta:");
                
                
                sc.nextLine();//limpiar el buffer
                seleccionSubMenu = sc.nextLine().charAt(0);
                switch (seleccionSubMenu){
                case '1':
                        System.out.println("Torre Eiffel");
                        break;
                    case '2':
                        System.out.println("Palacio de Marshella");
                        break;
                    case'3':
                        System.out.println("El estadio!!");
                    default://Sirve para 
                        System.out.println("Lea no esta la opcion esa");
                        System.out.println("");
                        System.out.println("=====================================================================");
                        
                }//fin del switch
                break;
            case 3:
                System.out.println("Nau mai, haere mai!");
                System.out.println("Bienvenido a Nueva Zelanda");
                System.out.println();
                System.out.println("=====================================================================");
                System.out.println("A. Sky tower");
                System.out.println("B. Hogbbiton");
                System.out.println("C. Mildford Sound");
                System.out.println("Respuesta:");
                
                sc.nextLine();//limpiar el buffer
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                if(seleccionSubMenu == 'A'){
                    System.out.printf("%s Sky Tower %s","\u001B[31m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='B'){
                    System.out.printf("%s Hogbbiton %s","\u001B[32m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='C'){
                    System.out.printf("%s Hogbbiton %s","\u001B[34m","\u001B[0m");
                }
                else{
                    System.out.println("Usted no lee va?!!!");
                }
                
                
                
            case 4:
                System.out.println("Welcome to Canada");
                System.out.println("Bienvenido a Canada");
                System.out.println();
                System.out.println("=====================================================================");
                break;
        }
        
    }//fin de main
    
}//fin de class
