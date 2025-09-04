import java.util.Scanner;

public class Carry {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int countx=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
            else if(s.charAt(i)=='b'){
                countx+=count;
            }
        }
        System.out.print(countx);
    }
}
//carry forward method