package odev_1aralık;

import java.util.Scanner;

public class ore_sayilari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Değeri aldık
        System.out.println("Lütfen Bir Pozitif Tam Sayı Giriniz :");
        int girilen = input.nextInt();

        //Değişkenleri tanımladık
        int sayac = 0;
        double toplam = 0;

        //For döngüsü ile sayıya kadar dönderdik
        for (int i = 1; i <= girilen; i++) {

            //Tam bölüp bölmediğine baktık
            if (girilen % i == 0) {

                //Sayacı bir atrıdık ve toplam işlemini yaptırdık
                sayac++;
                toplam = toplam + (1 / i);

            }
        }

        //Harmonik ortalamayı bulduk
        double harmonik_ort = sayac / toplam;

        //Eğer tam Sayı ise ore sayısı yazdırdık
        if (harmonik_ort == (int)harmonik_ort) {

            System.out.println("Girilen Sayı Ore Sayısıdır.");
        } //Değilse ore sayısı değildir yazdırdık
        else {
            System.out.println("Girilen Sayı Ore Sayısı Değildir.");
        }

    }

}
