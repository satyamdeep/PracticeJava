import java.util.Scanner;

// Print the table of a number input by user

public class table {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int res = 0;
         for(int i=1; i<=10; i++){
            res= n*i;
          System.out.println(n + "x" + i + "=" + res);  
         } 
    }
}
