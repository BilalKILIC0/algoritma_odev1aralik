package odev_1aralık;

import java.util.Scanner;

public class dost_sayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan N ve M Sayılarını aldık
        System.out.println("Lütfen Bir M Sayısı Giriniz :");
        int m = input.nextInt();

        System.out.println("Lütfen Bir N Sayısı Giriniz :");
        int n = input.nextInt();

        //Değişkenleri tanımladık
        int toplamM = 0;
        int toplamN = 0;

        //m 'e kadar kontrol ettik
        for (int i = 1; i < m; i++) {

            //Tam Bölenlerini Hesaplattık
            if (m % i == 0) {

                //ToplamM 'e Ekledik
                toplamM += i;
            }
        }
        //n 'ye Kadar Kontrol ettik
        for (int j = 1; j < n; j++) {

            //Tam Bölenleri Hesaplattık
            if (n % j == 0) {

                //ToplamN 'e Ekledik
                toplamN += j;
            }
        }

        //Eğer toplamN eşitse n 'e Ve ToplamN Eşitse M 'e Girilen Sayı Dost Sayıdır Yazdır
        if (toplamM == n && toplamN == m) {
            System.out.println("Girilen Sayılar Dost Sayılardır.");

        } //Eşit Değilse Girilen Sayı Dost Sayı Değildir.
        else {
            System.out.println("Girilen Sayılar Dost Sayı Değildir.");
        }
    }
}
