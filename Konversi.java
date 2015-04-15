class Konversi
{

	public static void main (String[] args)
	{
		String str1="10000";
		String str2="5.6";
		int bulat = Integer.parseInt (str1);
		double pecahan =  Double.parseDouble (str2);
		
		System.out.println ("Hasil dari Str1 = "+str1);
		System.out.println ("Hasil dari Str2 = "+str2);
		
		System.out.println("Hasil dari Str1xStr2 = " + Math.round(bulat*pecahan));
		System.out.println();
		
		System.out.println("Hasil dari bulat = "+bulat);
		System.out.println("Hasil dari pecahan = "+pecahan);
		System.out.println("Hasil dari bulat+pecahan ="+(bulat+pecahan));
		}
		
}
