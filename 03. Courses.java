package courses;

import java.util.Scanner;

public class Courses {

    public static void main(String[] args) {
        Scanner kbk = new Scanner(System.in);
        
        System.out.println("What is your Course?");
        String course = kbk.nextLine();
        
        
        
        if(course.equalsIgnoreCase("IT")){
            System.out.println("What is your Major?");
            String major = kbk.nextLine();
            if(major.equalsIgnoreCase("Web Development")|| (major.equalsIgnoreCase("web dev"))){
                System.out.println("The course is: " + course + " and the Major is: " + major);
            }
            else if (major.equalsIgnoreCase("Network and Security") || (major.equalsIgnoreCase("NetSec"))){
                System.out.println("The course is: " + course + " and the Major is: " + major);
            }
            else if (major.equalsIgnoreCase("erp")|| (major.equalsIgnoreCase("Enterprises Resource Planning"))){
                System.out.println("The course is: " + course + " and the Major is: " + major);
            }
            else{
                System.out.println("Invalid Course");
            }
        }
        
        if(course.equalsIgnoreCase("ComSci")){
            System.out.println("What is your Major?");
            String major = kbk.nextLine();
             if(major.equalsIgnoreCase("Mobile Development")|| (major.equalsIgnoreCase("mob dev"))){
                System.out.println("The course is: " + course + " and the Major is: " + major);
            }
            else if (major.equalsIgnoreCase("Digital Arts")|| (major.equalsIgnoreCase("DS"))){
                System.out.println("The course is: " + course + " and the Major is: " + major);
            }
            else if (major.equalsIgnoreCase("Animation")|| (major.equalsIgnoreCase("ani"))){
                System.out.println("The course is: " + course + " and the Major is: " + major);
            }
            else{
                System.out.println("Invalid course");
            }
        
         }
        
        else if (course.equalsIgnoreCase("BSDA")|| (course.equalsIgnoreCase("bsda"))){
            System.out.println("BSDA ");
            
          
        }
    }
}


