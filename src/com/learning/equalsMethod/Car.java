package com.learning.equalsMethod;

public class Car {
    private String color;
    private  int price;

    public Car(String color, int price) {
        this.color = color;
        this.price = price;
    }public Car(){
        this.color="grey";
        this.price=10000;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {         // we modify this mmethod according to our requirements
        Car c= (Car) obj;
        return this.color.equals(c.getColor())&&this.price==c.getPrice()?true:false;
    }

    @Override
    public int hashCode() {
        return this.color.hashCode()+new Integer(this.price).hashCode();
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
