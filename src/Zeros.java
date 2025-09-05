import java.util.Scanner;

public class Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        // input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // move zeroes
        int index = 0; // pointer for placing non-zero numbers

        // copy non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // fill the rest with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // print final array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//zero