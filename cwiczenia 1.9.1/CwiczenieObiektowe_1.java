
class CwiczenieObiektowe_1{
	
	public static void main(String[] args){
		MojeDane md = new MojeDane("Kamil","Ociepa","2PTN");
		System.out.println(md.imie+" "+md.nazwisko+" "+md.klasa);
		
		Logowanie lg = new Logowanie("akronim","haselko");
		System.out.println(lg);
		
		Kolo kolo = new Kolo(4);
		kolo.pole_kola();
		kolo.obwod_kola();
		
		PolaObwody pola = new PolaObwody(2,4);
		pola.PoleKwadratu();
		pola.ObwodKwadratu();
		pola.PoleProstokata();
		pola.ObwodProstokata();
	}
}