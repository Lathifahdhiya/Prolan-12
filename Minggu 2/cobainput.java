import java.util.Scanner;

public class cobainput
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String nama, NIM, alamat;
		System.out.println("Masukkan nama anda : ");
		nama = s.nextLine();
		System.out.println("Masukkan NIM anda : ");
		NIM = s.nextLine();
		System.out.println("Masukkan alamat anda : ");
		alamat = s.nextLine();
		System.out.println("-----------------------");
		System.out.println("Nama anda : "+nama+"\nNIM anda : "+NIM+"\nalamat anda : "+alamat);
	}
}