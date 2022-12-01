package odev_1aralık;
import java.util.Scanner; // Scanner Kütüphanesini ekledik

public class Ln_Hesaplama {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        // Kullanıcıdan terim Sayısını aldık
        System.out.println("Bir Terim Sayısı Giriniz : ");
        int terim = input.nextInt();
        
        // Toplamı 0 dan başlattık
        double toplam = 0;
        
        //Fo dögüsü ile terim sayısına kadar dönderip gerekli matematiksel işlemi yaptık
        for (int i = 0; i <= terim-1; i++) {
            
            toplam =(toplam+1)/((2*i+1)*(2*i+2)); // Matematiksel İşlem 
            
        }
        //Bulduğumuz toplamı ekrana yazdırdık
        System.out.printf("LN Toplamı Yaklaşık Olarak : %.4f\n" ,toplam);
        
    }
   
}
