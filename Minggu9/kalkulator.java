package minggu8;
import java.util.Scanner;
public class kalkulator extends perhitungan{
   
   public static void main (String [] args){
        char pil;
        kalkulator k = new kalkulator();
        Scanner s = new Scanner(System.in);  
        System.out.println("Menu");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("pilih : ");
        pil = s.next().charAt(0);
        switch(pil){
            case '1' : k.pertambahan(); break;
            case '2' : k.pengurangan(); break;
            case '3' : k.perkalian(); break;
            case '4' : k.pembagian(); break;
            default : System.out.println("Masukan tidak dikenali");
        }
   }
}
