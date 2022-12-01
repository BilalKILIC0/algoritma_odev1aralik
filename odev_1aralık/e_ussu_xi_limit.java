package odev_1aralık;
import java.util.Scanner;

public class e_ussu_xi_limit {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        //Ne yapacağımızı kullanıcıya bildirdik
        System.out.println("exp(x)=Lim(1+x/n)^n ");
        //Terim Sayısın aldık
        System.out.println("Bir Terim Sayısı Giriniz :");
        int terim = input.nextInt();
        //X sayısını aldık
        System.out.println("Bir X Sayısı Giriniz :");
        double x = input.nextDouble();
        //sonucu 0 a eşitledik
        double sonuc = 0;
        //sonuç işlemini yaptırdık
        sonuc += Math.pow(1+x/terim, terim);
        //Ekrana yazdırdık
        System.out.printf("Hesaplanan Sonuç : \nexp(%f)=%f\n" ,x,sonuc);
        
    }
}
