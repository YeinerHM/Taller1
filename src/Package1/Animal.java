
package Package1;
/**
 * Representa la clase Animal compuestas por algunos atributos y metodos
 * @author Yeiner Hidalgo Molina
 */
import java.util.ArrayList;

public class Animal {
    //Atributos
    public ArrayList<String> colors;
    private String foodType;
    public String sound;
    public float hight;
    public float weight;
    protected ArrayList<String> reproductionType ;
    //Metodos

    public Animal(ArrayList<String> colors, String foodType, String sound, float hight, float weight, ArrayList<String> reproductionType) {
        this.colors = colors;
        this.foodType = foodType;
        this.sound = sound;
        this.hight = hight;
        this.weight = weight;
        this.reproductionType = reproductionType;
    }

    public ArrayList<String> getColors() {
        return colors;
    }
    /**
     * Muestra el parametro colors
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public String getFoodType() {
        return foodType;
    }
    /**
     * Muestra el parametro foodType
     * @param foodType
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getSound() {
        return sound;
    }
    /**
     * Muestra el parametro sound
     * @param sound
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    public float getHight() {
        return hight;
    }
    /**
     * Muestra el parametro hight
     * @param hight
     */
    public void setHight(float hight) {
        this.hight = hight;
    }

    public float getWeight() {
        return weight;
    }
    /**
     * Muestra el parametro weight
     * @param weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public ArrayList<String> getReproductionType() {
        return reproductionType;
    }
    /**
     * Muestra el parametro reproductionType
     * @param reproductionType
     */
    public void setReproductionType(ArrayList<String> reproductionType) {
        this.reproductionType = reproductionType;
    }
    
    

}
