package Bai4;

import java.util.Scanner;

public class RunMain {
    public static boolean checkSNT(int n) {
        if(n<2)
            return false;
        else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
    public static boolean checkTungSo(int n) {
        while(n!=0){
            int m = n%10;
            if(!checkSNT(m))
                return false;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[]a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int dem = 0;
        for(int i=0;i<n;i++){
            int b = a[i];
            if(checkSNT(b)){
                if(checkTungSo(b)){
                    System.out.print(a[i]+" ");
                    dem++;
                }
            }
        }
        if(dem == 0)
            System.out.println("NO");
    }
}
