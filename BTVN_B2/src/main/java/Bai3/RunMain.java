package Bai3;

public class RunMain {
    public static void main(String[] args) {
        for(int trauDung = 0; trauDung <= 20; trauDung++)
            for(int trauNam = 0; trauNam <= 33; trauNam++)
                for(int trauGia = 0; trauGia <=300; trauGia++)
                    if((trauDung + trauNam + trauGia) == 100 && (trauDung*15 + trauNam*9 + trauGia)== 300 ){
                        System.out.println("Trau dung   : " + trauDung);
                        System.out.println("Trau nam    : " + trauNam);
                        System.out.println("Trau gia    : " + trauGia);
                        System.out.println("");
                    }
    }
}
