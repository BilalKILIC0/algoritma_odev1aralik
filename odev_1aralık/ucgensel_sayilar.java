package odev_1aralık;

import java.util.Scanner;

public class ucgensel_sayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısını Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //İşlemimizi Tanımladık
        int islem;

        //For Döngüsü ile Terim Sayısına kadar döndürdük
        for (int i = 1; i <= terim; i++) {

            //İşlemimizi yaptık
            islem = i * (i + 1) / 2;

            //Ekrana Yazdırdık
            System.out.printf(islem + " ");
        }
//Write By UnSeen.
    }
}
