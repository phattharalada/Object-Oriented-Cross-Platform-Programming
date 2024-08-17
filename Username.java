import java.util.Scanner;
public class Username {
    public static void main(String args[]) {
   Scanner input = new Scanner (System.in);
  //username1
   System.out.print("Username : ");
   String username1 = input.nextLine().trim();
   //username2
   System.out.print("Username : ");
   String username2 = input.nextLine().trim();

if(username1.equals(username2)){
    System.out.println("Success!");
}
else{
    System.out.println("Failed! Please re-enter again!");
}

    }
}