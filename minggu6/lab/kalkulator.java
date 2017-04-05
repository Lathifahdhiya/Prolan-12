package minggu6lab;
import java.util.Scanner;
public class kalkulator extends perhitungan{
     public static void main(String[]args)
    {
        
        int a ;
        int b;
        char ulang;
        char pilihan;    
        Scanner s = new Scanner(System.in);
        kalkulator m = new kalkulator();
        perhitungandasar p = new perhitungandasar();
        ulang = 'y';
        while(ulang == 'y'){
        System.out.println("KALKULATOR");
        System.out.println("----------");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Luas segitiga");
        System.out.println("6. Luas Persegi");
        System.out.println("7. Luas Lingkaran");
        System.out.println("---------------");
        pilihan = s.next().charAt(0);
         switch (pilihan) {
             case '1':
                 System.out.println("Pertambahan");
                 System.out.println("-----------");
                 System.out.println("Masukkan angka pertama");
                 m.angka1=s.nextInt();
                 a = m.angka1;
                 System.out.println("Masukkan angka kedua");
                 m.angka2 =s.nextInt();
                 b =m.angka2;
                 m.pertambahan(a, b);
                 break;
             case '2':
                 System.out.println("Pengurangan");
                 System.out.println("-----------");
                 System.out.println("Masukkan angka pertama");
                 m.angka1=s.nextInt();
                 a = m.angka1;
                 System.out.println("Masukkan angka kedua");
                 m.angka2 =s.nextInt();
                 b = m.angka2;
                 m.pengurangan(a, b);
                 break;
             case '3':
                 System.out.println("Perkalian");
                 System.out.println("-----------");
                 System.out.println("Masukkan angka pertama");
                 m.angka1 =s.nextInt();
                 a = m.angka1;
                 System.out.println("Masukkan angka kedua");
                 m.angka2=s.nextInt();
                 b = m.angka2;
                 m.perkalian(a, b);
                 break;
             case '4':
                 System.out.println("Pembagian");
                 System.out.println("-----------");
                 System.out.println("Masukkan angka pertama");
                 m.angka1 =s.nextInt();
                 a = m.angka1;
                 System.out.println("Masukkan angka kedua");
                 m.angka2=s.nextInt();
                 b = m.angka2;
                 m.pembagian(a, b);
                 break;
             case '5':
                 System.out.println("Menghitung Luas Segitiga");
                 System.out.println("-----------");
                 System.out.println("Masukkan alas");
                 m.alas=s.nextInt();
                 a = m.alas;
                 System.out.println("Masukkan tinggi");
                 m.tinggi=s.nextInt();
                 b = m.tinggi;
                 m.luas(a, b);
                 break;
             case '6' :
                 System.out.println("Menghitung Luas Persegi");
                 System.out.println("-----------");
                 System.out.println("Masukkan sisi");
                 m.sisi=s.nextInt();
                 a = m.sisi;
                 m.luas(a);
                 break;
             case '7' :
                 System.out.println("Menghitung Luas Lingkaran");
                 System.out.println("---------------");
                 m.luas();
                 break;
             default :
                 System.out.println("Input tidak dikenali");
         }
         System.out.println("Kembali ke menu? y/t");
         ulang = s.next().charAt(0);
        }
        
    }
}
