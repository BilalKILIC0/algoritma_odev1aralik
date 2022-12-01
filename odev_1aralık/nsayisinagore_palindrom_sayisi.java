package odev_1aralık;

import java.util.Scanner;

public class nsayisinagore_palindrom_sayisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Değişkeni tanımladık
        double islem;
        //Kullanıcıdan Terim Sayısı Aldık
        System.out.println("Lütfen Bir Basamak Sayısı Giriniz :");
        int terim = input.nextInt();
        //İşlemi Yaptık
        islem = Math.pow(9 * 10, ((terim - 1) / 2));
        //Ekrana Yazdırdık
        System.out.println("Palindrom Sayısı :" + islem);

    }

}
