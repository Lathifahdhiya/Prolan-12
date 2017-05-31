package minggu12;
import java.util.Scanner;
public class perhitungan extends hitungAbstrak{
    type <Integer> i = new type <> ();
    type <Double> d = new type <> ();
    Scanner s = new Scanner (System.in);
    private char p;
    public void pertambahan(){
        System.out.println("Bilangan bulat/desimal? (b/d)");
        p = s.next().charAt(0);
        switch (p){
            case 'b' :  System.out.print("Masukkan angka pertama :");
                        i.a1 = s.nextInt();
                        System.out.print("Masukkan angka kedua :");
                        i.a2 = s.nextInt();
                        i.hasil = i.a1 + i.a2;
                        System.out.println(i.a1+" + "+i.a2+" = "+i.hasil);
                        break;
            case 'd' :  System.out.print("Masukkan angka pertama :");
                        d.a1 = s.nextDouble();
                        System.out.print("Masukkan angka kedua :");
                        d.a2 = s.nextDouble();
                        d.hasil = d.a1 + d.a2;
                        System.out.println(d.a1+" + "+d.a2+" = "+d.hasil);
                        break;
        } 
    }
    public void pengurangan(){
        System.out.println("Bilangan bulat/desimal? (b/d)");
        p = s.next().charAt(0);
        switch (p){
            case 'b' :  System.out.print("Masukkan angka pertama :");
                        i.a1 = s.nextInt();
                        System.out.print("Masukkan angka kedua :");
                        i.a2 = s.nextInt();
                        i.hasil = i.a1 - i.a2;
                        System.out.println(i.a1+" - "+i.a2+" = "+i.hasil);
                        break;
            case 'd' :  System.out.print("Masukkan angka pertama :");
                        d.a1 = s.nextDouble();
                        System.out.print("Masukkan angka kedua :");
                        d.a2 = s.nextDouble();
                        d.hasil = d.a1 - d.a2;
                        System.out.println(d.a1+" - "+d.a2+" = "+d.hasil);
                        break;
        }
    }
    public void perkalian(){
        System.out.println("Bilangan bulat/desimal? (b/d)");
        p = s.next().charAt(0);
        switch (p){
            case 'b' :  System.out.print("Masukkan angka pertama :");
                        i.a1 = s.nextInt();
                        System.out.print("Masukkan angka kedua :");
                        i.a2 = s.nextInt();
                        i.hasil = i.a1 * i.a2;
                        System.out.println(i.a1+" * "+i.a2+" = "+i.hasil);
                        break;
            case 'd' :  System.out.print("Masukkan angka pertama :");
                        d.a1 = s.nextDouble();
                        System.out.print("Masukkan angka kedua :");
                        d.a2 = s.nextDouble();
                        d.hasil = d.a1 * d.a2;
                        System.out.println(d.a1+" * "+d.a2+" = "+d.hasil);
                        break;
        }
    }
    public void pembagian(){
        System.out.println("Bilangan bulat/desimal? (b/d)");
        p = s.next().charAt(0);
        switch (p){
            case 'b' :  System.out.print("Masukkan angka pertama :");
                        i.a1 = s.nextInt();
                        System.out.print("Masukkan angka kedua :");
                        i.a2 = s.nextInt();
                        i.hasil = i.a1 / i.a2;
                        System.out.println(i.a1+" / "+i.a2+" = "+i.hasil);
                        break;
            case 'd' :  System.out.print("Masukkan angka pertama :");
                        d.a1 = s.nextDouble();
                        System.out.print("Masukkan angka kedua :");
                        d.a2 = s.nextDouble();
                        d.hasil = d.a1 / d.a2;
                        System.out.println(d.a1+" / "+d.a2+" = "+d.hasil);
                        break;
        }
    }
    
    public void luasSegitiga(){
        System.out.print("Masukkan alas segitiga : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan tinggi segitiga : ");
        d.a2 = s.nextDouble();
        d.hasil = (d.a1 * d.a2)/2;
        System.out.println("Hasil = "+d.hasil);
    }
    public void luasPersegi(){
        System.out.print("Masukkan sisi persegi : ");
        d.a1 = s.nextDouble();
        d.hasil = d.a1 * d.a1;
        System.out.println("Hasil = "+d.hasil);
    }
    public void luasPersegipanjang(){
        System.out.print("Masukkan panjang persegi panjang : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan lebar persegi panjang : ");
        d.a2 = s.nextDouble();
        d.hasil = d.a1 * d.a2;
        System.out.println("Hasil = "+d.hasil);
    }
    public void luasJajargenjang(){
        System.out.print("Masukkan alas jajar genjang : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan tinggi jajar genjang : ");
        d.a2 = s.nextDouble();
        d.hasil = (d.a1 * d.a2)/2;
        System.out.println("Hasil = "+d.hasil);
    }
    public void luasLingkaran(){
        System.out.print("Masukkan jari-jari lingkaran : ");
        d.a1 = s.nextDouble();
        d.hasil = 3.14 * d.a1 * d.a1;
        System.out.println("Hasil = "+d.hasil);
    }
    
    public void kelilingSegitiga(){
        System.out.print("Masukkan sisi pertama segitiga : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan sisi kedua segitiga : ");
        d.a2 = s.nextDouble();
        System.out.println("Masukkan sisi ketiga segitiga : ");
        d.a3 = s.nextDouble();
        d.hasil = d.a1 + d.a2 + d.a3;
        System.out.println("Hasil = "+d.hasil);
    }
    public void keliingPersegi(){
        System.out.print("Masukkan sisi persegi : ");
        d.a1 = s.nextDouble();
        d.hasil = d.a1*4;
        System.out.println("Hasil = "+d.hasil);
    }
    public void kelilingPersegipanjang(){
        System.out.print("Masukkan panjang persegi : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan lebar persegi : ");
        d.a2 = s.nextDouble();
        d.hasil = (d.a1*2)+(d.a2*2);
        System.out.println("Hasil = "+d.hasil);
    }
    public void kelilingLingkaran(){
        System.out.print("Masukkan jari-jari lingkaran : ");
        d.a1 = s.nextDouble();
        d.hasil = 2 * 3.14 * d.a1;
        System.out.println("Hasil = "+d.hasil);
    }
    public void kelilingJajargenjang(){
        System.out.println();
    }
}