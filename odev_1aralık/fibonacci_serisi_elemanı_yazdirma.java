package odev_1aralık;

import java.util.Scanner;

public class fibonacci_serisi_elemanı_yazdirma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Terim Sayısını Aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();

        //Fibonacci Serisinin 1. ve 2. Terimi 1 olduğu için onları Tanımladık 
        int terim1 = 1;
        int terim2 = 1;

        //Daha Sonra 1. ve 2. Terimi Ekrana Yazdırdık
        System.out.printf(terim1 + " ");
        System.out.printf(terim2 + " ");

        //3. Terimi Tanımladık
        int terim3;

        //For Döngüsünü 3 'ten Başlattık çünkü ilk iki Terimi Ekrana yazdırdık
        for (int i = 3; i <= terim; i++) {

            //3. Terim Sayısını bir önceki terim Sayılarla topladık
            terim3 = terim1 + terim2;
            //Terim 3 'ü ekrana Yazdırdık
            System.out.printf(terim3 + " ");
            //Terimleri birer Sağa kaydırdık
            terim1 = terim2;
            terim2 = terim3;

        }
    }

}
