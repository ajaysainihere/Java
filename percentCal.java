import java.util.*;

public class percentCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Student Name : ");
        String name = input.nextLine();

        System.out.println("***************************");
        System.out.println("Enter Your Subject Marks Out of 100");

        System.out.print("Subject 1 : ");
        float mark1 = input.nextFloat();

        System.out.print("Subject 2 : ");
        float mark2 = input.nextFloat();

        System.out.print("Subject 3 : ");
        float mark3 = input.nextFloat();

        System.out.print("Subject 4 : ");
        float mark4 = input.nextFloat();
        
        System.out.print("Subject 5 : ");
        float mark5 = input.nextFloat();

        System.out.print("\033[H\033[2J");  
        System.out.flush();  

       System.out.println("Name :  "+name);

       System.out.println("***************************");
       System.out.println("Subject Marks Out of 100");
       System.out.println("Subject 1 = "+mark1);
       System.out.println("Subject 2 = "+mark2);
       System.out.println("Subject 3 = "+mark3);
       System.out.println("Subject 4 = "+mark4);
       System.out.println("Subject 5 = "+mark5);


       float total = mark1 + mark2 + mark3 + mark4 + mark5;

       System.out.println("Total Marks Obtained Out of 100 = "+total);
       
       float percent = (total * 100)/500;

       System.out.println("Total Percentage = "+percent);


    }
    
}
