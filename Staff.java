/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6652300346
 */
class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address); //call Person(String,String) constructor
        this.school = school;
        this.pay = pay;
        System.out.println("Invoke Staff(String name, String address, String school, double pay)");
    }

    public String getSchool() {
        return school;
    }
    public double getPay(){
        return pay;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    @Override
    public String toString(){
        return String.format("Staff[%s,school=%s,pay=%.2f]",super.toString(),school,pay);
    }
    public static void main(String[] args) {
        Staff m = new Staff("phattharalada","303","PIM",200.0);
        System.out.println(m);
    }
}
