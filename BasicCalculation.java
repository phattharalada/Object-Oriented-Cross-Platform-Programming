import java.util.Scanner;
public class BasicCalculation {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Input n : ");
        double n = input.nextDouble();
        System.out.print("Input operator(+-*/^) : ");
        String o = input.next();
        System.out.print("Input m : ");
        double m = input.nextDouble();
        
        //process
        switch (o) {
            case "+": 
            System.out.print("Answer is: "+(n+m));
            break;
            case "-": 
            System.out.print("Answer is: "+(n-m));
            break;
            case "*":
            System.out.print("Answer is: "+(n*m));
            break;
            case "/":
            System.out.print("Answer is: "+(n/m));
            break;
            case "^": 
            System.out.print("Answer is: "+Math.pow(n,m));
            break;
            default:
            System.out.print("Invalid operator!");
        }
       
        
    }
}
