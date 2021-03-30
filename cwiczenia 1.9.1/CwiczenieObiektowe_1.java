
class CwiczenieObiektowe_1{
	
	public static void main(String[] args){
		MojeDane md = new MojeDane("Kamil","Ociepa","2PTN");
		System.out.println(md.imie+" "+md.nazwisko+" "+md.klasa);
		
		Logowanie lg = new Logowanie("akronim","haselko");
		System.out.println(lg);
	}
}