package basitislemleer
import java.util.Scanner;
public class Basitislemleer {

   public static void main(String[] args);
    {
  
   Scanner sayiGir = new Scanner(System.in);
   System.out.println("Lütfen Birinci Sayıyı Giriniz= ");
   int birinciSayi = sayiGir.nextInt();
   
   System.out.println("Lütfen İkinci Sayıyı Giriniz= ");
   int ikinciSayi = sayiGir.nextInt();
   
   System.out.println("Toplam= " + (birinciSayi+ikinciSayi));
   System.out.println("Fark= " + (birinciSayi-ikinciSayi));
   System.out.println("Çarpım= " + (birinciSayi*ikinciSayi));
   System.out.println("Bölüm= " + (double)(birinciSayi/(double)ikinciSayi));
   System.out.println("Kalan= " + (birinciSayi%ikinciSayi));
   
    }
  }
