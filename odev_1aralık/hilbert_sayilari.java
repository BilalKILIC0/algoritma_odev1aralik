package odev_1aralık;

import java.util.Scanner;

public class hilbert_sayilari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısı Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Değişkeni Tanımladık
        int islem;

        //For Terim Saysına Kadar Dönderdik
        for (int i = 0; i <= terim; i++) {

            //İşlem Tanımladık
            islem = 4 * i + 1;
            //Ekrana Yazdırdık
            System.out.printf(islem + " ");

        }

    }
}
