package odev_1aralık;

import java.util.Scanner;

public class brothers_formulu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Bir Terim Sayısı Giriniz :"); //Kullanıcıdan terim sayısını aldık
        int girilen = input.nextInt();

        //Değişkenelri tanımladık
        int i = 1;
        double faktoriyel = 1;
        double toplam = 2;

        //Döngü ile terim sayısıma kadar olan işlemleri yaptırdık
        while (i < girilen) {

            faktoriyel *= (2 * i + 1);
            toplam += (2 * i + 2) / (faktoriyel);
            i++;
        }
        //ekrana yazdırdık
        System.out.println("Brothers Formülü Sonucu : " + toplam);

    }
}
