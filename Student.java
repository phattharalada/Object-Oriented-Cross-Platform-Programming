/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6652300346
 */
class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
        System.out.println("Invoke Student(String name, String address, String program, int year, double fee)");
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear(){
        return year;
    }
    public double getFee(){
        return fee;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    
    @Override
    public String toString(){
        return String.format("Student[%s,program=%s,year=%d,fee=%.2f]",super.toString(),program,year,fee);
    }
    
    public static void main(String[] args) {
        Student w = new Student("Phattharalada","303","Cai",2004,3.24);
        System.out.println(w);
    }
}
