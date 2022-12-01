package odev_1aralık;

import java.util.Scanner;

public class heterometrik_sayisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan Değer Aldık
        System.out.println("Lütfen Bir Sayı Giriniz :");
        int girilen = input.nextInt();
        //Girilen SAyıya kadar heterometrik sayıları yazdırdık
        for (int i = 1; i <= girilen; i++) {

            System.out.printf(i + "," + (i + 1) + "=" + (i * (i + 1)) + " ");

        }

    }

}
