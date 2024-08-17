/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 6652300346
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("input integer number: ");
        int number = input.nextInt();
        
        if(number%2==0) System.out.println("Even");
        else if (number%2!=0) System.out.println("Odd");
    }
}
