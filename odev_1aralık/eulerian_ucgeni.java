package odev_1aralık;

import java.util.Scanner;

public class eulerian_ucgeni {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan N ve M değerlerini Aldık
        System.out.println("Lütfen Bir M Sayısı Giriniz :");
        int m = input.nextInt();

        System.out.println("Lütfen Bir N Sayısı Giriniz :");
        int n = input.nextInt();

        //Değişkenleri tanımladık
        double fakislem;
        double toplam;

        //Toplamı Değerlendirdik
        toplam = Math.pow((n + 1), m);

        //İlk For N Sayısına Kadar Dönecek 
        for (int i = 1; i <= n; i++) {

            //Double Faktoriyelleri Tanımladık
            double f1 = 1, f2 = 1, f3 = 1;
            //F1 Faktoriyeli m+1 e Kadar döndü
            for (int k = 1; k <= m + 1; k++) {

                f1 *= k;
            }
            //F2 Faktoriyeli i ' ye Kadar döndü
            for (int k = 1; k <= i; k++) {

                f2 *= k;
            }
            //F3 Faktoriyeli m+1-i ' ye kadar Döndü
            for (int k = 1; k <= m + 1 - i; k++) {

                f3 *= k;
            }

            //Faktoriyel İşlemini Yaptırdık
            fakislem = f1 / (f2 * f3);

            //Formüle göre bulduklarımızı yerine koyduk
            toplam = toplam + Math.pow((-1), i) * fakislem * Math.pow((n + 1 - i), m);
        }

        //Toplamı Ekrana Yazdırdık.
        System.out.printf("Toplamı : %.4f\n", toplam);

    }

}
