package minggu10;
//berisi implementasi interface dasar dan lanjut
public abstract class hitungAbstrak implements dasar,lanjut,lanjut2{
    
    @Override
    public abstract double tambah(double a1, double a2);
    
    @Override
    public abstract double kurang(double a1, double a2);
    
    @Override
    public abstract double kali(double a1, double a2);
    
    @Override
    public abstract double bagi(double a1, double a2);
    
    @Override
    public abstract double kelilingPersegi(double a1);
    
    @Override
    public abstract double luasPersegi(double a1);//a1*a1
    
    @Override
    public abstract double luasSegitiga(double a1, double a2);//(a1*a2)/2
    
    @Override
    public abstract double luasPersegi (double a1, double a2);//a1*a2
    
    @Override
    public abstract double luasLingkaran (double a1);//phi*(a1*a1)
    
    @Override
    public abstract double luasJajaranGenjang(double a1, double a2);//a1*a2


    @Override
    public abstract double kelilingPersegi(double a1, double a2);

    @Override
    public abstract double kelilingSegitiga(double a1, double a2, double a3);

    @Override
    public abstract double kelilingLingkaran(double a1);

    @Override
    public abstract double kelilingJajaranGenjang(double a1, double a2);
    
    
}
