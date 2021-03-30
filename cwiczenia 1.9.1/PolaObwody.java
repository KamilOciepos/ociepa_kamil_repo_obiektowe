class PolaObwody{
	
	private int pierwszybok;
	private int drugibok;
	
	public PolaObwody(int pierwszybok,int drugibok){
		this.pierwszybok = pierwszybok;
		this.drugibok = drugibok;
		
	}
	public int PoleKwadratu(){
		int PoleKwadratu = pierwszybok*pierwszybok;
		System.out.println("Pole kwadratu: "+ PoleKwadratu);
		return PoleKwadratu;
	}
	public int ObwodKwadratu(){
		int ObwodKwadratu = 4*pierwszybok;
		System.out.println("Obwod kwadratu: "+ ObwodKwadratu);
		return ObwodKwadratu;
	}
	public int PoleProstokata(){
		int PoleProstokata = pierwszybok*drugibok;
		System.out.println("Pole prostokata: "+ PoleProstokata);
		return PoleProstokata;
	}
	public int ObwodProstokata(){
		int ObwodProstokata = 2*pierwszybok+2*drugibok;
		System.out.println("Obwod Prostokata: "+ObwodProstokata);
		return ObwodProstokata;
	}
	
}