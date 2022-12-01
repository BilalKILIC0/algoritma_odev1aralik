package odev_1aralık;

import java.util.Scanner;

public class floyd_ucgeni {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Satır Sayısını Aldık
        System.out.println("Lütfen Satır Sayısı Giriniz :");
        int satir = input.nextInt();

        //Sayacı 1 'den Başlattık
        int sayac = 1;

        //Dış for satır sayısını belirlemek için yazıldı
        for (int i = 1; i <= satir; i++) {

            //İçteki for bir satırda ne kadar sayı yazacak onu belirledi
            for (int j = 1; j <= i; j++) {

                //Terimleri Sırasıyla ekrana yazdırdık
                System.out.printf(sayac + " ");
                //Sayacı 1 artırdık
                sayac++;

            }

            //Satır boşluğu koyduk
            System.out.println(" ");

        }
    }
}
