package Bai4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        do {            
            n = sc.nextInt();
            if(n<=0)
                System.out.print("n = ");
        } while ( n<=0 );
        int count = 0;
        while(n!=0){
           int m = n%10;
           if( m!=0 && m%(sqrt(m)) == 0){
               System.out.print(m + " ");
               count++;
           }
           n = n/10;
        }
        if(count == 0)
            System.out.println("No");
    }
}
