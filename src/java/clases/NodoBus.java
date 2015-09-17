/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author danielvega
 */
public class NodoBus {
    public int dato;
    NodoBus sig, ant;
    private NodoBus riz;

    public NodoBus(int d) {
        this(d,null,null);
    }
    //Constructor para cuando ya hay nodos
    public NodoBus(int d, NodoBus s, NodoBus a) {
    dato = d;
    sig = s;
    ant = a;
    }

    /**
     * @return the riz
     */
    public NodoBus getRiz() {
        return riz;
    }

    /**
     * @param riz the riz to set
     */
    public void setRiz(NodoBus riz) {
        this.riz = riz;
    }
    
    
    
    
}
