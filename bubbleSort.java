import java.util.Scanner;

public class bubbleSort {

    //Loop for output array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Value enter by user in array
        System.out.println("Enter the value of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // int arr[] = {6,4,1,5,7,3,2};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println("Sorted array:");
        //Function called
        printArr(arr);

    }
}
