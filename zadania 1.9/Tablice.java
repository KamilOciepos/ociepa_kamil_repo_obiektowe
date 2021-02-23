import java.util.Random;
import java.util.Scanner;
import java.io.*;

class Tablice{
    public static void main(String[] args){
		
		String imienazwisko[] = new String[10];
		int oceny[] = new int[10];
		int i;
		for(i=0; i<10; i++){
			oceny[i] = (int)(Math.random()*6+1);
        }
		i = 0;
		try{
            Scanner sc = new Scanner(new File("imienazwisko.txt"));
            while(sc.hasNext()){
                imienazwisko[i] = sc.nextLine();
				i++;
            }
        }catch (FileNotFoundException ex){
            System.out.println("ERROR -> "+ex.toString());
        }
		
		
		for(i=0; i<10; i++){
			System.out.println(imienazwisko[i] +" "+  oceny[i]);
        }
    }
}