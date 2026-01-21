import java.util.Scanner;

public class BirthYear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the birth year : ");
        int birthyear = input.nextInt();

        int currentyear = 2024;
        
        System.out.print("Age :");
        int Age = currentyear-birthyear;

        System.out.println(Age);
        input.close();

    }
}