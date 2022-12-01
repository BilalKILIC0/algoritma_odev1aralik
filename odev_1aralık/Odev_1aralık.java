package odev_1aralık;
import java.util.Scanner; // Scanner kütüphanesini ekledik

public class Odev_1aralık {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Değişkenleri tanımladık
        int is;                                  
        double X,F,T=1;
        
        // Kullanıcıdan açı ve terim Sayısını Aldık
        System.out.println("Açı değeri giriniz (DERECE) : ");
        double aci = input.nextDouble();
        
        System.out.println("Terim Sayısı Giriniz : ");
        int terim = input.nextInt();
        
        // Açıyı Radyanta çevirip X e atadık
        X = Math.toRadians(aci);
        is = 1; // işlemi +1 olarak atadık
        
        // For döngüsü kullanarak terim sayısından bir eksik kadar yazdırdık.
        for (int i = 1; i <= terim-1; i++) {
            // Faktöriyeli 1 den başlattık
            F=1;
            // For döngüsü ile faktöriyeli çarptık ve pay kısmını hesaplatıp faktöriyele böldük.
            for (int j = 1; j <= 2*i; j++) {
                F*=j;
                is *= (-1); // işlemin + , - , + , - , +, ... Şeklinde gitmesini sağladık
                T+=is*Math.pow(X, 2*i)/F;
            } }
            
            // Bulduğumuz Sonuçları Ekrana Yazdık .
            System.out.printf("\nSeri Açılımla Hesaplanan Değer : %.5f\n" ,T);
            System.out.printf("Komutla Hesaplanan Değer : %.5f\n" ,Math.cos(X));
    }
    
}
