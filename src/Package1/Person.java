
package Package1;

/**
 * Representa la clase persona compuestas por algunos atributos y metodos
 * @author Yeiner Hidalgo Molina
 */
import java.util.Date;


public class Person {
    /**
     * Atributos de la clase persona
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    
    /**
     * Metodo constructor
     * @param name primer parametro de la clase .
     * @param lastName1 primer parametro de la clase persona.
     * @param lastName2 segundo parametro de la clase persona.
     * @param dateBirth tercer parametro de la clase persona.
     * @param height cuarto parametro de la clase persona.
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    /**
     * Modifica el parametro name
     * @return retorna un String de name
     */
    public String getName() {
        return name;
    }
    /**
     * Muestra el parametro name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Modifica el parametro lastName1
     * @return retorna un String de lastName1
     */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * Muestra el parametro lastName
     * @param lastName1 
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Modifica el parametro lastName2
     * @return retorna un String de lastName2
     */
    public String getLastName2() {
        return lastName2;
    }
    /**
     * Muestra el parametrolstName2
     * @param lastName2 
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Modifica el parametro dateBirth
     * @return retorna Date de dateBirth
     */
    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * Muestra el parametro dateBirth
     * @param dateBirth 
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    /**
     * Modifica el parametro height
     * @return retorna un float de height
     */
    public float getHeight() {
        return height;
    }
    /**
     * Muestra el parametro height
     * @param height 
     */
    public void setHeight(float height) {
        this.height = height;
    }
           
}

