
import java.util.Scanner;

public class newFun {
    //1. Print a given name in function.
    // public static void myFun(String name){
    // System.out.println(name);
    // return;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your name:");
    // String name = sc.nextLine();

    // myFun("Your name is: " + name);
    // }

    // 2. Make a function to add 2 numbers and return the sum.
    // public static int sumFun(int a, int b){
    // int sum = a + b;
    // return sum;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter value of a:");
    // int a = sc.nextInt();
    // System.out.println("Enter value of b:");
    // int b = sc.nextInt();

    // int sum = sumFun(a, b);

    // System.out.println("Sum of a and b is: " + sum);
    // }

    // 3. Make a function to multiply 2 numbers and return the product.
    // public static int multiplyFun(int a, int b){
    // int product = a * b;
    // return product;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter value of a:");
    // int a = sc.nextInt();
    // System.out.println("Enter value of b:");
    // int b = sc.nextInt();

    // int product = multiplyFun(a, b);

    // System.out.println("Product of a and b is: " + product);
    // }

    // 4. Find the factorial of a number.
    public static void factorialFun(int n) {
        if (n<1) {
            System.out.println("Enter a valid number.");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();

        factorialFun(n);
    }
}
