/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class Ejercicio_1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro l1 = new Libro();
        completarDatos(l1, leer);
        mostrarDatos(l1);
    }
    
    public static void completarDatos (Libro l1, Scanner leer){
        System.out.println("Ingrese el titulo del libro: ");
        l1.setNombre(leer.nextLine());
        System.out.println("Ingrese el nombre del autor del libro: ");
        l1.setAutor(leer.nextLine());
        System.out.println("Ingrese el numero de paginas del libro: ");
        l1.setPag(leer.nextInt());
        System.out.println("Ingrese la puntuacion ISBN: ");
        l1.setIsbn(leer.nextInt());
    }
    
    public static void mostrarDatos (Libro l1){
        System.out.println("El titulo del libro es: " + l1.getNombre());
        System.out.println("El nombre del autor del libro es: " + l1.getAutor());
        System.out.println("La cantidad de paginas que tiene el libro es: " + l1.getPag());
        System.out.println("La puntuacion ISBN del mismo es: " + l1.getIsbn());
    }
}
