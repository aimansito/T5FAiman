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
    private int fila ;
    private int columna ;
    private char[][] letras;
    
    public SopaLetra(int fila,int columna) {
        this.fila = fila;
        this.columna = columna;
        this.letras = new char[fila][columna];
        for(int i = 0;i<letras.length;i++){
            for(int j = 0;j<letras[i].length;j++){
                letras[i][j] = RandomStringUtils.randomAlphabetic(1).charAt(0);
            }
        }
    }
    
    public void colocarPalabraHorizontal(int fi,int colum,String palabra){
        char letrasPalabra[] = new char[palabra.length()];   
        for(int i = 0;i<letrasPalabra.length;i++){
            letrasPalabra[i]=palabra.charAt(i);
        }
        for(int i = 0;i<letrasPalabra.length;i++){
            try{
                 letras[fi][colum++] = letrasPalabra[i];
            }catch(IndexOutOfBoundsException iobe){
                System.out.println("Está fuera del array");
            }
        }
    }
    //colocarPalabraHorizontalInvertida,
    //que recibe una coordenada de la matriz y un String con la palabra y pone la 
     //palabra horizontalmente, de forma invertida, en la matriz a partir de la coordenada indicada, si se puede.
    public void colocarPalabraHorizontalInvertida(int fi,int colum,String palabra){
        char letrasPalabra[] = new char[palabra.length()];   
        for(int i = 0;i<letrasPalabra.length;i++){
            letrasPalabra[i]=palabra.charAt(i);
        }
        for(int i = 0;i<letrasPalabra.length;i++){
            try{
                 letras[fi][colum--] = letrasPalabra[i];
            }catch(IndexOutOfBoundsException iobe){
                System.out.println("Está fuera del array");
            }
        }
    }
    //colocarPalabraVertical,
    //que recibe una coordenada de la matriz y un String con la palabra y pone 
    //la palabra verticalmente en la matriz a partir de la coordenada indicada, si se puede.
    public void colocarPalabraVertical(int fi,int colum,String palabra){
        char letrasPalabra[] = new char[palabra.length()];   
        for(int i = 0;i<letrasPalabra.length;i++){
            letrasPalabra[i]=palabra.charAt(i);
        }
        for(int i = 0;i<letrasPalabra.length;i++){
            try{
                 letras[fi++][colum] = letrasPalabra[i];
            }catch(IndexOutOfBoundsException iobe){
                System.out.println("Está fuera del array");
            }
        }
    }
    //colocarPalabraVerticalInvertida,
   //que recibe una coordenada de la matriz y un String con la palabra y pone 
   //la palabra verticalmente, de forma invertida, en la matriz a partir de la coordenada indicada, si se puede.
   public void colocarPalabraVerticalInvertida(int fi,int colum,String palabra){
       char letrasPalabra[] = new char[palabra.length()];   
        for(int i = 0;i<letrasPalabra.length;i++){
            letrasPalabra[i]=palabra.charAt(i);
        }
        for(int i = 0;i<letrasPalabra.length;i++){
            try{
                 letras[fi--][colum] = letrasPalabra[i];
            }catch(IndexOutOfBoundsException iobe){
                System.out.println("Está fuera del array");
            }
        }
   }
    public void mostrarSopa(){
        for(int i = 0;i<letras.length;i++){
            for(int j = 0;j<letras[i].length;j++){
                System.out.println(letras[i][j]);
            }
            System.out.println("|");     
        }
    }

    
    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letras.length; i++) {
            System.out.println("");
            for (int j = 0; j < letras[i].length; j++) {
                System.out.print(" | " + letras[i][j]);
            }
        }
        return sb.toString();
    }
    
    
}
