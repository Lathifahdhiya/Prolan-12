package minggu8;
import java.util.Scanner;
public class perhitungan extends perhitunganDasar{
    public float hasil;
    Scanner s = new Scanner (System.in);
    @Override
    public void pertambahan() {
    System.out.println("Pertambahan");
    System.out.println("-----------");
    System.out.println("Masukkan angka pertama");
    super.a = s.nextInt();
    System.out.println("Masukkan angka kedua");
    super.b = s.nextInt();
    hasil = super.a + super.b;
    System.out.println("Hasil : "+hasil);
    }

    @Override
    public void pengurangan() {
    System.out.println("Pengurangan");
    System.out.println("-----------");
    System.out.println("Masukkan angka pertama");
    super.a = s.nextInt();
    System.out.println("Masukkan angka kedua");
    super.b = s.nextInt();
    hasil = super.a - super.b;
    System.out.println("Hasil : "+hasil);
    }

    @Override
    public void perkalian() {
    System.out.println("Masukkan angka pertama");
    super.a = s.nextInt();
    System.out.println("Masukkan angka kedua");
    super.b = s.nextInt();
    hasil = super.a * super.b;
    System.out.println("Hasil : "+hasil);
    }

    @Override
    public void pembagian() {
    System.out.println("Pembagian");
    System.out.println("---------");
    System.out.println("Masukkan angka pertama");
    super.a = s.nextInt();
    System.out.println("Masukkan angka kedua");
    super.b = s.nextInt();
    hasil = super.a/super.b;
    System.out.println("Hasil : "+hasil);
    }

}
