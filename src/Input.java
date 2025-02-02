import java.util.Scanner;

public class Input{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //usefule class for scanning (to be able to get input from user)

        System.out.println("Hello, please enter your name: "); 
        String name; 
        name = scanner.nextLine(); 

        System.out.println("Please enter your age: "); 
        int age; 
        age = scanner.nextInt(); 

        System.out.println("Please enter your weight: "); 
        double bw; 
        bw = scanner.nextDouble(); 

        System.out.println("Are you a smoker? Please enter true or false: "); 
        boolean smk; 
        smk = scanner.nextBoolean(); 

        System.out.println("Your information --> Name: " + name + " Age: " + age + " Your weight: " + bw + " Your smoker status (true/false): " + smk); 


    }
}
