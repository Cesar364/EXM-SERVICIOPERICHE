//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 06:34:06 AM PET 
//


package pe.edu.cibertec.ws.objects.platos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plato" type="{http://www.cibertec.edu.pe/ws/objects/platos}platosws"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plato"
})
@XmlRootElement(name = "postPlatoRequest")
public class PostPlatoRequest {

    @XmlElement(required = true)
    protected Platosws plato;

    /**
     * Obtiene el valor de la propiedad plato.
     * 
     * @return
     *     possible object is
     *     {@link Platosws }
     *     
     */
    public Platosws getPlato() {
        return plato;
    }

    /**
     * Define el valor de la propiedad plato.
     * 
     * @param value
     *     allowed object is
     *     {@link Platosws }
     *     
     */
    public void setPlato(Platosws value) {
        this.plato = value;
    }

}
