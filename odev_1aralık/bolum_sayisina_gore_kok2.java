package odev_1aralık;

import java.util.Scanner;

public class bolum_sayisina_gore_kok2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısını Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Değişkenleri Tanımladık
        double toplam = 1;
        double sonuc;

        //Toplamı Hesaplattırdık
        for (int i = 1; i < terim; i++) {

            toplam = 2 + 1 / toplam;

        }

        //Sonucumuzu Bulduk
        sonuc = 1 + 1 / toplam;

        //Ekrana Yazdırdık
        System.out.printf("Terim Sayısına kadar olan Karekök(2) Bölüm : %.5f\n", sonuc);
    }
}
