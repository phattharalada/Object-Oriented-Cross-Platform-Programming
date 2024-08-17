import java.util.Scanner;
public class Split {
    public static void main(String args[]) {
   Scanner input = new Scanner (System.in);
  
   System.out.print("Input number : ");
   String n = input.nextLine().trim();
   
System.out.print("Output: "+n.replace("-", ""));
    }
}