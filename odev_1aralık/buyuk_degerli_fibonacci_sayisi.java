package odev_1aralık;

import java.util.Scanner;

public class buyuk_degerli_fibonacci_sayisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan bir fibonacci sayısı aldık
        System.out.println("Lütfen Bir Fibonacci Sayısı Giriniz :");
        int girilen = input.nextInt();

        //Ortalamayı hesapladık
        double arit_ort = (1 + Math.pow(5, 0.5)) / 2;
        //Değişkenleri tanımladık
        int t1 = (int) (girilen / arit_ort);
        int t3 = (int) (girilen * arit_ort);
        //Ekrana Yazdırdık
        System.out.print(t1 + " " + girilen + " " + t3);

    }

}
