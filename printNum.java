import java.util.Scanner;

//Printing one line multiple times using for loop
public class printNum {
    public static void main(String[] args){
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            System.out.println(i+1 +" Hello world");
        };       
    }
}