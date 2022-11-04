package Bai1;
import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {            
            n = sc.nextInt();
        } while (n<=1);
        int[]a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int count = 1;
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            if(a[i] == a[i-1]){
                count++;
            }
            else{
                System.out.println(a[i-1] + ":" + count);
                count = 1;
            }
        }
        System.out.println(a[n-1]+":"+count);
    }
}
