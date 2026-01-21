import java.util.Scanner;

public class KmToMiles{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double Distance = 10.8;

    System.out.print("miles : ");
    double miles = Distance*1.6;

    System.out.println(miles);
    input.close();
    }
}