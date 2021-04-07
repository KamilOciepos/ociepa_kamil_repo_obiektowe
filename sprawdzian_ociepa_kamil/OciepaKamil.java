import java.util.Random;

class OciepaKamil{
	
	public static void main(String[] args){
		Sprawdzian sp = new Sprawdzian("2021-04-07",6,"Programowanie Obiektowe");
		System.out.println(sp.data+"\n"+sp.ocena+"\n"+sp.przedmiot);
		
		Dane dn = new Dane("Kamil","Ociepa","2005-02-08");
		System.out.println(dn);
		
		Tablica tab = new Tablica;
		System.out.println(tab);
		
	}
}