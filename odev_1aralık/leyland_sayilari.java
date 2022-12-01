package odev_1aralık;

import java.util.Scanner;

public class leyland_sayilari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Değer Aldık
        System.out.println("X Sayısını Giriniz :");
        int x = input.nextInt();

        System.out.println("Y Sayısını Giriniz :");
        int y = input.nextInt();

        //Değişken Tanımladık
        double islem;
        

        //X Ve Y Değişkeni için Teker Teker Baktık
        for (int i = 2; i < x; i++) {

            for (int j = 2; j < y; j++) {

                //İşlemi Tanımladık
                islem = (double) (Math.pow(j, i)) + (Math.pow(i, j));

                //Ekrana Yazdırdık
                System.out.println(islem + " ");

            }
        }

    }

}
