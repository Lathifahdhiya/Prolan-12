package minggu10;
//berisi implementasi dasar dan lanjut
public class perhitungan extends hitungAbstrak {

    @Override
    public double tambah(double a1, double a2) {
        return a1+a2;
    }

    @Override
    public double kurang(double a1, double a2) {
        return a1 - a2;
    }

    @Override
    public double kali(double a1, double a2) {
        return a1 * a2;
    }

    @Override
    public double bagi(double a1, double a2) {
        return a1 / a2;
    }

    @Override
    public double kelilingPersegi(double a1) {
        return 4*a1;
    }

    @Override
    public double luasPersegi(double a1) {
        return a1 * a1;
    }

    @Override
    public double luasSegitiga(double a1, double a2) {
        return (a1 *a2)/2;
    }

    @Override
    public double luasPersegi(double a1, double a2) {
        return a1 * a2;
    }

    @Override
    public double luasLingkaran(double a1) {
        return 3.41 * (a1 * a1);
    }

    @Override
    public double luasJajaranGenjang(double a1, double a2) {
        return  a1 * a2;
    }

    @Override
    public double kelilingPersegi(double a1, double a2) {
        return (2*a1)+(2*a2);
    }

    @Override
    public double kelilingSegitiga(double a1, double a2, double a3) {
        return a1 + a2 + a3;
    }

    @Override
    public double kelilingLingkaran(double a1) {
        return 2 * 3.41 * a1;
    }

    @Override
    public double kelilingJajaranGenjang(double a1, double a2) {
        return (2*a1)+(2*a2);
    }
    
}
