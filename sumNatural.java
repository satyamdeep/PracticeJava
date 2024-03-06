//Print the sum of n natual numbers.

import java.util.Scanner;

public class sumNatural {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;            
        }
        System.out.println("Sum of total is "+sum);
    }
}
