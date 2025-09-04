import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int [a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    temp=arr[i];
                }
            }
        }
        System.out.print(temp);
    }
}
//brute force approach