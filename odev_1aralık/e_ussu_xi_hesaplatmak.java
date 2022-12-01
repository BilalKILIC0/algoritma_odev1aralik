
package odev_1aralık;
import java.util.Scanner;

public class e_ussu_xi_hesaplatmak {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //Kullanıcıdan terim sayısını aldık
        System.out.println("Lütfen Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();
        
        //Kullanıcıdan x sayısını aldık
        System.out.println("Lütfen Bir X Sayısı Giriniz :");
        double x = input.nextDouble();
        
        //Değişkenlerimizi Tanımladık
        double toplam = 1;
        double faktoriyel = 1;
        
        //For döngüsü ile faktöriyel hesaplattık ve toplam değerini terim sayısınına kadar bulduk
        for (int i = 1; i < terim; i++) {
            
            faktoriyel *=i;
            toplam +=Math.pow(x, i)/faktoriyel;
        }
        
        //Bulduğumuz Sonuçları ekrana yazdırdık
        System.out.printf("Seri Açılım İle Elde Edilen Değer : %.5f\n" ,toplam);
        System.out.printf("Komut e Üzeri X İle Elde Edilen Değer : %.5f\n",Math.exp(x)); 
    }
}
