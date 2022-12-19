package Homework.hw001;

public class HotDrinksProduct extends Product {

    private int temperature;

    public HotDrinksProduct(String name, String volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrinksProduct [name=" + getName () + ", volume =" + getVolume () + ",temperature=" + temperature + "]";
    }


}
