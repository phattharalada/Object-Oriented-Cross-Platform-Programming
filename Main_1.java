/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6652300346
 */
public class Main_1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        car.startEngine();
        System.out.println("Car has " + car.getNumberOfWheels() + " wheels");
        car.stopEngine();
        motorcycle.startEngine();
        System.out.println("Motorcycle has " + motorcycle.getNumberOfWheels() + " wheels");
        motorcycle.stopEngine();
    }

}
