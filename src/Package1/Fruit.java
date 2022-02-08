
package Package1;
/**
 * Representa la clase Fruit compuestas por algunos atributos y metodos
 * @author Yeiner Hidalgo Molina
 */
import java.util.ArrayList;


public class Fruit {
    //Atributos
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    //Metodos

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

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
