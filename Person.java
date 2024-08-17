/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6652300346
 */
class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        System.out.println("Invoke Person(String name, String address)");
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Person[name=%s,address=%s]",name,address);
    }
    public static void main(String[] args) {
        Person n = new Person("ps", "303");
        System.out.println(n);
    }
}
