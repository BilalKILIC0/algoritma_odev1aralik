package odev_1aralık;

import java.util.Scanner;

public class birden_buyuk_tamsayinin_asalcarpanlari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kodda kullanacağımız Değişkenleri tanımladık
        int girilen, tutucu;

        //DO - WHİLE Döngüsü ile girilen sayının 1 'den büyük olmasını kontol ediyoruz.
        do {

            //Kullanıcıdan Asal Çarpanlarını hesaplatacağımız Sayıyı alıyoruz.
            System.out.println("Lütfen Asal Çarpanlarının Bulmak İstediğiniz Bir Sayı Giriniz :");
            girilen = input.nextInt();
            //Girilen sayıyı tutucuya atıyoruz
            tutucu = girilen;

        } while (girilen <= 1); //While Döngüsünün koşulunu giriyoruz

        //For döngüsü ile 2 den girilen sayıya kadar olan sayıları teker teker kontrol ediyoruz.
        for (int i = 2; i < girilen; i++) {

            //Eğer tutucu i 'ye tam bölünüyorsa ekrana yazdırıyoruz.
            if (tutucu % i == 0) {

                System.out.printf(i + " ");
                //Yeni tutucuyu i ye bölüp bulduğumuz asal çarpanı içinden çıkartıyoruz
                tutucu /= i;

            }

        }

        //Write By UnSenn.
    }
}
