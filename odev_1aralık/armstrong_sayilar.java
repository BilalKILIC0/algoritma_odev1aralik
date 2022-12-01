package odev_1aralık;

public class armstrong_sayilar {

    public static void main(String[] args) {

        //Değişkenleri Tanımladık
        int sayac;

        //İlk For Döngüsü ile 1 ile 9 arasında bir Sayı ürettik. 100' ler basamağını oluşturduk (0 'ı eklemedik çünkü başa Sıfır gelemez .)
        for (int i = 1; i <= 9; i++) {

            //İkinci For 'da 10' lar basamağını oluşturduk
            for (int j = 0; j <= 9; j++) {

                //Üçüncü For 'da 1 'ler basamağını oluşturduk.
                for (int k = 0; k <= 9; k++) {

                    //Burada her i , j , k değeri için Sayacımızı aldık
                    sayac = 100 * i + 10 * j + k;

                    //Eğer i üssü 3 + j üssü 3 + k üssü 3 eşitse sayaca Sayacı ekrana yazdır.
                    if (sayac == Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3)) {

                        System.out.printf(sayac + " ");

                    }
                }

            }

        }

    }
}
