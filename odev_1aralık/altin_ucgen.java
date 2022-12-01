package odev_1aralık;

import java.util.Scanner;

public class altin_ucgen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan Kısa kenarı aldık
        System.out.println("Lütfen Üçgenin Kısa Kenarını Giriniz :");
        int kisa_kenar = input.nextInt();

        //esit kenarı tanımladık
        double esit_kenar;

        //Eşit kenarı altın oranla çarpıp ikiye böldük
        esit_kenar = kisa_kenar * (1 + 5 ^ (1 / 2)) / 2;

        //Kenarları Ekrana Yazdırdık
        System.out.println("Girilen Kısa Kenar :" + kisa_kenar);
        System.out.println("Altın Orana Göre Oluşan 1.Kenar :" + esit_kenar);
        System.out.println("Altın Orana Göre Oluşan 2.Kenar :" + esit_kenar);

    }
}
