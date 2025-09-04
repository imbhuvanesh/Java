import java.util.Scanner;
public class Twopointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tar = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        int sum = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            temp = arr[start] + arr[end];
            if (temp == tar) {
                System.out.print(arr[start] + " "+ arr[end]);
                break;
            } else if (tar < sum) {
                start++;
            } else {
                end--;
            }
        }

    }
}
//two pointer approaches