
package testpanel.com.buoi3;
//import java.util.Scanner;

public class Buoi3 {

    public static void main(String[] args) {
        //Scanner sc  = new Scanner (System.in);
        int n = new Scanner(System.in).nextInt();
        int keo = 0;
        while(n>0){
            keo+=n;
            n/=2;
        }
        System.out.println(keo);
    }
}
