import java.util.Scanner;

public class inputoutput
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner (System.in);
		String nama;
		char jenisKelamin;
		int umur;
		boolean status;
		System.out.println("Masukkan nama anda : ");
		nama = s.nextLine();
		System.out.println("Masukkan umur anda : ");
		umur = s.nextInt();
		System.out.println("Masukkan jenis kelamin anda : ");
		jenisKelamin = s.next().charAt(0);
		System.out.println("Masukkan status anda : (True atau False)");
		status = s.nextBoolean();
		System.out.println("----------------------------------------");
		System.out.println("Nama : "+nama+"\nUmur : "+umur+"\nJenis Kelamin : "+jenisKelamin+"\nStatus : "+status);
	}
}