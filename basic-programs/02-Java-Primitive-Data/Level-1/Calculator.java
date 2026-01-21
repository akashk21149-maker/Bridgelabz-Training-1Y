import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number :");
    int firstnum = input.nextInt();

    System.out.print("Enter the second number :");
    int secondnum = input.nextInt();

    int Add = firstnum+secondnum;
    int subtraction = firstnum-secondnum;
    int Multiply = firstnum*secondnum;
    int divide = firstnum/secondnum;

    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+firstnum+" and "+secondnum+" is " +Add+ "," +subtraction+ "," +Multiply+ "," +divide);
    input.close();

    }
}

