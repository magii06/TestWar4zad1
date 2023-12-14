package bg.smg;
import java.util.*;
public class Jacket extends Clothes implements Comparable<Jacket>{
    private String brand;
    private String season;
    private double price;

    public Jacket(String brand, String season, double price) {
        this.brand = brand;
        this.season = season;
        this.price = price;
    }
    public Jacket() {
        this.brand = " ";
        this.season = " ";
        this.price = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int compareTo(Jacket other){
        return Double.compare(this.price,other.price);
    }

    @Override
    public void sell(){
        System.out.println("Jacket was sold at a price of:" + getPrice());
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "brand='" + brand + '\'' +
                ", season='" + season + '\'' +
                ", price=" + price +
                '}';
    }
}
