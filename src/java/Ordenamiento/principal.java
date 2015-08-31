/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

/**
 *
 * @author danielvega
 */
public class principal {
     public static void main(String[] args) {
     
         Algoritmosdeordenamiento alg = new Algoritmosdeordenamiento();
         
         int a[] = {5,6,3,44,22,1};
         System.out.println("Arreglo original");
         alg.mostrarArreglo(a);
         System.out.println("Arreglo ordenado version1");
         alg.burbuja(a);
         alg.mostrarArreglo(a);
         System.out.println("Arreglo ordenado version2");
         alg.burbuja2(a);
         alg.mostrarArreglo(a);
         
         
     
     
     }
}
