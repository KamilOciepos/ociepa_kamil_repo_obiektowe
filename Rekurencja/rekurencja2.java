class rekurencja2{
	public static void main(String[] args){
        long liczba = obliczanieSilni(14);
		System.out.print(podzieleniewyrazu(hejka));
		System.out.println(""+Integer.MAX_VALUE);
		System.out.println(""+Long.MAX_VALUE);
		System.out.println("Wynik: "+liczba);
    }

    private static int sumaKolejnychLiczb(int liczba){
        if(liczba>0){ 
			System.out.println(liczba);
			return liczba+sumaKolejnychLiczb(liczba-1);
		}
		System.out.println("Koniec rekurencji liczba = "+ liczba);
		return 0;
	}
	private static int obliczanieSilni(int liczba){
		if(liczba >1){
			return liczba * obliczanieSilni(liczba);
		}
		return 1;
	}
	private static String podzieleniewyrazu(String wyraz){
        int dlugosc = wyraz.length();
        if(dlugosc>1){
            System.out.println(wyraz);
			
            return podzieleniewyrazu(wyraz.substring(0, dlugosc-1));
        }
        return ""; 
    }
	
	
}
	