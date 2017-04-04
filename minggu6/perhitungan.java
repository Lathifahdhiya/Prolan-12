
package minggu6;
import java.util.Scanner;
public class perhitungan extends perhitungandasar{
    float segitiga;
    float persegi;
    int tinggi;
    int alas;
    int sisi;
    char pilh;
    

    public void luas(int alas,int tinggi){
        segitiga = (alas * tinggi)/2;
        System.out.println("luas = "+segitiga);
    }
    public void luas (int sisi){
        persegi = sisi *sisi;
        System.out.println("luas = "+persegi);
    }
    
    @Override
    public void pembagian(int a, int b){  
        super.pembagian(a, b);
        hasil = angka1 % angka2;
        System.out.println("Sisa hasil bagi = "+hasil);
    }
    
    @Override
    public void pertambahan (int a, int b){
        super.pertambahan(a, b);
    }
    
    @Override
    public void pengurangan (int a, int b){
        super.pengurangan(a, b);
    }
    
    
}