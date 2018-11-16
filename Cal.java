/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;
 import java.util.Scanner;
/**
 *
 * @author cc2_1h-36
 */
public class Cal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bk = new Scanner(System.in);

        System.out.println("Enter First number: ");
        double num1 = bk.nextDouble();

        System.out.println("Enter Second number: ");
        double num2 = bk.nextDouble();

        System.out.println("Enter Operator: ");
        String aw = bk.nextLine();
        String operation = bk.nextLine();

        if (operation.contains(aw)) {

            if ((operation.equals("+")) || (operation.equalsIgnoreCase("Add"))) {
                System.out.println("Your answer is: " + (num1 + num2));
            } else if ((operation.equals("-")) || (operation.equalsIgnoreCase("Subtract"))) {
                System.out.println("Your answer is: " + (num1 - num2));
            } else if ((operation.equals("*")) || (operation.equalsIgnoreCase("Multiply"))) {
                System.out.println("Your answer is: " + (num1 * num2));
            } else if ((operation.equals("/")) || (operation.equalsIgnoreCase("Divide"))) {
                System.out.println("Your answer is: " + (num1 / num2));
            } else if ((operation.equals("%")) || (operation.equalsIgnoreCase("Modulo"))) {
                System.out.println("Your answer is: " + (num1 % num2));
            } else if (aw.isEmpty()) {
                System.out.println("No match");
            } else {
                System.out.println("Bye");
            }
        }

    }

}
