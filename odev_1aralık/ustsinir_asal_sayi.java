package odev_1aralık;

import java.util.Scanner;

public class ustsinir_asal_sayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan üst sınırı alıyoruz
        System.out.println("Lütfen Bir Üst Sınır Giriniz :");
        int ust_sinir = input.nextInt();

        //Bu bölümde kodumuzu biraz süslüyoruz 
        System.out.println("\nBelirtilen aralıktaki ASAL Sayılar");

        System.out.println("\nÜst Sınır ==> " + ust_sinir);

        System.out.println("\n+++ASAL SAYILAR+++\n");

        //Sayac değişkenini tanımlıyoruz
        int sayac;

        //For döngüsüyle girilen sayıya kadar olan sayıları tek tek kontrol ediyoruz
        for (int i = 2; i <= ust_sinir; i++) {
            //Her i değerinin artışında sayacı sıfırlıyoruz
            sayac = 0;

            //Yukardaki for döngüsünde her i değeri için bölümlerini buluyoruz
            for (int j = 1; j <= i; j++) {
                //Eğer i değeri j değerine tam bölünüyorsa sayacımızı 1 artırıyoruz
                if (i % j == 0) {
                    sayac++;
                }
            }
            //İç döngüden çıktıktan sonra eğer sayac 2 ye eşit olursa ( HEM 1 'E , HEMDE KENDİSİNE BÖLÜM SAYISI 2 OLDUĞU İÇİN ) i değerini ekrana yazdırıyoruz.
            if (sayac == 2) {
                System.out.printf(i + " ");
            }

        }

    }
}
