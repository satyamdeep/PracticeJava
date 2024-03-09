import java.util.Scanner;

public class selectionSort {

    // Loop for output array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Value enter by user in array
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();
        // int arr[] = new int[size];       
        // System.out.println("Enter the value of array:");
        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }

        int arr[] = {6,4,1,5,7,3,2};

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array:");
        // Function called
        printArr(arr);
    }
}
