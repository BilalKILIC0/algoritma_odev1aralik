package odev_1aralık;

import java.util.Scanner;

public class bolum_sayisina_gore_kok3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısını Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Değişkenleri tanımladık
        double toplam = 1;
        double sonuc;

        //Toplam işlemini yaptırdık
        for (int i = 1; i < terim - 1; i++) {

            toplam = 1 + 1 / (2 + 1 / toplam);
        }

        //Sonucumuza yaptık
        sonuc = 1 + 1 / toplam;

        //Bulduğumuz Değeri Ekrana yazdırdık.
        System.out.printf("Bölüm Sayısına göre kök(3) toplamı : %.5f\n", sonuc);
    }
}
