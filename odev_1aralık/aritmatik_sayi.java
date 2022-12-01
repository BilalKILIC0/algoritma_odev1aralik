package odev_1aralık;

import java.util.Scanner;

public class aritmatik_sayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Değerleri Aldık
        System.out.println("Lütfen Bir Tam Sayı Giriniz :");
        int girilen = input.nextInt();

        //Değişkenleri tanımladık
        int sayac = 0;
        double aritmatik;
        int toplam = 0;

        //For Döngüsünü Girilen Sayıya Kadar dönderdik
        for (int i = 1; i <= girilen; i++) {

            //Girilen sayıyı i tam bölüyorsa sayacı 1 artırdık ve toplama ekledik i Sayısını
            if (girilen % i == 0) {

                sayac++;
                toplam += i;

            }
        }

        //Aritmatiki double olarak ayarladık
        aritmatik = (double) toplam / sayac;

        //Double aritmatik int aritmatiğe eşitse ekrana aritmatik Sayı yazdırdık
        if (aritmatik == (int) aritmatik) {
            System.out.println("Girdiğiniz Sayı Aritmatik Sayıdır.");

        } //Değilse Aritmatik sayı değildir yazdırdık
        else {

            System.out.println("Girilen Sayı Aritmatik Sayı Değildir.");
        }
    }

}
