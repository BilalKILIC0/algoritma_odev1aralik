package odev_1aralık;

import java.util.Scanner;

public class cullen_sayilari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısı Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Double Değişkenini kullandık
        double deger;

        //For dögüsü ile Cullen Sayılarını Teker Teker Yazdırdık
        for (int i = 1; i <= terim; i++) {

            //Değeri Hesaplattık
            deger = i * Math.pow(2, i) + 1;
            //Ekrana Yazdırdık
            System.out.println(deger + " ");

        }

    }
}
