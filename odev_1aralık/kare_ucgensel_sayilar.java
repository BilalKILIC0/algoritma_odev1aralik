package odev_1aralık;

import java.util.Scanner;

public class kare_ucgensel_sayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısını Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Değişkenleri tanımladık
        int k0 = 0, k1 = 1;

        //İlk Terimi 1 ' e eşit olduğu için ekrana yazdırdık.
        System.out.printf(k1 + " ");

        //Terim Sayısına kadar Tüm k2 değerlerini hesaplattık
        for (int i = 1; i <= terim; i++) {

            int k2;
            //K2 'yi hesaplatıp yazdırdık
            k2 = 34 * k1 - k0 + 2;
            System.out.printf(k2 + " ");
            //Atama Yaptık k0 'ı k1 eşitledik , k1 'i de k2 'ye eşitledik . Böylece her bir terim ka sayıları artııldı
            k0 = k1;
            k1 = k2;
        }

    }

}
