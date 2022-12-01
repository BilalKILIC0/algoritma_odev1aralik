package odev_1aralık;

import java.util.Scanner;

public class tribonacci_serisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısı Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Değişkenleri tanımladık
        int t1 = 1;
        int t2 = 1;
        int t3 = 2;
        int t4;

        //T1 , T2 , T3 'ü ekrana yazdırdık
        System.out.printf(t1 + " " + t2 + " " + t3 + " ");

        //For döngüsü ile 4. Terimden Başlatım Terim Sayısına Kadar Artırdık
        for (int i = 4; i <= terim; i++) {

            //Terim 4 'ü belirledik
            t4 = t1 + t2 + t3;
            //Oluşan Terimleri ekrana yazdırdık
            System.out.printf(t4 + " ");
            //Terimleri Soldan Sağa doğru birer Değiştirdik
            t1 = t2;
            t2 = t3;
            t3 = t4;

        }

    }
}
