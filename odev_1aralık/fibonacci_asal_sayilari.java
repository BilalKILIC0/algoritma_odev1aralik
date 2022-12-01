package odev_1aralık;

import java.util.Scanner;

public class fibonacci_asal_sayilari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıda terim Sayısını aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Değişkenleri tanımladık
        int sayac = 0;
        int terim1 = 1;
        int terim2 = 1;
        int terim3;

        //Fibonacci Sayısını Hesapladık
        for (int i = 1; i <= terim; i++) {

            terim3 = terim1 + terim2;
            terim1 = terim2;
            terim2 = terim3;

            //Terim3 'ü asal olup olmadığına baktık
            for (int j = 2; j < terim3; j++) {

                if (terim3 % j == 0) {
                    sayac++;
                }
            }

            //Eğer Sayac 0 'a eşitse terim3 'ü ekrana yazdır.
            if (sayac == 0) {
                System.out.println(terim3 + " ");

            }
        }
    }

}
