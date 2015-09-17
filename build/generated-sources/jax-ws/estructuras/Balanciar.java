
package estructuras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para balanciar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="balanciar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://estructuras/}nodoArbolAVL" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://estructuras/}nodoArbolAVL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balanciar", propOrder = {
    "arg0",
    "arg1"
})
public class Balanciar {

    protected NodoArbolAVL arg0;
    protected NodoArbolAVL arg1;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link NodoArbolAVL }
     *     
     */
    public NodoArbolAVL getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoArbolAVL }
     *     
     */
    public void setArg0(NodoArbolAVL value) {
        this.arg0 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg1.
     * 
     * @return
     *     possible object is
     *     {@link NodoArbolAVL }
     *     
     */
    public NodoArbolAVL getArg1() {
        return arg1;
    }

    /**
     * Define el valor de la propiedad arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoArbolAVL }
     *     
     */
    public void setArg1(NodoArbolAVL value) {
        this.arg1 = value;
    }

}
