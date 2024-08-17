/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 6652300346
 */
public class IntDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input Integer number: ");
        int a = input.nextInt();
        System.out.println("Input float number: ");
        double b = input.nextDouble();
        
        if (a>b){
            System.out.println(a+" "+b); 
            
        } else{
            System.out.println(b+" "+a);
        }
    }
}
