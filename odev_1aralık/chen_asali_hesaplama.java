package odev_1aralık;

import java.util.Scanner;

public class chen_asali_hesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Değikenleri tanımladık
        int girilen;

        int chen_asal = 0;
        int sayac = 0;
        int tut;

        //Do - While Döngüsü ile 2 den büyük Sayıların Girişine İzin verdik
        do {
            //Kullanıcıdan belirtilen aralıktaki Verileri İstedik
            System.out.println("Lütfen bir Sayı Giriniz :");
            girilen = input.nextInt();
            //Tut değişkeni ile girilen sayının 2 fazlasını elde ettik
            tut = girilen + 2;

        } while (girilen <= 1);

        //Girilen Sayının Asal olup olmadığını kontrol ettik
        for (int i = 2; i < girilen; i++) {

            //Girilen sayı herhangi bir i sayısına bölünüyorsa sayacı 1 artırdık
            if (girilen % i == 0) {

                sayac++;

            }

        }

        //Eğer Sayac 0 'a eşit değilse girilen sayının asal olmadığını yazdırdık
        if (sayac != 0) {
            System.out.println("Girdiğiniz Sayı Asal Değildir.");
        } else {

            //Sayac sıfır ise asal olduğunu kabul ettik
            for (int j = 2; j < tut; j++) {

                //Girilen sayının iki fazlası ==> (TUT) herhangi birj değerine bölünürsa chen_asalını bir artırdık
                if (tut % j == 0) {
                    chen_asal++;
                }

            }

        }
        //Eğer chen_asalı hiç artmadıysa ==> (0) Girilen sayının Chen asalı olduğunu kabul ettik
        if (chen_asal == 0) {
            System.out.println("Girdiğiniz Sayı Chen Asalıdır.");
        } //Chen asalında herhangi bir artış olduğunda girilen sayıyı Chen Asalı olarak kabul etmedik
        else {
            System.out.println("Girdiğiniz Sayı Chen Asalı Değildir.");
        }

    }
}
