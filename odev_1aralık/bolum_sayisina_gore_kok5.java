package odev_1aralık;

import java.util.Scanner;

public class bolum_sayisina_gore_kok5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan terim Sayısını aldık
        System.out.println("Lütfen Bir Terim Sayı Giriniz :");
        int terim = input.nextInt();

        //Değişkenlerimizi tanımladık
        double toplam = 1;
        double sonuc;
        //Toplam değerini hesaplattık
        for (int i = 1; i < terim; i++) {

            toplam = 4 + 1 / toplam;

        }
        //Sonuc değerimizi bulduk
        sonuc = 2 + 1 / toplam;

        //Ekrana yazdırdık
        System.out.printf("KÖK(5) Değeri : %.5f\n", sonuc);

    }
}
