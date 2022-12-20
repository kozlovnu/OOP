package Homework.hw001;

public class HotDrinksProduct extends Product {

    private int temperature;
    

    public HotDrinksProduct(String name, String volume, int price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        
        return "HotDrinkProduct [name=" + getName () + ", volume=" + getVolume() + 
        ", price=" + getPrice() + ", temperature=" + temperature + "]";
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }

    @Override
    public String getVolume() {
        // TODO Auto-generated method stub
        return super.getVolume();
    }

    



}
