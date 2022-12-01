package odev_1aralık;

import java.util.Scanner;

public class sayi_tahim_enfazla_10_deneme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Değişkenleri Tanımladık
        int rastgele_sayi;
        int girilen;
        int sayac = 9; //10 deneme hakkı oldu

        rastgele_sayi = (int) (Math.random() * 98) + 1; // rastgele sayı ürettik

        System.out.println("Bir Tahminde Bulununuz :");
        girilen = input.nextInt(); // Kullanıcıdan Bir tahmin aldık

        do {
            if (girilen < rastgele_sayi) {   //Girilen Sayı rastgele sayıdan daha küçük ise
                System.out.println("Daha Büyük Bir Sayı Giriniz :");
                girilen = input.nextInt();
                sayac--;   // Sayacı 1 azalttık
            } else if (girilen > rastgele_sayi) { //girilen sayı rastegele sayıdan daha büyük ise

                System.out.println("Daha Küçük Bir Sayı Giriniz :");
                girilen = input.nextInt();
                sayac--; //sayacı 1 azalttık
            } else {
                System.out.println("Doğru Tahminde Bulundunuz :) ");
                break; //Doğru tahminde bulunduk dedik ve çıktık
            }

        } while (sayac != 0);  //Sayac 0 olana kadar könderdik
        // Eğer 10 denemede bulamadıysa hakkının bittiğini ekrana yazdırdık
        if (girilen != rastgele_sayi) {
            System.out.println("Hakkınız Bitti. 10 Denemede Bulamadınız.");
        }

    }
}
