package odev_1aralık;

import java.util.Scanner;

public class gumus_orana_bolmek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Parçanın Toplam uzunluğunu aldık
        System.out.println("Lütfen Bir Doğru Parçasının Uzunluğunu Giriniz :");
        int uzunluk = input.nextInt();

        //Parçaları 2 ' ye ayırdık
        double parca1, parca2;

        //Parça 1 'in uzunluğunu altın orana göre hesaplattık
        parca1 = uzunluk / (2 + 2 ^ (1 / 2));
        //Toplam uzunluktan parça 1 'in uzunluğunu çıkartıp parça 2'ye atadık
        parca2 = uzunluk - parca1;

        //Parçaların uzunluğunu ekrana yazdırdık.
        System.out.println("1.Parça Uzunluğu : " + parca1);
        System.out.println("2.Parça Uzunluğu : " + parca2);

    }
}
