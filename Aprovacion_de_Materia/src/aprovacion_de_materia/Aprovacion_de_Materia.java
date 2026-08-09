/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aprovacion_de_materia;

import java.util.Scanner;

/**
 *
 * @author manue
 * 
 * Sistema de Aprobación de Materia
Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las
calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".

 */
public class Aprovacion_de_Materia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double notaex1 = 0;
        double notaex2 = 0;
        double Cal = 0;
        String estudiante = "a";
        
        System.out.println("Ingrese su nombre:");
        estudiante = sc.nextLine();
                    System.out.println("=======================================");
                    System.out.println("Ingresa la nota de su primer examen:");
            notaex1 = sc.nextDouble();
            System.out.println("=======================================");
            
            System.out.println("Ingresa la nota del segundo examen:");
            notaex2 = sc.nextDouble();
            
            Cal = notaex1 + notaex2;
            
        if(Cal>= 60){
            
            System.out.printf("\nSu nota es de :%s\n",Cal);
            
            System.out.println("Feliciedades has aprobado tus examenes.");
            
            
        }//fin de; if
        else{
            System.out.println("Tienes que esforsarte mas ala hora de estudair para poder aprobar");
            
        }//fin del else


    }//fin del main
    
}// fin de class
