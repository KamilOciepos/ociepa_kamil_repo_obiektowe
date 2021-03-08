class rekurencja{
	public static void main(String [] args){
		//rekurencja(5);
		//System.out.println(zwracamjedynke());
		//System.out.println(zwracamtekst());
		//System.out.println(potega(5));
		System.out.println(sumaDwochNajwiekLiczb(5,6,3);
	}
	private static int sumaDwochNajwiekLiczb(int a, int b, int c){
		int suma = 0;
		if(a>b && b>c){
			suma = a+b;
		}else if(a>b && c>b{
			suma = a+c;
		}else if(b>a && c>a{
			suma b+c;
		}
		return suma;
	}
	
	private static int potega(int liczba){
		return liczba*liczba;
	}
	
	private static int zwracamjedynke(){
		return 1;	
	}
	private static String zwracamtekst(){
		return "Zwracam Stringa";	
	}
	private static int rekurencja(int i){
		if(i>0){
			System.out.println("rekurencja "+ i);
			i--;
		}else{
			return 0;
		}
		rekurencja(i);
		return -1;
	}
	
	
}
	