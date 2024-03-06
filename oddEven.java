import java.util.Scanner;


//Odd Even 
public class oddEven {
        public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a%2==0) {
            System.out.println(" Number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }
    }
}
