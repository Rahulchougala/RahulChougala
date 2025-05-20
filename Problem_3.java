package TEST;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        
        if (a % 2 == 0) {
            a -= 1;
        }

       
        for (int i = 1; i <= 2 * a - 1; i += 2) {
            System.out.print(i);
            if (i < 2 * a - 1) {
                System.out.print(", ");
            }
        }
    }
}

