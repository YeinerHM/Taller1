
package Package1;
/**
 * Representa la clase Vehicle compuestas por algunos atributos y metodos
 * @author Yeiner Hidalgo Molina
 */
public class Vehicle {
    /**
     * Atributos de la Clase Vehicle
     */
    public String fuelType ;
    public float hight ;
    public float length;
    public float weight;
    private boolean cargoCapacity;
    protected int passengerNumber;
    /**
     * Metodo constructor de la clase Vehicle
     * @param fuelType primer parametro de la clase Vehicle.
     * @param hight segundo parametro de la clase Vehicle.
     * @param length tercer parametro de la clase Vehicle.
     * @param weight cuarto parametro de la clase Vehicle.
     * @param cargoCapacity quinto parametro de la clase Vehicle.
     * @param passengerNumber sexto parametro de la clase Vehicle.
     */
    public Vehicle(String fuelType, float hight, float length, float weight, boolean cargoCapacity, int passengerNumber) {
        this.fuelType = fuelType;
        this.hight = hight;
        this.length = length;
        this.weight = weight;
        this.cargoCapacity = cargoCapacity;
        this.passengerNumber = passengerNumber;
    }
    /**
     * Modifica el parametro fuelTYpe
     * @return retorna un String de fuelType
     */
    public String getFuelType() {
        return fuelType;
    }
    /**
     * Muestra el parametro fuelType
     * @param fuelType
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    /**
     * Modifica el parametro hight
     * @return retorna un float de hight
     */
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
    /**
     * Modifica el parametro length
     * @return retorna un float de length
     */
    public float getLength() {
        return length;
    }
    /**
     * Muestra el parametro length
     * @param length
     */
    public void setLength(float length) {
        this.length = length;
    }
    /**
     * Modifica el parametro weight
     * @return retorna un float de weight
     */
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
    /**
     * Modifica el parametro cargoCapacity
     * @return retorna un boolean de cargoCapacity
     */
    public boolean gettCargoCapacity() {
        return cargoCapacity;
    }
    /**
     * Muestra el parametro cargoCapacity
     * @param cargoCapacity
     */
    public void setCargoCapacity(boolean cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    /**
     * Modifica el parametro passengerNumber
     * @return retorna un int de passengerNumber
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }
    /**
     * Muestra el parametro passengerNumber
     * @param passengerNumber
     */
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
    
    
    
}
