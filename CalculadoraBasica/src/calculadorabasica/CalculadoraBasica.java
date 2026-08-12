/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el operador (+, -, *, /, %): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacionExitosal = true;

        // 3. Estructura de selección según el operador
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    // Cuestión de formato decimal: convertimos num1 a double para obtener decimales
                    resultado = (double) num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionExitosal = false;
                }
                break;

            case '%':
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("Error: No se puede calcular el módulo entre cero.");
                    operacionExitosal = false;
                }
                break;

            default:
                System.out.println("Operador no reconocido");
                operacionExitosal = false;
                break;
        }

        if (operacionExitosal) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
    
}
