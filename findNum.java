
//Take an array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.Scanner;

public class findNum {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int score[] = new int[size];

        //Input 
        System.out.println("Enter the value of array:");
        for(int i=0; i<size; i++) {
            score[i] = sc.nextInt();
        }

        System.out.println("find number");
        int x = sc.nextInt();
        //Output
        for(int i=0; i<score.length;i++){
            if(score[i]==x) {
                System.out.println("x fount at index: " + i);
            }          
        }
       
    }
    
}
