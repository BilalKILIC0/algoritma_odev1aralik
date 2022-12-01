package odev_1aralık;

import java.util.Scanner;

public class asal_mukemmel_sayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Giriniz :");
        int girilen = input.nextInt();

        //Değişkenleri tanımladık
        int sayac = 0;
        int a = 0;
        int b = 0;

        //Girilen Sayıya kadar dönderdik
        for (int i = 1; i < girilen; i++) {
            a += 2 ^ i;
            b += 2 ^ (i + 1);
        }

        //B 'nin asal olma durumunu Kontrol Ettik
        for (int j = 2; j < b; j++) {

            if (b % j == 0) {

                sayac++;
            }
        }

        //Sayac 0 ' a eşitse Mükemmel sayıdır
        if (sayac == 0) {
            System.out.println("Girdiğiniz Sayı Mükemmel Sayıdır");
        } //Değilse Mükemmel Sayı Değildir.
        else {
            System.out.println("Girdiğiniz Sayı Mükemmel Sayı Değildir.");
        }
    }

}
