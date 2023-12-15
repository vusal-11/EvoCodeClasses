package main;

public class Fruit {


    public String name;

    public  double price;
    Fruit(String name,double price){
        this.name=name;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
