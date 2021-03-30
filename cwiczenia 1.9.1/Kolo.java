class Kolo{
	
	private double liczba_pi = 3.1415;
	private double promien;
	
	public Kolo(double promien){
		this.promien = promien;
		
	}
	
	public double pole_kola(){
		double pole = liczba_pi * (promien*promien);
		System.out.println("Obwod pole: "+pole);
		return pole;
	}
	public double obwod_kola(){
		double obwod = 2*liczba_pi*promien;
		System.out.println("Obwod kola: "+obwod);
		return obwod;
	}
}