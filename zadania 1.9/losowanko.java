import java.util.Random;
import java.util.Scanner;
import java.io.*;

class losowanko{
    public static void main(String[] args){
		
		int czylosowac[] = new int[10]; 
		int ileliczb[] = new int[10];
		int i = 0;
		int j;
		
		try{
            Scanner sc = new Scanner(new File("ileliczb.txt"));
            while(sc.hasNext()){
                ileliczb[i] = sc.nextInt();
				i++;
            }
        }catch (FileNotFoundException ex){
            System.out.println("ERROR -> "+ex.toString());
        }
		i=0;
		try{
            Scanner sc = new Scanner(new File("czylosowac.txt"));
            while(sc.hasNextInt()){
                czylosowac[i] = sc.nextInt();
				i++;
            }
        }catch (FileNotFoundException ex){
            System.out.println("ERROR -> "+ex.toString());
        }
		for(i=0; i<czylosowac.length; i++){
			if(czylosowac[i] == 1){
				System.out.print(i+1+". Losuje "+ileliczb[i]+" liczb: ");
				for(j=0; j<ileliczb[i]; j++){
					System.out.print((int) (Math.random()*80+1)+" ");
				}
				System.out.println("");
			}else{
				System.out.println(i+1+". Wczytano liczbe 0, nie losuje liczby");
			}
			
        }
		
    }
}