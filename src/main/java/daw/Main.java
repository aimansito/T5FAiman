/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        SopaLetra s1 = new SopaLetra(6,6);
        String palabra = "aiman";
        System.out.println("Apartado A-------------------");
        s1.colocarPalabraHorizontal(5,1,palabra);
        System.out.println(s1.toString());
        System.out.println("Apartado B-------------------");
        s1.colocarPalabraHorizontalInvertida(1,5,palabra);
        System.out.println(s1.toString());
        System.out.println("Apartado C-------------------");
        s1.colocarPalabraVertical(0, 5, palabra);
        System.out.println(s1.toString());
        System.out.println("Apartado D--------------------");
        s1.colocarPalabraVerticalInvertida(5, 0, palabra);
        System.out.println(s1.toString());
    }
}
