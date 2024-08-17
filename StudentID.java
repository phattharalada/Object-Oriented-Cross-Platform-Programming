/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 6652300346
 */
public class StudentID {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input StudentID: ");
        String id =  input.nextLine();
            System.out.println("Your StudentID is "+id);
            System.out.println(id.length());
        if (id.length()==10){
            System.out.println("StudentID is correct");
            
        }else{
            System.out.println("Please try again");
        }
    }
}
