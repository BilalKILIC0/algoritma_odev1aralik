package odev_1aralık;

import java.util.Scanner;

public class eksik_sayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Değer aldık
        System.out.println("Lütfen Bir Tam Sayı Giriniz :");
        int girilen = input.nextInt();

        //Değişkenleri Tanımladık
        int eksik_toplam = 0;
        int eksik_sayi;
        int eksiklik_miktari;

        //Pozitif Tam Bölenlerine baktık
        for (int i = 1; i <= girilen; i++) {

            //Eğer girilen Sayı i ye tam bölünürse pozitif tam bölenidir.
            if (girilen % i == 0) {

                eksik_toplam += i;

            }

        }

        //Eksik Sayı işlemini yaptık
        eksik_sayi = girilen * 2;

        //Eğer eksik toplam , sayının iki katından küçükse eksik sayıdır yazdırdık
        if (eksik_toplam < eksik_sayi) {
            eksiklik_miktari = eksik_sayi - eksik_toplam;
            System.out.println("Girdiğiniz Sayı Eksik bir Sayıdır. Eksiklik Miktarı :" + eksiklik_miktari);
        } //Değilse Eksik sayı değildir yazdırdık
        else {
            System.out.println("Girilen Sayı Eksik Bir Sayı Değildir.");
        }

    }

}
