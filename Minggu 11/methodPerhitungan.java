package minggu10;
import java.util.Scanner;

public class methodPerhitungan extends perhitungan{
    
    
    public static void main (String [] args ){
    char pil;
    char u = 'y';
    double a1;
    double a2;
    double a3;
    methodPerhitungan p = new methodPerhitungan();
    Scanner s = new Scanner (System.in);
        
        while (u == 'y'){
        System.out.println("KALKULATOR");
        System.out.println("Pilih menu");
        System.out.println("1. Perhitungan dasar (pertambahan, pengurangan, perkalian, dan pembagian)");
        System.out.println("2. Perhitungan keliling");
        System.out.println("3. Perhitungan luas");
        pil = s.next().charAt(0);
        switch (pil){
            case '1' : System.out.println("Perhitungan dasar");
                       System.out.println("1. Pertambahan");
                       System.out.println("2. Pengurangan");
                       System.out.println("3. Perkalian");
                       System.out.println("4. Pembagian");
                       System.out.println("Pilihan :");
                       pil = s.next().charAt(0);
                       switch (pil){
                           case '1' : System.out.println("Masukkan angka pertama");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan angka kedua");
                                      a2 = s.nextDouble();
                                      System.out.println("Hasil = "+p.tambah(a1, a2));
                                       break;
                           case '2' : System.out.println("Masukkan angka pertama");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan angka kedua");
                                      a2 = s.nextDouble();
                                      System.out.println("Hasil = "+p.kurang(a1, a2));
                                      break;
                           case '3' : System.out.println("Masukkan angka pertama");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan angka kedua");
                                      a2 = s.nextDouble();
                                      System.out.println("Hasil = "+p.kali(a1, a2));
                                      break;
                           case '4' : System.out.println("Masukkan angka pertama");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan angka kedua");
                                      a2 = s.nextDouble();
                                      System.out.println("Hasil = "+p.bagi(a1, a2));
                                      break;
                           default : System.out.println("Pilihan tidak dikenali");} break;
                       
            case '2' : System.out.println("Perhitungan keliing");
                       System.out.println("1. keliling persegi");
                       System.out.println("2. keliling persegi panjang");
                       System.out.println("3. keliling segitiga");
                       System.out.println("4. keliling jajaran genjang");
                       System.out.println("5. keliling lingkaran");
                       System.out.println("Pilihan :");
                       pil = s.next().charAt(0);
                       switch (pil){
                           case '1' : System.out.println("Masukkan sisi");
                                      a1 = s.nextDouble();
                                      System.out.println("Keliling = "+p.kelilingPersegi(a1));
                                      break;
                           case '2' : System.out.println("Masukkan panjang");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan lebar");
                                      a2 = s.nextDouble();
                                      System.out.println("Keliling = "+p.kelilingPersegi(a1, a2));
                                      break;
                           case '3' : System.out.println("Masukkan sisi pertama");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan sisi kedua");
                                      a2 = s.nextDouble();
                                      System.out.println("Masukkan sisi ketiga");
                                      a3 = s.nextDouble();
                                      System.out.println("Keliling = "+p.kelilingSegitiga(a1, a2, a3));
                                      break;
                           case '4' : System.out.println("Masukkan sisi pertama");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan sisi kedua");
                                      a2 = s.nextDouble();
                                      System.out.println("Keliling = "+p.kelilingJajaranGenjang(a1, a2));
                                      break;
                           case '5' : System.out.println("Masukkan jari-jari");
                                      a1 = s.nextDouble();
                                      System.out.println("Keliling = "+p.kelilingLingkaran(a1));
                                      break;
                           default : System.out.println("Pilihan tidak dikenali");} break;
                       
            case '3' : System.out.println("Perhitungan luas");
                       System.out.println("1. luas persegi");
                       System.out.println("2. luas persegi panjang");
                       System.out.println("3. luas segitiga");
                       System.out.println("4. luas jajaran genjang");
                       System.out.println("5. luas lingkaran");
                       System.out.println("Pilihan :");
                       pil = s.next().charAt(0);
                       switch (pil){
                           case '1' : System.out.println("Masukkan sisi");
                                      a1 = s.nextDouble();
                                      System.out.println("Luas = "+p.luasPersegi(a1));
                                      break;
                           case '2' : System.out.println("Masukkan panjang");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan lebar");
                                      a2 = s.nextDouble();
                                      System.out.println("Luas = "+p.luasPersegi(a1, a2));
                                      break;
                           case '3' : System.out.println("Masukkan alas");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan tinggi");
                                      a2 = s.nextDouble();
                                      System.out.println("Luas = "+p.luasSegitiga(a1, a2));
                                      break;
                           case '4' : System.out.println("Masukkan alas pertama");
                                      a1 = s.nextDouble();
                                      System.out.println("Masukkan tinggi kedua");
                                      a2 = s.nextDouble();
                                      System.out.println("Luas = "+p.luasJajaranGenjang(a1, a2));
                                      break;
                           case '5' : System.out.println("Masukkan jari-jari");
                                      a1 = s.nextDouble();
                                      System.out.println("Luas = "+p.luasLingkaran(a1));
                                      break;
                           default : System.out.println("Pilihan tidak dikenali");} break;
            default : System.out.println("Pilihan tidak dikenali");
            }
        System.out.println("Kembali ke menu utama? (y/t)");
        u = s.next().charAt(0);
        }
    }
}
