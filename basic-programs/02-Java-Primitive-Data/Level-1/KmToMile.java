import java.util.Scanner;

public class KmToMile{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the distance :");
    int Km = input.nextInt();

    System.out.print("miles : ");
    double miles = Km*1.6;

    System.out.println(miles);
    input.close();
    }
}