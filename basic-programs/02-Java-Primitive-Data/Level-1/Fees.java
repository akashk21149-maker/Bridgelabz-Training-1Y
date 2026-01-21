import java.util.Scanner;

public class Fees{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double Fee = 125000;
    double Discount = (10*125000)/100;
    double TotalFee = Fee-Discount;

    System.out.println("The discount amount is INR " +Discount+ "and the final discounted fee is INR "+TotalFee);
    input.close();
    }
}