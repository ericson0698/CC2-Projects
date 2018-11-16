package fibo;
import java.util.*;

public class Fibo {
    public static int n;
    public static void main(String[] args) {

        userInput();
        input ();
    }
    public static void userInput(){
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter a Value: ");
        n = sc.nextInt();
    }
    public static void input(){
        
        for(int i=0; i<= n; i++){
            System.out.print("f("+ i +")\t");
         }   
        for(int i= 0; i <= n; i++){
            System.out.println("");
                for(int q=0; q<=i; q++){
            System.out.print("" + f(q)+"\t");
                }
        }
    }
    public static int f(int num){
        if(num ==0){
            return 0;
        }else if(num==1){
            return 1;
        }else{
            return f(num-1)+f(num-2);
        }
    }
}

