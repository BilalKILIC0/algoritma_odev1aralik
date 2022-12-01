package odev_1aralık;

import java.util.Scanner;

public class jhon_wallis_sayisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan Terim Sayısını Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();
        
        //Formülde kullanılacak Değişkenleri tanımladık
        double sag_taraf = 1;
        double pay;
        double toplam;
        
        //Formulün pay ve paydasını hesaplatıyoruz
        for (int i = 1; i <= terim; i++) {

            pay = (4 * i * i);
            sag_taraf = sag_taraf * pay / (pay - 1);

        }
        //Toplamı Hesaplattık
        toplam = 2 * sag_taraf;
        
        //Sonucu Ekrana Yazdırdık.
        System.out.printf("Jhon Wallis Sayısı Toplamı : %.5f\n" ,toplam);

    }
}
