package odev_1aralık;

import java.util.Scanner;

public class pell_sayilari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısını Aldık
        System.out.println("Lütfen Pell Sayısı İçin Bir terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Değişkenleri Tanımladık
        double pay;
        double payda;
        double islem;

        //Terim Sayısına kadar Dönderdik
        for (int i = 0; i <= terim; i++) {

            //Pay kısmını yaptık Hesaplattık (Her bir i(terim) değeri için)
            pay = (double) Math.pow(1 + Math.pow(2, 0.5), i) - (Math.pow(1 - Math.pow(2, 0.5), i));
            //Payda kısmını hesaplattık (Her bir i(terim) değeri için)
            payda = (double) (2 * Math.pow(2, 0.5));

            //İşlemi Tanımladık
            islem = pay / payda;
            //Ekrana yazdırdık.
            System.out.printf(Math.ceil(islem) + " ");
        }
//Write By UnSeen.
    }
}
