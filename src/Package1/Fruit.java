
package Package1;
/**
 * Representa la clase Fruit compuestas por algunos atributos y metodos
 * @author Yeiner Hidalgo Molina
 */
import java.util.ArrayList;


public class Fruit {
    /**
     * Atributos de la clase Fruit
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    /**
     * Metodo constructor de la clase Fruit
     * @param name
     * @param averageWeight
     * @param colors 
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
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
     * Modifica el parametro averageWeight
     * @return retorna un float de averageWeight
     */
    public float getAverageWeight() {
        return averageWeight;
    }
    /**
     * Muestra el parametro averageWeight
     * @param averageWeight
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /**
     * Modifica el parametro colors
     * @return retorna un Arraylist de colors
     */
    public ArrayList<String> getColors() {
        return colors;
    }
    /**
     * Muestra el parametro calors
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
}
