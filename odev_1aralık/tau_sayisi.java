package odev_1aralık;

import java.util.Scanner;

public class tau_sayisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Değer aldık
        System.out.println("Lütfen Bir Sayı Giriniz :");
        int girilen = input.nextInt();

        //Değişkeni tanımladık
        int tam_bolen_sayisi_toplami = 0;

        //Girilen Sayıya kadar Döndürdük
        for (int i = 1; i <= girilen; i++) {

            //İ değeri tam bölüyorsagirilen sayıyı tam_bolen_sayisi_toplami 1 artırdık
            if (girilen % i == 0) {

                tam_bolen_sayisi_toplami++;

            }

        }

        //Girilen Sayı tam_bolen_sayisi_toplamına tam bölünüyorsa tau Sayısı yazdırdık
        if (girilen % tam_bolen_sayisi_toplami == 0) {
            System.out.println("Girdiğiniz Sayı Tau Sayısıdır.");
        } //Bölünmüyorsa tau sayısı değildir yazdırdık
        else {
            System.out.println("Girilen Sayı Tau Sayısı Değildir.");
        }

    }
    //Write By UnSeen.
}
