package minggu6lab;
import java.util.Scanner;
public class perhitungandasar {
    int angka1;
    int angka2;
    int hasil;
    String x,y,z;
    
    perhitungandasar(){
        x = "contoh penggunaan this";
    }
    public void pertambahan(int a,int b){
        hasil = angka1 + angka2;
        System.out.println("hasil = "+hasil);
    }
    public void pengurangan(int a,int b){
        hasil = angka1 - angka2;
        System.out.println("hasil = "+hasil);        
    }

    public final void perkalian(int a,int b){
        hasil = angka1 * angka2;
        System.out.println("hasil = "+hasil);
    }
    public void pembagian(int a,int b){
        hasil = angka1 / angka2;
        System.out.println("hasil = "+hasil);        
    }
    public void cobathis(){
        this.y = "Selamat datang";
        System.out.println(y);
    }
    public void cobathis(String z){
        System.out.println(z);
    }
    
    public static void main (String [] args){
        String z;
        perhitungandasar p = new perhitungandasar();
        System.out.println(p.x);
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan teks yang ingin ditampilkan");
        z = s.nextLine();
        System.out.println("Ini yang pakai this");
        p.cobathis(z);
        System.out.println("Ini yang tidak pakai this");
        p.cobathis(); 
    }
}
