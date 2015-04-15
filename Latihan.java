import java.io.*;
class Latihan
{
	public static void main (String[]args)
	{
		try
		{
			BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
			int NoTrans;
			String Nama, Judul;
			int Jumlah, Harga;
			int Total;
			double DiskonBelanja = 0, DiskonTrans = 0;
			double TotalBayar;
			
			System.out.print("Masukkan Nomor Transaksi : ");
			NoTrans = Integer.parseInt(input.readLine());
			System.out.print("Masukkan Nama Pembeli : ");
			Nama = input.readLine();
			System.out.print("Masukkan Judul Buku : ");
			Judul = input.readLine();
			System.out.print("Masukkan Jumlah Beli : ");
			Jumlah = Integer.parseInt(input.readLine());
			System.out.print("Masukkan Harga Per Satuan : ");
			Harga = Integer.parseInt(input.readLine());
			
			Total =  Jumlah * Harga;
			if (Total > 150000)
			{
				DiskonBelanja =  Total*0.1;
			}
			else
			{
				if (Total <= 150000)
				{
					DiskonBelanja = 0;
				}
			}
			if (NoTrans > 50)
			{
				DiskonTrans = 0 ;
			}
			else
			{
				if (NoTrans <= 50)
				{
					DiskonTrans = Total * 0.05;
				}
			}
			TotalBayar =  Total -  DiskonBelanja - DiskonTrans;
			
			System.out.println();
			System.out.println("No Transaksi: " + NoTrans);
			System.out.println("Nama Pembeli: " + Nama);
			System.out.println("Judul Buku: " + Judul);
			System.out.println("Jumlah Beli: " + Jumlah);
			System.out.println("Total Beli: " + Total);
			System.out.println("Diskon Belanja(10%): " +  Math.round(DiskonBelanja));
			System.out.println("Diskon Transaksi (5%): " + Math.round(DiskonTrans));
			System.out.println("Total Bayar : " + Math.round(TotalBayar));

			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
