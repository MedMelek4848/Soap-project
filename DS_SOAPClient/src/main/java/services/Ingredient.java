
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ingredient complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ingredient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeIngredient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomIngredient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="uniteMesure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingredient", propOrder = {
    "codeIngredient",
    "nomIngredient",
    "quantite",
    "uniteMesure"
})
public class Ingredient {

    protected String codeIngredient;
    protected String nomIngredient;
    protected double quantite;
    protected String uniteMesure;

    /**
     * Obtient la valeur de la propri�t� codeIngredient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeIngredient() {
        return codeIngredient;
    }

    /**
     * D�finit la valeur de la propri�t� codeIngredient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeIngredient(String value) {
        this.codeIngredient = value;
    }

    /**
     * Obtient la valeur de la propri�t� nomIngredient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomIngredient() {
        return nomIngredient;
    }

    /**
     * D�finit la valeur de la propri�t� nomIngredient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomIngredient(String value) {
        this.nomIngredient = value;
    }

    /**
     * Obtient la valeur de la propri�t� quantite.
     * 
     */
    public double getQuantite() {
        return quantite;
    }

    /**
     * D�finit la valeur de la propri�t� quantite.
     * 
     */
    public void setQuantite(double value) {
        this.quantite = value;
    }

    /**
     * Obtient la valeur de la propri�t� uniteMesure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniteMesure() {
        return uniteMesure;
    }

    /**
     * D�finit la valeur de la propri�t� uniteMesure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniteMesure(String value) {
        this.uniteMesure = value;
    }

}
