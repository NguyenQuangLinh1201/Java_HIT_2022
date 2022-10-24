package Bai2;

import java.util.Scanner;
import java.util.Arrays;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int [4];
        for(int i=0;i<4;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<3;i++)
            for(int j=i+1;j<4;j++)
                if(a[i]<a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
        int count = 0;
        for(int i=1;i<4;i++){
            if(a[i]<a[0]){
                System.out.println(a[i]);
                count++;
                break;
            }
        }
        if(count == 0)
            System.out.println("Khong ton tai so lon thu 2");
    }
}
