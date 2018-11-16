package guessing;

import java.io.*;

public class Guessing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Correct Answer");
        int correct = Integer.parseInt(br.readLine());

        System.out.println("Good Luck\n");
            
        
        int num;

        do {
            System.out.println("Enter your guess number:");
            num = Integer.parseInt(br.readLine());
            if (num < correct) {
                if(num % 2==0){
                    System.out.println("The Number is Even. Go Higher");}
                else{
                    System.out.println("The Number is Odd. Go Higher");}
                

            } else if (num > correct) {
                 if(num % 2==0){
                    System.out.println("The Number is Even. Go Lower");}
                else{
                    System.out.println("The number is Odd. Go Lower");}

            } else if (num == correct) {
                System.out.println("You Got The Correct Answer Congratulations!");

            } else {
                System.out.println("Invalid Input");

            }
        } while (num != correct);

    }

}
