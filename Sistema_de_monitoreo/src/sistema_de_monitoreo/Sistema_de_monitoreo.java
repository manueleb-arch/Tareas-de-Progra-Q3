
package sistema_de_monitoreo;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Sistema_de_monitoreo {

    /*

     * Desarrolla un programa en Java que simule la lectura de sensores de 
     * temperatura en un cuarto de servidores. El programa debe solicitar 
     * el nombre del operador encargado y cuántas lecturas de sensores se 
     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 
     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 
     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 
     * mostrar un resumen estadístico.

    
        1.Comprender problema que se esta abordando.
            a. que datos de entrada necesito
            b. transformacion / calculos necesario
            c. que resultado se presentan?
    
        2. visualizacion / diseño de la solucion
            a. diagrama flujo
            b. pseudocodigo
        
        3. programacion incremental
          a. listando las tareas a cumplir
            i. declaracion de variable
            ii. estructura de seleccion
            iii. ciclo de repeticion
            iv. validacion de dtos
          b. validacion
    
        4. prueba de escritorio
            a. casos
            b. ecenarios
            c. resultado / patrones definidos
     */
    public static void main(String[] args) {
        /*
        Lista de tarea
            1. Entrada:
                Nombre de usuario
                numero de lecturas
                ingreso de temperatura (random)
            2. Calculo/transformacion
                formula celsius / farenheit
                definicion de sobrecalentamiento
                validacion lectura (0>lectura <50)
                valdacion de temperatura
        
            3. salida
                resumen estadistico 
                alerta de sobrecalentamiento
        
        
        Lista de tareas
        1.Capturar el nombre del usuario
            a.Definicion de libreria / intancia Scanner.
            b.Declaracion de variable para el usuario.
        2.Captura de numero de lectura
            a. Definicion de libreria Random.
            b.Declaracion de variable
            c.Mostrar el numero de Random Generado temporalmente.
        */
        Scanner sc = new Scanner(System.in);
        
        String operador;
        
        System.out.println("Ingreasa Tu nombre");
        operador = sc.nextLine();
        
    }//fin del main
    
}//fin del class
