package userandpassword;

import java.util.Scanner;

/**
 *
 * @author M306User
 */
public class UserAndPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.nextLine();

    System.out.println("Enter Password : ");
    String password = input1.nextLine();
    System.out.println("re enter the password");
    String password2 = input1.nextLine();
    

    if (password.equals(password2)) {
        System.out.println("Correct Password!");
   
    }
     else{
        System.out.println("Invalid Password!");
    }
    }
}