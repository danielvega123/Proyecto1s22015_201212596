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
public class Algoritmosdeordenamiento {
    int i,j,temporal,pasadas;

    public Algoritmosdeordenamiento() {
    i=j=temporal =0;
       
    }
    
    //metodo de burbuja version 1 
    public void burbuja(int [] arreglo){
        pasadas = 0;
        for(i=0;i<arreglo.length;i++){
            for(j=i+1;j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){
                    temporal =arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("termino en" + pasadas + "pasadas");
        
    }
    //metodo de burbuja version 2
    public void burbuja2(int [] arreglo){
        pasadas = 0;
         for(i=1;i<arreglo.length;i++){
            for(j=0;j<arreglo.length - 1;j++){
                if(arreglo[j]>arreglo[j+1]){
                    temporal =arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("termino en" + pasadas + "pasadas"); 
    }
    
    //Mostrar los datos del vector
    public void mostrarArreglo(int [] arreglo){
        int k;
        for(k=0;k<arreglo.length;k++){
            System.out.println("["+arreglo[k]+"]");
        }
        System.out.println();
    }
    
}
