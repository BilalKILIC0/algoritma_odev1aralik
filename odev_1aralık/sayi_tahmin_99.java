package odev_1aralık;

import java.util.Scanner;

public class sayi_tahmin_99 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Değişkenleri tanımladık
        int puan = 100;
        int sayac = 0;
        int rastgele_sayi;

        rastgele_sayi = (int) (Math.random() * 98) + 1;  // Rastgele Sayı ürettik 1 - 99 Arası
        
        //Kullanıcıdan Bir tahmin girmesini istedik
        System.out.println("Lütfen Bir Sayı Giriniz (Puanınız 100) :");
        int girilen = input.nextInt();
        
        // tahmin Rastgele sayıya eşit olana kadar döndürdük 
        do {
            if (girilen < rastgele_sayi) {   // girilen sayı rastgele sayıdan küçük olursa

                System.out.println("Daha Büyük Bir Sayı Giriniz : ");
                girilen = input.nextInt();
                puan -= 5;  // Puandan -5 azalttık
                sayac++;    // Sayacı 1 artırdık

            } else if (girilen > rastgele_sayi) {  // Girilen Sayı rastgele sayıdan büyük olursa

                System.out.println("Daha Küçük Bir Sayı Giriniz : ");
                girilen = input.nextInt();
                puan -= 5; // Puandan -5 azalttık
                sayac++;  // Sayacı 1 artırdık
            }

        } while (girilen != rastgele_sayi);  //Eşit olana kadar dönderdik

        if (girilen == rastgele_sayi) {  // Girilen Sayı Rastgele Sayıya eşit olduğunda Ekrana yazdırdık

            System.out.println("Tahmininiz Doğru  :) \nPuanınız : " + puan+" \nToplam Denemeniz : "+sayac);

        }
        // Write By UnSeen.

    }
}
