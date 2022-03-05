/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebagithub;
import java.util.Scanner;

/**
 *
 * @author DavidLS
 */
public class PruebaGitHub {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
        System.out.println("Introduce una palabra y te diré si es palíndroma :) ");
        String palabra = Console.ReadLine();
        if (esPalindroma(palabra)) {
           System.out.println("Es palíndroma");
        } else {
            System.out.println("NO es palíndroma");
        }

    static Boolean esPalindroma(String cadena) {
        Console.WriteLine("Función llamada con => " + cadena);
        if (cadena.Length < 2 ) {
            return true;
        }
        Console.WriteLine("Vamos a comparar => " + cadena[0]);
        Console.WriteLine("Con => " + cadena[cadena.Length - 1]);
        if (cadena[0] == cadena[cadena.Length - 1]) {
            return esPalindroma(cadena.Substring(1, cadena.Length - 2));
        }
        return false;
        
        
    }
    }

