package odev_1aralık;

import java.util.Scanner;

public class madhava_of_sangamagrama_seri_toplami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir terim sayısı Giriniz :"); // kullanıcıdan veri aldık

        int terim = input.nextInt();

        double toplam = 0; //değişkenleri tanımladık
        int degisken = -1;

        //for döngüsü ile işlemleri yaptık
        for (int i = 0; i < terim; i++) {

            degisken *= (-1);
            toplam += ((degisken) ^ i / ((2 * i + 1) * (3 ^ i)));
            // Toplamda hata alıyorum (Anlamadım Hocam Bu soruyu ) !!!
        }

        //ekrana yazdırdık
        System.out.println(((12) ^ (1 / 2)) * toplam);

    }
}
