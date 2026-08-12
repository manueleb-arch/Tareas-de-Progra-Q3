/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuento_de_tienda_de_software;

import java.util.Scanner;

/**
 *
 * @author manue
 * 
 * 2. Clasificación de Descuentos en Tienda de Software Enunciado
 * 
Una tienda de software ofrece descuentos basados en la edad del cliente y si tiene una membresía
premium.
* Se tiene que solicitar la edad y si tiene membresía ('S' para sí, 'N' para no).
* 
• Primero, se tiene que verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
* 
o Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene membresía. 
* Si cumple alguna de las condiciones, recibe un 20% de descuento. Si no, recibe un
10%.
o Si es menor de edad: Verificar si tiene membresía 'S' y tiene más de 12 años.
* Si es así, recibe un 15% de descuento.
* De lo contrario, no tiene descuento (0%).
* 
* 
El programa debe calcular y mostrar el descuento final aplicado y también el precio de venta
original y el nuevo total que se tiene que pagar por el juego.

 */
public class Descuento_de_tienda_de_software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // 1. Lectura de datos
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Tienes membresía premium? (S/N): ");
        char membresia = sc.next().toUpperCase().charAt(0);

        System.out.print("Ingresa el precio del juego: ");
        double precioOriginal = sc.nextDouble();

        double porcentajeDescuento = 0.0;

        // 2. Lógica de clasificación
        if (edad >= 18) {
            if (edad > 65 || membresia == 'S') {
                porcentajeDescuento = 0.20; // 20%
            } else {
                porcentajeDescuento = 0.10; // 10%
            }
        } else { // Menor de edad
            if (membresia == 'S' && edad > 12) {
                porcentajeDescuento = 0.15; // 15%
            } else {
                porcentajeDescuento = 0.00; // 0%
            }
        }

        // 3. Cálculos finales
        double montoDescuento = precioOriginal * porcentajeDescuento;
        double precioFinal = precioOriginal - montoDescuento;

        // 4. Resultados
        System.out.println("\n--- Resumen de Compra ---");
        System.out.printf("Precio original: $%.2f\n", precioOriginal);
        System.out.printf("Descuento aplicado: %.0f%% ($%.2f)\n", porcentajeDescuento * 100, montoDescuento);
        System.out.printf("Total a pagar: $%.2f\n", precioFinal);
        
        sc.close();
    }//fin del main
    
}//fin de class
