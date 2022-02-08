
package Package1;

public class Vehicle {
    //Atributos
    public String fuelType ;
    public float hight ;
    public float length;
    public float weight;
    private boolean cargoCapacity;
    protected int passengerNumber;
    //Metodos

    public Vehicle(String fuelType, float hight, float length, float weight, boolean cargoCapacity, int passengerNumber) {
        this.fuelType = fuelType;
        this.hight = hight;
        this.length = length;
        this.weight = weight;
        this.cargoCapacity = cargoCapacity;
        this.passengerNumber = passengerNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(boolean cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
    
    
    
}
