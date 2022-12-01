package odev_1aralık;

import java.util.Scanner;

public class mukemmel_sayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Verileri Aldık
        System.out.println("Lütfen Bir Sayı Giriniz :");
        int girilen = input.nextInt();

        //Değişkenlerimizi Tanımladık
        int toplam = 0;
        int esitle = girilen;

        //For döngüsü ile girilen değere kadar i 'yi Artırdık
        for (int i = 1; i < girilen; i++) {

            //Eğer esitle i 'ye bölümünden kalan sıfır ise i 'yi toplama ekle
            if (esitle % i == 0) {
                toplam += i;
            }
        }

        //Eğer Girilen Eşitse Toplama Mükemmel Sayı Yazdık
        if (girilen == toplam) {
            System.out.println("Girdiğiniz Sayı Mühemmel (KUSURSUZ) Sayıdır.");
        } //Değilse Ekrana Mükemmel Sayı Değildir Yazdık
        else {
            System.out.println("Girdiğiniz Sayı Mükemmel (KUSURSUZ) Sayı Değildir.");
        }

    }

}
