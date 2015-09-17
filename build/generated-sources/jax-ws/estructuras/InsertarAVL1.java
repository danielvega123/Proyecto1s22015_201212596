
package estructuras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarAVL1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarAVL1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://estructuras/}nodoadminitradorAVL" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://estructuras/}nodoadminitradorAVL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarAVL1", propOrder = {
    "arg0",
    "arg1"
})
public class InsertarAVL1 {

    protected NodoadminitradorAVL arg0;
    protected NodoadminitradorAVL arg1;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public NodoadminitradorAVL getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public void setArg0(NodoadminitradorAVL value) {
        this.arg0 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg1.
     * 
     * @return
     *     possible object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public NodoadminitradorAVL getArg1() {
        return arg1;
    }

    /**
     * Define el valor de la propiedad arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public void setArg1(NodoadminitradorAVL value) {
        this.arg1 = value;
    }

}
