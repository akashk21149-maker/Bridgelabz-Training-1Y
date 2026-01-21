import java.util.Scanner;

public class ProfitAndLoss{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int CP = 129;
    int SP = 191;
    int Profit = SP-CP;
    double Profitpercentage = (Profit*100)/CP;

    System.out.println("Profit :"+Profit+"with Profitpercentage :"+Profitpercentage);
    input.close();
    }
}