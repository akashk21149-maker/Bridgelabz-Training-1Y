import java.util.Scanner;

public class StudentFee{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the fee :");
    double namefee = input.nextDouble();

    System.out.print("Enter the discount percentage:");
    double Discountpercentage = input.nextDouble();

    double Discount = (Discountpercentage*namefee)/100;

    double totalFee = namefee-Discount;

    System.out.println("The discount amount is INR " +Discount+ "and the final discounted fee is INR "+totalFee);
    input.close();
    }
}