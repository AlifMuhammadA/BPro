public class array{
  public static void main (String[]args){
    int []total= new int [50] ;
    int []total1= new int [50];
    String [] barang= new String [4];
    barang[0]="Pensil       ";
    barang[1]="Buku Tulis   ";
    barang[2]="Buku Gambar  ";
    barang[3]="Penggaris    ";
 int [][]penjualan={{3,0,10,3,2},{1,3,7,10,5},{10,12,3,7,6},{3,1,1,2,1}};
    System.out.println("              Senin   Selasa   Rabu    Kamis   Jumat");
    for (int i=0; i<4; i++){
      System.out.print(barang[i]);
    for (int j=0; j<5; j++){
      
        System.out.print("  "+penjualan[i][j]+"     ");

if(j==0)
        {total[0]+=penjualan[i][j];}
        else if (j==1)

        {total[1]+=penjualan[i][j];}
        else if (j==2)

        {total[2]+=penjualan[i][j];}
        else if (j==3)

        {total[3]+=penjualan[i][j];}
        else if (j==4)

        {total[4]+=penjualan[i][j];}
        
        if(i==0)

        {total1[0]+=penjualan[i][j];}
        else if (i==1)

        {total1[1]+=penjualan[i][j];}
        else if (i==2)

        {total1[2]+=penjualan[i][j];}
        else if (i==3)

        {total1[3]+=penjualan[i][j];}
        else if (i==4)

        {total1[4]+=penjualan[i][j];}
    }
System.out.println();
  }
    System.out.println("              =====   =====   =====   =====    =====");
      System.out.print("Total");
    System.out.print("          "+total[0]);
    System.out.print("       "+total[1]);
    System.out.print("      "+total[2]);
    System.out.print("      "+total[3]);
    System.out.print("      "+total[4]);
    System.out.println();
      System.out.println("Total Pensil(Senin-Jumat)    ="+total1[0]);

      System.out.println("Total Buku Tulis(Senin-Jumat)    ="+total1[1]);
      System.out.println("Total Buku Gambar(Senin-Jumat)    ="+total1[2]);
     System.out.println("Total Penggaris(Senin-Jumat)    ="+total1[3]);
}
}
