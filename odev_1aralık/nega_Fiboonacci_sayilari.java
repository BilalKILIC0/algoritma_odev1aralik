package odev_1aralık;

import java.util.Scanner;

public class nega_Fiboonacci_sayilari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısını Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //İlk iki terimi oluşturduk. Ve terim3 'ü tanımladık
        int t1 = 1;
        int t2 = -1;
        int t3;

        //Terim 1 ve Terim 2 'yi yazdırdık
        System.out.printf(t1 + " ");
        System.out.printf(t2 + " ");

        //For döngüsü ile terim sayısına kadar NegaFibonacci Sayılarını yazdırdık
        for (int i = 3; i <= terim; i++) {

            //Terim 3 'ü belirledik
            t3 = t1 - t2;
            System.out.printf(t3 + " ");
            //Terim sırasını sağa doğru bir kaydırdık
            t1 = t2;
            t2 = t3;

        }
    }

}
