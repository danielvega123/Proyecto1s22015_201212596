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
    private NodoBus inicio,fin;

    public ListaBuses() {
        inicio = fin = null;    
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
                  datos = datos + "(" + auxiliar.dato +")<=>";
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
      
    
}
