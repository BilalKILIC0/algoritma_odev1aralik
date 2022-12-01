
package odev_1aralık;
import java.util.Scanner;  // Scanner Kütüphanesini Ekledik

public class sin_hesaplama {
    
public static void main(String[] args) {
         
     Scanner input = new Scanner (System.in);
     
     // Değişkenlerimizi tanımladık
     int is ;
     double X,F,T=0;
     
     //Kullanıcıdan Açı ve terim sayısını aldık
     System.out.println("Bir Açı değeri Giriniz (DERECE) :");
     double aci = input.nextDouble();
     
     System.out.println("Bir Terim Sayısı Giriniz :");
     int terim = input.nextInt();
     
     //Alınan açıyı radyanta çevirip X e atadık 
     X = Math.toRadians(aci);
     is =1; // işlemi +1 olarak atadık
     
     
     //For döngüsü ile terim sayısıdan 1 eksik olana kadar döndürdük
     for (int i = 1; i <= terim -1; i++) {
        
         // Faktöriyeli 1 den başlattık
         F = 1;
         
         // faktöriyeli yazdırdık ve toplamı hesaplattık
         for (int j = 1; j < 2*i; j++) {
             
             F *=j;
             is *= (-1);  // işlem + , - , + , - , ... Şeklinde gitmesini sağladık
             T +=is*Math.pow(X,2*i)/F;
             
         }
    }
     // Ekrana bulduğumuz değerleri yazdırdık.
     System.out.printf("\n Seri Açılımla Hesaplanan Değer : %.5f\n ",T);
     System.out.printf("Komutla Hesaplanan Değer : %.5f\n " ,Math.sin(X));
     
     //Write By UnSeen.
    }
}
