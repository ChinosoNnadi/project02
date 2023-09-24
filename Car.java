package Project2;
/*
* Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 subclasses: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
* */

public class Car {
    private double carPrice;
    private String color;
   public double calculateSalePrice(double carPrice){
       return carPrice;
   }
}
class Sedan extends Car {
    private int length;
    @Override
    public double calculateSalePrice(double carPrice) {
        if (length<20){
            return carPrice*0.05;
        }else {
            return carPrice*0.1;
        }
    }
}
class Truck extends Car{
    private double weight;
    @Override
    public double calculateSalePrice(double carPrice) {
        if (weight>2000){
            return carPrice*0.1;
        }else {
            return carPrice*0.2;
        }
    }
}
class CarTester{
    public static void main(String[] args) {
        Car [] cars = {new Sedan(), new Truck()};
        for (Car arr : cars){
            System.out.println(arr.calculateSalePrice(1000));
        }
    }
}