import java.util.Random;

class Tablice{
    public static void main(String[] args){
		
		
		int oceny[] = new int[10];
		int i;
		for(i=0; i<10; i++){
			oceny[i] = (int)(Math.random()*6+1);
        }
		
		
		
		
		for(i=0; i<10; i++){
			System.out.println(oceny[i]);
        }
    }
}