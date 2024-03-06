/**
 * ageCheck Practice using if else
 */
import java.util.*;

public class ageCheck {

    public static void main(String[] args) {
        System.out.println("Enter your age:");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<18) {
            System.out.println("You are Not Adult.");
        }

        else if (age<60) {
            System.out.println("You are Adult.");
        }

        else{
            System.out.println("You are Old.");
        }
    
    }
}