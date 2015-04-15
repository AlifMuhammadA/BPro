import java.io.*;

class Transaksi
{
	public static void main(String[]args)throws IOException
	{
			String Ndepan;
			String Nbelakang;
			String Nbarang;
			int HargaSatuan;
			int JumlahBarangDiBeli;
			
			BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
			
		
			System.out.print("Masukan Ndepan: ");
			Ndepan = input.readLine();
			
			System.out.print("Nbelakang: ");
			Nbelakang = input.readLine();
			
			System.out.print("Masukan Nbarang: ");
			Nbarang = input.readLine();
			
			System.out.print("HargaSatuan: ");
			HargaSatuan = Integer.parseInt(input.readLine());
			
			System.out.print("JumlahBarangDiBeli: ");
			JumlahBarangDiBeli = Integer.parseInt(input.readLine());
			
			System.out.println("Nama Pelanggan : "+ Ndepan +" "+ Nbelakang);
			System.out.println("Item : " + Nbarang+ "(@Rp"+HargaSatuan +")");
			System.out.println("Jumlah Yang Di Beli : " + JumlahBarangDiBeli);
			System.out.println("Harga Sebelum Diskon : " + (HargaSatuan * JumlahBarangDiBeli));
			System.out.println("Diskon Tetap : "+( HargaSatuan*JumlahBarangDiBeli*(10/100)));
			System.out.println("Total Bayar : " + ((HargaSatuan * JumlahBarangDiBeli) - (HargaSatuan * JumlahBarangDiBeli* 0.1)));
	
			
	}
}
