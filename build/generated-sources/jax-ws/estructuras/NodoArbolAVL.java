
package estructuras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nodoArbolAVL complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nodoArbolAVL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hijoder" type="{http://estructuras/}nodoArbolAVL" minOccurs="0"/>
 *         &lt;element name="hijoizq" type="{http://estructuras/}nodoArbolAVL" minOccurs="0"/>
 *         &lt;element name="padre" type="{http://estructuras/}nodoArbolAVL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodoArbolAVL", propOrder = {
    "hijoder",
    "hijoizq",
    "padre"
})
public class NodoArbolAVL {

    protected NodoArbolAVL hijoder;
    protected NodoArbolAVL hijoizq;
    protected NodoArbolAVL padre;

    /**
     * Obtiene el valor de la propiedad hijoder.
     * 
     * @return
     *     possible object is
     *     {@link NodoArbolAVL }
     *     
     */
    public NodoArbolAVL getHijoder() {
        return hijoder;
    }

    /**
     * Define el valor de la propiedad hijoder.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoArbolAVL }
     *     
     */
    public void setHijoder(NodoArbolAVL value) {
        this.hijoder = value;
    }

    /**
     * Obtiene el valor de la propiedad hijoizq.
     * 
     * @return
     *     possible object is
     *     {@link NodoArbolAVL }
     *     
     */
    public NodoArbolAVL getHijoizq() {
        return hijoizq;
    }

    /**
     * Define el valor de la propiedad hijoizq.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoArbolAVL }
     *     
     */
    public void setHijoizq(NodoArbolAVL value) {
        this.hijoizq = value;
    }

    /**
     * Obtiene el valor de la propiedad padre.
     * 
     * @return
     *     possible object is
     *     {@link NodoArbolAVL }
     *     
     */
    public NodoArbolAVL getPadre() {
        return padre;
    }

    /**
     * Define el valor de la propiedad padre.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoArbolAVL }
     *     
     */
    public void setPadre(NodoArbolAVL value) {
        this.padre = value;
    }

}
