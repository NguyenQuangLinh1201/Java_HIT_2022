package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int [n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int dem = 0;
        for(int i=0;i<n-1;i++){
            if(a[i] != (a[i+1]-1)){
                for(int j=1;j<(a[i+1]-a[i]);j++){
                    System.out.print(a[i]+j + " ");
//                    if(a[i] == a[i+1] - 1)
//                        break;
                }
            }
            else{
                dem++;
            }
        }
        if(dem == n-1)
            System.out.print("YES");
    }
}
