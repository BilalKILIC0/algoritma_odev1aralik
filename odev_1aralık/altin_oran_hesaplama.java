package odev_1aralık;

import java.util.Scanner;

public class altin_oran_hesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullancııdan AB uzunluğunu aldık
        System.out.println("Lütfen AB Doğru Parçasının Uzunluğunu Giriniz :");
        int uzunluk_AB = input.nextInt();
        //Değişkenlerimizi tanımladık
        double ac, cb;
        //CB Uzunluğunu bulduk
        cb = 2 * uzunluk_AB / (1 + 5 ^ (1 / 2));
        //AC Uzunluğunu bulduk
        ac = uzunluk_AB - cb;

        //Bulduklarımızı ekrana yazdırdık
        System.out.println("AC Uzunluğu : " + ac);
        System.out.println("CB Uzunluğu : " + cb);

    }

}
