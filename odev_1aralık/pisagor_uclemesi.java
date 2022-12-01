package odev_1aralık;

import java.util.Scanner;

public class pisagor_uclemesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan N Sayısını aldık
        System.out.println("Lütfen Pozitif Bir Tam Sayı Giriniz :");
        int girilen = input.nextInt();

        //İ değerlerini hesaplattık
        for (int i = 1; i <= girilen - 1; i++) {

            //J değerlerini hesaplattık
            for (int j = i + 1; j <= girilen - i; j++) {

                //Girilen Sayıdan i ve j nin toplamını çıkartıp k sayısını bulduk
                int k = girilen - (i + j);

                //İ sayısını karesini j sayısının karesini alıp c 'nin karesine eşit olup olmadığını kontrol ettik
                if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {

                    //Eşitse ekrana yazdırdık
                    System.out.println(i + "," + j + "," + k);
                    System.out.println(i * j * k);
                }
            }

        }
    }

}
