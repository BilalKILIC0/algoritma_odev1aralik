package odev_1aralık;

public class palindrom_sayilar {

    public static void main(String[] args) {

        //Değişkenleri tanımladık
        int islem1;
        int islem2;

        //For ile 1 - 9 arası rastgele Sayı ürettik
        for (int i = 1; i <= 9; i++) {

            //0-9 arası rastgele sayı ürettik
            for (int j = 0; j <= 9; j++) {

                //İşlemi tanımlayıp ekrana yazdırdık
                islem1 = 100 * i + 10 * j + i;
                System.out.printf(islem1 + " ");
            }
            //0-9 Arası rastgele sayı ürettik
            for (int j = 0; j <= 9; j++) {

                //İşlemi tanımlayıp ekrana yazdırdık
                islem2 = 1000 * i + 100 * j + 10 * j + i;
                System.out.printf(islem2 + " ");

            }
        }
    }

}
