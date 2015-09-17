/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author danielvega
 */
public class ListaBuses {
    public NodoBus inicio,fin;
 int i,j,temporal,pasadas;

    public ListaBuses() {
        inicio = fin = null;    
        i=j=temporal =0;
    }
    
    //metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    
    //agregar nodos al final
    public void agregarAlFinal(int d){
        if(!estaVacia()){
            fin = new NodoBus(d, null, fin);
            fin.ant.sig =fin;
        }else{
            inicio = fin = new NodoBus(d);
        }
    }
    
    //agregar al inicio
      public void agregarAlInicio(int d){
        if(!estaVacia()){
            inicio = new NodoBus(d, inicio, null);
            inicio.sig.ant =inicio;
        }else{
            inicio = fin = new NodoBus(d);
        }
    }
      
    //mostrar la lista de nodos de inicio a fin
       public void mostrarlistainicifin(){
           if(!estaVacia()){
              String datos = "<=>";
              NodoBus auxiliar = inicio;
              while(auxiliar!=null){
                  datos = datos + "(" + auxiliar.dato +")<=>";
                  auxiliar = auxiliar.sig;
                  JOptionPane.showMessageDialog(null, datos, "Mostrando lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
              }
           }
       }
       
       //mostrar la lista de fin a inicio
       public void mostrarlistafininicio(){
           if(!estaVacia()){
              String datos = "<=>";
              NodoBus auxiliar = fin;
              while(auxiliar!=null){
                  datos = datos + "(" + auxiliar.dato +")->";
                  auxiliar = auxiliar.ant;
                  JOptionPane.showMessageDialog(null, datos, "Mostrando lista de fin a inicio", JOptionPane.INFORMATION_MESSAGE);
              }
           }
       }
     
       //metodo para eliminar del inicio
       public int eliminardelInicio(){
           int elemento = inicio.dato;
           if(inicio == fin){
               inicio=fin=null;
           }else{
               inicio = inicio.sig;
               inicio.ant = null;
           }
           return elemento;
           
           
       }
       
       //metodo para eliminar del final
      public int eliminardelFinal(){
           int elemento = fin.dato;
           if(inicio == fin){
               inicio=fin=null;
           }else{
               fin = fin.ant;
               fin.sig = null;
           }
           return elemento;
           
           
       }
      
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
      String cuerpograpadmin = "digraph A {";

    public String codigograp() {
        
            
              NodoBus auxiliar = fin;
              while(auxiliar!=null){
                  if(auxiliar.ant !=null){
                      cuerpograpadmin = cuerpograpadmin + auxiliar.dato +"->" + auxiliar.ant.dato+"\n";
                        auxiliar = auxiliar.ant;
                  }else{
                      break;
                  }
                  
                 // JOptionPane.showMessageDialog(null,  codigograp(), "Mostrando lista de fin a inicio", JOptionPane.INFORMATION_MESSAGE);
              }
              NodoBus aux2 = inicio;
              while(aux2!=null){
                  if(aux2.sig != null){
                      cuerpograpadmin = cuerpograpadmin + aux2.dato +"->" + aux2.sig.dato+"\n";
                      aux2 = aux2.sig;
                  }else{
                      break;
                  }
                  
                 // JOptionPane.showMessageDialog(null,  codigograp(), "Mostrando lista de fin a inicio", JOptionPane.INFORMATION_MESSAGE);
              }
           

        return cuerpograpadmin + "}";

    }
}
