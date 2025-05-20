package controller;

import java.util.Scanner;

public class MenuController {
    public void scan (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt(); // Leer un número entero desde la consola

        System.out.println("El número ingresado es: " + numero);

        scanner.nextLine();
    }
}
