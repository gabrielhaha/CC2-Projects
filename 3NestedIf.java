package nested.pkgif;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your course?");
        String course = sc.nextLine();
        
    if("IT".equalsIgnoreCase(course)){
        
        
        System.out.println("Your course is Bachelor of Science in Information Technology");
        System.out.println("What is your Major?");
        String major = sc.nextLine();
        
        if("net sec".equalsIgnoreCase(major)){
        System.out.println("Your course is: " + course + " Your major is: " + major);
        }
        else if("web dev".equalsIgnoreCase(major)){
        System.out.println("Your course is: " + course + " Your major is: " + major);
        }
        else if("ERP".equalsIgnoreCase(major)){
        System.out.println("Your course is: " + course + " Your major is: " + major);
        }
            else{
            System.out.println("Not a course");
        }   
    }       
        
    if(course.equalsIgnoreCase("CS")){
            
        System.out.println("Your course is Bachelor of Science in Information Technology");
        System.out.println("What is your Major?");
        String major = sc.next();
        
        if (major.equalsIgnoreCase("Mobile Development")){
        System.out.println("Your course is: " + course + " Your major is: " + major);
        }
        else if (major.equalsIgnoreCase("Digital Arts")){
        System.out.println("Your course is: " + course + " Your major is: " + major);
        }
        else if (major.equalsIgnoreCase("Animation")){
        System.out.println("Your course is: " + course + " Your major is: " + major);
        }
        else{
            System.out.println("Not a course");
        }
        
    }
    else if(course.equalsIgnoreCase("BSDA")){
            System.out.println("BSDA");
            
        }
    }
    }
   
        
                
            
        
    
    
