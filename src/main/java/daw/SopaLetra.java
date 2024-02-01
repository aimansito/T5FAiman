/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author aiman
 */
public class SopaLetra {
    private int fila = 6;
    private int columna = 6;
    private char[][] letras;
    
    public SopaLetra() {
        this.letras = new char[fila][columna];
        for(int i = 0;i<letras.length;i++){
            for(int j = 0;j<letras[i].length;j++){
                letras[i][j] = RandomStringUtils.randomAlphabetic(1).charAt(0);
            }
        }
    }
    
    public char[][] colocarPalabraHorizontal(String palabra){
        for(int i = 0;i<letras.length;i++){
            for(int j = 0;j<letras[i].length;j++){
                letras[i][j] = palabra.charAt(i);
            }
        }
        return letras;
    }
    public void mostrarSopa(){
         for(int i = 0;i<letras.length;i++){
            for(int j = 0;j<letras[i].length;j++){
                System.out.println(letras[i][j]);
            }
        }
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<letras.length;i++){
            System.out.println(" ");
            for(int j = 0;j<letras[i].length;j++){
                System.out.print("|"+letras[i][j]);
            }
        }
        return sb.toString();
    }
    
    
}
