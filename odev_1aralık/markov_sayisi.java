package odev_1aralık;

public class markov_sayisi {

    public static void main(String[] args) {

        //x kordinatı için döngü
        for (int i = 1; i <= 50; i++) {
            //Y kordinatı için döngü
            for (int j = i; j <= 50; j++) {
                //Z kordinatı için döngü
                for (int k = j; k <= 50; k++) {
                    //X , Y Ve Z 'nin kareleri toplamı eşitse 3* x*y*z 'ye ekrana yazdırdık
                    if (i * i + j * j + k * k == 3 * i * j * k) {

                        System.out.println("(" + i + "," + j + "," + k + ")");
                    }
                }
            }
        }

    }
}
