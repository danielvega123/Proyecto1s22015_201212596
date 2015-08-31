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
public class NewClass {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ListaBuses list = new ListaBuses();
       int opcion=0,elemento;
       do{
           try{
               opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un nodo al inicio\n"
                             + "2.Agregar un nodo al Final\n" 
                             + "3.Mostrar la lista de inicio a fin\n"
                             + "4. Mostrar la lista de fin a inicio\n"
                             + "5.Eliminar un nodo del inicio\n"
                             + "6. Eliminar un nodo del fin\n"
                             + "7. Salir\n"
                            + "Que deseas Hacer","Menu de Opciones",
                            JOptionPane.INFORMATION_MESSAGE));
               
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el elmento del nodo", "Agregando Nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE));                       
                        list.agregarAlInicio(elemento);
                        break;
                    case 2:
                         elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el elmento del nodo", "Agregando Nodo al final", JOptionPane.INFORMATION_MESSAGE));        
                         list.agregarAlFinal(elemento);
                          break;
                    case 3:
                        if(!list.estaVacia()){
                            list.mostrarlistainicifin();
                        }else{
                            JOptionPane.showMessageDialog(null," No hay nodos aun",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!list.estaVacia()){
                            list.mostrarlistafininicio();
                        }else{
                            JOptionPane.showMessageDialog(null," No hay nodos aun",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!list.estaVacia()){
                         elemento  =   list.eliminardelInicio();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es:" + elemento,
                                    "Eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                             JOptionPane.showMessageDialog(null," No hay nodos aun",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        
                        }
                        break;
                    case 6:
                        if(!list.estaVacia()){
                         elemento  =   list.eliminardelFinal();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es:" + elemento,
                                    "Eliminando nodo del final", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                             JOptionPane.showMessageDialog(null," No hay nodos aun",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
                                "Fiin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no esta en la lista",
                                "Incorreto", JOptionPane.INFORMATION_MESSAGE);
                        
                }
           }catch(NumberFormatException n){
               JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
           }  
        
    }while(opcion!=7);
}
}
