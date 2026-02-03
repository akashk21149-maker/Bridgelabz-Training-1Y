package level1;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] age = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter the age of students :");
            age[i] = input.nextInt();
        }
        for(int i=0;i<10;i++) {
            if (age[i] >= 18) {
                System.out.println("Eligible");
            } else {
                System.out.println("not eligible");
            }
        }

    }
}
