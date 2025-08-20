/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author ezequ
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        double division;
        System.out.print("Ingrese el primer numero: ");
        num1 =  Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        num2 =  Integer.parseInt(input.nextLine());
        
        division = (double) num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + division);
    }
}