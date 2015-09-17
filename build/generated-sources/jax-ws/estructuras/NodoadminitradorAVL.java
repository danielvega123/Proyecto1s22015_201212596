
package estructuras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nodoadminitradorAVL complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nodoadminitradorAVL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hijoder" type="{http://estructuras/}nodoadminitradorAVL" minOccurs="0"/>
 *         &lt;element name="hijoizq" type="{http://estructuras/}nodoadminitradorAVL" minOccurs="0"/>
 *         &lt;element name="raiz" type="{http://estructuras/}nodoadminitradorAVL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodoadminitradorAVL", propOrder = {
    "hijoder",
    "hijoizq",
    "raiz"
})
public class NodoadminitradorAVL {

    protected NodoadminitradorAVL hijoder;
    protected NodoadminitradorAVL hijoizq;
    protected NodoadminitradorAVL raiz;

    /**
     * Obtiene el valor de la propiedad hijoder.
     * 
     * @return
     *     possible object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public NodoadminitradorAVL getHijoder() {
        return hijoder;
    }

    /**
     * Define el valor de la propiedad hijoder.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public void setHijoder(NodoadminitradorAVL value) {
        this.hijoder = value;
    }

    /**
     * Obtiene el valor de la propiedad hijoizq.
     * 
     * @return
     *     possible object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public NodoadminitradorAVL getHijoizq() {
        return hijoizq;
    }

    /**
     * Define el valor de la propiedad hijoizq.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public void setHijoizq(NodoadminitradorAVL value) {
        this.hijoizq = value;
    }

    /**
     * Obtiene el valor de la propiedad raiz.
     * 
     * @return
     *     possible object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public NodoadminitradorAVL getRaiz() {
        return raiz;
    }

    /**
     * Define el valor de la propiedad raiz.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoadminitradorAVL }
     *     
     */
    public void setRaiz(NodoadminitradorAVL value) {
        this.raiz = value;
    }

}
