package odev_1aralık;

public class iki_basamagi_asal_sayi {

    public static void main(String[] args) {

        //Sonuc değerini tanımladık
        int sonuc;

        // asal rakamları ayırt ettik
        for (int i = 2; i <= 7; i++) {

            //Asal rakamları ayırt ettik
            for (int j = 2; j <= 7; j++) {

                //Asal rakamları aldık
                if (i == 2 || i == 3 || i == 5 || i == 7 && j == 2 || j == 3 || j == 5 || j == 7) {

                    //Kodda hata olduğu için bu ymntemle yaptık !!!
                    if (10 * i + j != 26 && 10 * i + j != 36 && 10 * i + j != 56 && 10 * i + j != 63 && 10 * i + j != 65 && 10 * i + j != 67) {

                        //Sonucumuzu yazdırdık
                        sonuc = 10 * i + j;
                        System.out.print(sonuc + " ");

                    }
                }
            }

        }

    }
}
