package tubes;
import java.util.Scanner;
public class perhitungan extends hitung{
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
    public void luasLayang(){
        System.out.print("Masukkan diagonal pertama layang-layang : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan diagonal kedua layang-layang : ");
        d.a2 = s.nextDouble();
        d.hasil = (d.a1*d.a2)/2;
        System.out.println("Hasil = "+d.hasil);
    }
    public void luasBelahKetupat(){
        System.out.print("Masukkan diagonal pertama belah ketupat : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan diagonal kedua belah ketupat : ");
        d.a2 = s.nextDouble();
        d.hasil = (d.a1*d.a2)/2;
        System.out.println("Hasil = "+d.hasil);
    }
    public void luasTrapesium(){
        System.out.print("Masukkan alas trapesium : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan sisi sejajar alas trapesium : ");
        d.a2 = s.nextDouble();
        System.out.print("Masukkan tinggi trapesium : ");
        d.a3 = s.nextDouble();
        d.hasil = ((d.a1+d.a2)*d.a3)/2;
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
        System.out.print("Masukkan alas jajar genjang : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan sisi miring jajar genjang : ");
        d.a2 = s.nextDouble();
        d.hasil = (d.a1+d.a2)*2;
        System.out.println("Hasil = "+d.hasil);
    }
    public void kelilingLayang(){
        System.out.print("Masukkan sisi a layang-layang : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan sisi b layang-layang : ");
        d.a2 = s.nextDouble();
        d.hasil = (d.a1+d.a2)*2;
        System.out.println("Hasil = "+d.hasil);
    }
    public void kelilingBelahKetupat(){
        System.out.print("Masukkan sisi belah ketupat : ");
        d.a1 = s.nextDouble();
        d.hasil = d.a1*4;
        System.out.println("Hasil = "+d.hasil);
    }
    public void kelilingTrapesium(){
        System.out.print("Masukkan sisi a trapesium : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan sisi b trapesium : ");
        d.a2 = s.nextDouble();
        System.out.print("Masukkan sisi c trapesium : ");
        d.a3 = s.nextDouble();
        System.out.print("Masukkan sisi d trapesium : ");
        d.a4 = s.nextDouble();
        d.hasil = d.a1+d.a2+d.a3+d.a4;
        System.out.println("Hasil = "+d.hasil);
    }

    public void volumeKubus(){
        System.out.print("Masukkan rusuk kubus : ");
        d.a1 = s.nextDouble();
        d.hasil = d.a1*d.a1*d.a1*d.a1;
        System.out.println("Hasil = "+d.hasil);
    }
    public void volumeBalok(){
        System.out.print("Masukkan panjang balok : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan lebar balok : ");
        d.a2 = s.nextDouble();
        System.out.println("Masukkan tinggi balok : ");
        d.a3 = s.nextDouble();
        d.hasil = d.a1 * d.a2 * d.a3;
        System.out.println("Hasil = "+d.hasil);
    }
    public void volumeBola(){
        System.out.print("Masukkan jari-jari bola : ");
        d.a1 = s.nextDouble();
        d.hasil = (4/3)*3.14*d.a1*d.a1*d.a1;
        System.out.println("Hasil = "+d.hasil);
    }

    public void volumeLimasPersegi(){
        System.out.print("Masukkan sisi alas limas : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan tinggi limas : ");
        d.a2 = s.nextDouble();
        d.hasil = (1/3)*d.a1*d.a1*d.a2;
        System.out.println("Hasil = "+d.hasil);
    }
    public void volumeLimasSegiempat(){
        System.out.print("Masukkan panjang alas limas : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan lebar alas limas : ");
        d.a2 = s.nextDouble();
        System.out.println("Masukkan tinggi limas : ");
        d.a3 = s.nextDouble();
        d.hasil = (1/3)*d.a1*d.a2*d.a3;
        System.out.println("Hasil = "+d.hasil);
    }
    public void volumeKerucut(){
        System.out.print("Masukkan jari-jari alas kerucut : ");
        d.a1 = s.nextDouble();
        System.out.print("Masukkan tinggi kerucut : ");
        d.a2 = s.nextDouble();
        d.hasil = (1/3)*3.14*d.a1*d.a1*d.a2;
        System.out.println("Hasil = "+d.hasil);
    }
}