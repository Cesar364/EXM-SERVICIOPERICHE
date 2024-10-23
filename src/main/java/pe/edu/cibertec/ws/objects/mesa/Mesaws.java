//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 06:41:12 AM PET 
//


package pe.edu.cibertec.ws.objects.mesa;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mesaws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mesaws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idmesa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="capacidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ubicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mesaws", propOrder = {
    "idmesa",
    "numero",
    "capacidad",
    "ubicacion",
    "estado"
})
public class Mesaws {

    protected int idmesa;
    protected int numero;
    protected int capacidad;
    @XmlElement(required = true)
    protected String ubicacion;
    protected boolean estado;

    /**
     * Obtiene el valor de la propiedad idmesa.
     * 
     */
    public int getIdmesa() {
        return idmesa;
    }

    /**
     * Define el valor de la propiedad idmesa.
     * 
     */
    public void setIdmesa(int value) {
        this.idmesa = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidad.
     */


    /**
     * Define el valor de la propiedad capacidad.
     * 
     */
    public void setCapacidad(int value) {
        this.capacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(boolean value) {
        this.estado = value;
    }

}
