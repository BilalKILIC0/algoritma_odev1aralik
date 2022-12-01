package odev_1aralık;

import java.util.Scanner;

public class bagdasik_sayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Değerleri Aldık
        System.out.println("Lütfen İki Basamaklı Birinci Doğal Sayıyı Giriniz : ");
        int birinci = input.nextInt();

        System.out.println("Lütfen İki Basamaklı İkinci Doğal Sayıyı Giriniz : ");
        int ikinci = input.nextInt();

        //Değişkenleri Tanımladık
        int birinciyuz;
        int ikinciyuz;

        //İşlemleri Yaptırdık
        int birincibir = (birinci % 10);
        int ikincibir = (ikinci % 10);

        birinciyuz = (int) birinci / 10;
        ikinciyuz = (int) ikinci / 10;

        //Eğer (birinciyuz == ikinciyuz) && (birincibir + ikincibir == 10) ise ekrana bağdaş Sayı yazdırdık
        if ((birinciyuz == ikinciyuz) && (birincibir + ikincibir == 10)) {

            System.out.println("Girilen Sayılar Bağdaşık Sayıdır.");
        } //Değilse Baağdaş Sayı Değildir yazdırdık.
        else {
            System.out.println("Girilen Sayılar Bağdaşık Sayı Değildir.");
        }

    }
}
