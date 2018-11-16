package OddEven;

import java.io.*;
import java.util.ArrayList;
public class OddEven{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        int arr [] = {3,9,15,20,65,23,18,4,2,14,21};
        System.out.print("ARRAY: ");
        for(int i=0; i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
        System.out.println("");
        System.out.println("EVEN \t ODD");
        int i;
        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
                for (i=0; i<arr.length;i++){
            if(arr[i] %2==0){
                even.add(arr[i]);
            }
            if(arr[i] %2!=0){
                odd.add(arr[i]); 
                
            } 

            }
                for (int x = 0; x<even.size()&&x<odd.size(); x++){
                    System.out.println(even.get(x) +"\t" +odd.get(x));
        }

}
}