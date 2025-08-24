/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author dmci710
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Trabajo Practico n1 - Introduccion a java");
        System.out.println("Alumno: Diego Carrizo. DNI: 32020446");
        
        
        System.out.println("########");
        System.out.println("punto 2.");
        System.out.println("¡Hola, Java!");
        
        System.out.println();
        System.out.println("########");
        System.out.println("punto 3.");
        String nombre = "Pedro";
        int edad = 25;
        double altura = 1.69;
        boolean estudiante = true;
        
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("altura: " + altura);
        System.out.println("estudiante: " + estudiante);
        
       
        System.out.println();
        System.out.println("########");
        System.out.println("punto 4.");

        //creo la instancia de scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String suNombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int suEdad = sc.nextInt();
        sc.nextLine();//limpia buffer
        System.out.printf("Su nombre es %s, y su edad es %d%n", suNombre, suEdad);
        
        System.out.println();
        System.out.println("########");
        System.out.println("punto 5.");
        System.out.println("Ingrese el primer numero entero: ");
        int numeroA = sc.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int numeroB = sc.nextInt();
        sc.nextLine();//limpio
        //operaciones
        int suma = numeroA + numeroB;
        int resta = numeroA - numeroB;
        int multiplicacion = numeroA * numeroB;
        double division = (double)numeroA / numeroB;
        System.out.println("Resultados:");
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);
        System.out.println("division: " + division);
        
        
        System.out.println();
        System.out.println("########");
        System.out.println("punto 6.");
        System.out.println("Nombre: Juan Pérez\n\nEdad: 30 años\n\nDireccion: \"Calle Falsa 123\"\n");

        System.out.println();
        System.out.println("########");
        System.out.println("punto 8.");
        
        System.out.println("Ingrese el primer numero entero: ");
        int numeroX = sc.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int numeroY = sc.nextInt();
        sc.nextLine();//limpio
        //operaciones
        int divisionInt = numeroX / numeroY;
        double divisionDouble = (double)numeroX / numeroY;
        System.out.println("Resultados:");
        System.out.println("divisionInt: " + divisionInt);
        System.out.println("divisionDouble: " + divisionDouble);
        
        System.out.println();
        System.out.println("########");
        System.out.println("punto 9.");
        
        System.out.print("Ingresa tu nombre: ");
        //String nombre = scanner.nextInt(); // ERROR
        String nombreTu = sc.nextLine(); // correccion
        System.out.println("Hola, " + nombreTu);
        
        
        System.out.println();
        System.out.println("########");
        System.out.println("punto 10.");
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);

    }
    
}
