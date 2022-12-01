package odev_1aralık;

import java.util.Scanner;

public class fermat_sayilari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısını Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Değişkeni Tanımladık
        double deger;

        //For Döngüsü ile terim sayısına kadar olan fermat Sayılarını yazdırdık.
        for (int i = 1; i <= terim; i++) {

            //İşlemi Yaptırdık
            deger = Math.pow(2, 2 * i) + 1;
            //Ekrana Yazdırdık
            System.out.println(" " + deger);
        }

    }

}
