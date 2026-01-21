import java.util.Scanner;

public class PenDivide{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int pens = 14;
    int Students = 3;
    int Quantity = 14/3;
    int Remainingpens = 14%3;

    System.out.println("The pen per student is "+Quantity+" and the remaining pen not distributed is "+Remainingpens);
    }
}
