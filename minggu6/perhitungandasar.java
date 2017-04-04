
package minggu6;

public class perhitungandasar {
    int angka1;
    int angka2;
    int hasil;
    String x;
    
    perhitungandasar(){
        
        this.x = "contoh penggunaan this";
    }
    public void pertambahan(int a,int b){
        hasil = angka1 + angka2;
        System.out.println("hasil = "+hasil);
    }
    public void pengurangan(int a,int b){
        hasil = angka1 - angka2;
        System.out.println("hasil = "+hasil);        
    }
    public void perkalian(int a,int b){
        hasil = angka1 * angka2;
        System.out.println("hasil = "+hasil);
    }
    public void pembagian(int a,int b){
        hasil = angka1 / angka2;
        System.out.println("hasil = "+hasil);        
    }
    
    public static void main (String [] args){
        perhitungandasar p = new perhitungandasar();
        System.out.println(p.x);
    }
}
