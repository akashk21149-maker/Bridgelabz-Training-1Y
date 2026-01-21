import java.util.Scanner;

public class AverageMarks{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int physics = 95;
    int chemistry = 96;
    int maths = 94;

    System.out.print("Average marks :");
    int Average = (physics+chemistry+maths)/3;

    System.out.println(Average);
    input.close();
    }


}