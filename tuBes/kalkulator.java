package tubes;
import java.util.Scanner;
public class kalkulator extends perhitungan{
    public static void main (String [] args){
        char pil;
        char ulang = 'y';
        perhitungan p = new perhitungan ();
        Scanner s = new Scanner (System.in);
        while (ulang == 'y'){
        System.out.println("KALKULATOR");
        System.out.println("----------");
        System.out.println("MENU");
        System.out.println("1. Perhitungan dasar");
        System.out.println("2. Perhitungan luas");
        System.out.println("3. Perhitungan keliling");
        System.out.println("4. Perhitungan volume");
        pil = s.next().charAt(0);
        switch (pil){
            case '1' :  System.out.println("PERHITUNGAN DASAR");
                        System.out.println("-----------------");
                        System.out.println("1. Pertambahan");
                        System.out.println("2. Pengurangan");
                        System.out.println("3. Perkalian");
                        System.out.println("4. Pembagian");
                        pil = s.next().charAt(0);
                        switch (pil){
                            case '1' :  System.out.println("PERTAMBAHAN");
                                        p.pertambahan();
                                        break;
                            case '2' :  System.out.println("PENGURANGAN");
                                        p.pengurangan();
                                        break;
                            case '3' :  System.out.println("PERKALIAN");
                                        p.perkalian();
                                        break;
                            case '4' :  System.out.println("PEMBAGIAN");
                                        p.pembagian();
                                        break;
                            default : System.out.println("Pilihan tidak dikenali");
                        }
                        break;
            case '2' :  System.out.println("PERHITUNGAN LUAS");
                        System.out.println("1. Luas persegi");
                        System.out.println("2. Luas persegi panjang");
                        System.out.println("3. Luas segitiga");
                        System.out.println("4. Luas jajar genjang");
                        System.out.println("5. Luas lingkaran");
                        System.out.println("6. Luas layang-layang");
                        System.out.println("7. Luas belah ketupat");
                        System.out.println("8. Luas trapesium");
                        pil = s.next().charAt(0);
                        switch (pil){
                            case '1' :  System.out.println("LUAS PERSEGI");
                                        p.luasPersegi();
                                        break;
                            case '2' :  System.out.println("LUAS PERSEGI PANJANG");
                                        p.kelilingPersegipanjang();
                                        break;
                            case '3' :  System.out.println("LUAS SEGITIGA");
                                        p.luasSegitiga();
                                        break;
                            case '4' :  System.out.println("LUAS JAJAR GENJANG");
                                        p.luasJajargenjang();
                                        break;
                            case '5' :  System.out.println("LUAS LINGKARAN");
                                        p.luasLingkaran();
                                        break;
                            case '6' :  System.out.println("LUAS LAYANG-LAYANG");
                                        p.luasLayang();
                                        break;
                            case '7' :  System.out.println("LUAS BELAH KETUPAT");
                                        p.luasBelahKetupat();
                                        break;
                            case '8' :  System.out.println("LUAS TRAPESIUM");
                                        p.luasTrapesium();
                                        break;
                            default :   System.out.println("Pilihan tidak dikenali");
                        }
                        break;
            case '3' :  System.out.println("PERHITUNGAN KELILING");
                        System.out.println("1. Keliling persegi");
                        System.out.println("2. Keliling persegi panjang");
                        System.out.println("3. Keliling segitiga");
                        System.out.println("4. Keliling lingkaran");
                        System.out.println("5. Keliling layang-layang");
                        System.out.println("6. Keliling belah ketupat");
                        System.out.println("7. Keliling trapesium");
                        System.out.println("8. Keliling jajar genjang");
                        pil = s.next().charAt(0);
                        switch (pil){
                            case '1' :  System.out.println("KELILING PERSEGI");
                                        p.keliingPersegi();
                                        break;
                            case '2' :  System.out.println("KELILING PERSEGI PANJANG");
                                        p.kelilingPersegipanjang();
                                        break;
                            case '3' :  System.out.println("KELILING SEGITIGA");
                                        p.kelilingSegitiga();
                                        break;
                            case '4' :  System.out.println("KELILING LINGKARAN");
                                        p.kelilingLingkaran();
                                        break;
                            case '5' :  System.out.println("KELILING LAYANG-LAYANG");
                                        p.kelilingLayang();
                                        break;
                            case '6' :  System.out.println("KELILING BELAH KETUPAT");
                                        p.kelilingBelahKetupat();
                                        break;
                            case '7' :  System.out.println("KELILING TRAPESIUM");
                                        p.kelilingTrapesium();
                                        break;
                            case '8' :  System.out.println("KELILING JAJAR GENJANG");
                                        p.kelilingJajargenjang();
                                        break;
                            default :   System.out.println("Pilihan tidak dikenali");
                            }
                            break;
            case '4' :  System.out.println("PERHITUNGAN VOLUME");
                        System.out.println("1. Volume kubus");
                        System.out.println("2. Volume balok");
                        System.out.println("3. Volume bola");
                        System.out.println("4. Volume limas persegi");
                        System.out.println("5. Volume limas segiempat");
                        System.out.println("6. Volume kerucut");
                        pil = s.next().charAt(0);
                        switch (pil){
                            case '1' :  System.out.println("VOLUME KUBUS");
                                        p.volumeKubus();
                                        break;
                            case '2' :  System.out.println("VOLUME BALOK");
                                        p.volumeBalok();
                                        break;
                            case '3' :  System.out.println("VOLUME BOLA");
                                        p.volumeBola();
                                        break;
                            case '4' :  System.out.println("VOLUME LIMAS PERSEGI");
                                        p.volumeLimasPersegi();
                                        break;
                            case '5' :  System.out.println("VOLUME LIMAS SEGIEMPAT");
                                        p.volumeLimasSegiempat();
                                        break;
                            case '6' :  System.out.println("VOLUME KERUCUT");
                                        p.volumeKerucut();
                                        break;
                            default :   System.out.println("Pilihan tidak dikenali");
                            }
                            break;
            default : System.out.println("Pilihan tidak dikenali");
            }
        System.out.println("Kembali ke menu utama ? (y/t)");
        ulang = s.next().charAt(0);
        }
    }
}
