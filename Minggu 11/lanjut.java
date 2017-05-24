package minggu10;
//berisi perhitungan luas persegi, luas segitiga, luas persegi panjang, luas lingkaran, luas jajaran genjang
public interface lanjut {
    public abstract double luasPersegi(double a1);//a1*a1
    public abstract double luasSegitiga(double a1, double a2);//(a1*a2)/2
    public abstract double luasPersegi (double a1, double a2);//a1*a2
    public abstract double luasLingkaran (double a1);//phi*(a1*a1)
    public abstract double luasJajaranGenjang(double a1, double a2);//a1*a2
}