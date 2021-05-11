import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		//(new Menu()).menu();
		String choose = "";
		Scanner sc = new Scanner(System.in);
		while(!choose.equals("q")){
			Menu.menu();
			System.out.print(">>>>");
			choose = sc.next();
			
			switch(choose.toLowerCase()){
				case "1":{
					ToDoUtils.showNotes();
					break;
				}
				case "2":{
					break;
						
				}
				case "3":{
					break;
						
				}
				case "4":{
					break;
						
				}
				case "5":{
					break;
						
				}
				case "q":{
					break;
						
				}
				default:{
					System.out.println("Nie ma takiej opcji! Wybierz cos innego");
						
				}
					
			}
		}
		
		//ToDoUtils.showNotes();
	}
	
	private static void readFormFile(){
		FileUtils fu = new FileUtils();
		fu.readFromFile();
	}
	
	private static void testingDateTimeFormatter(){
		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
		LocalDateTime lDT1 = LocalDateTime.now();
		System.out.println(dTF.format(lDT1));
		dTF = DateTimeFormatter.ofPattern("YYYY LLLL dd");
		System.out.println(dTF.format(lDT1));
	}
	
	private static void testSaveToFile(){
		FileUtils fu = new FileUtils();
		fu.saveToFile(new ToDo("Kończenie prac nad programem",
			"Koniec prac na działaniem programu już jest blisko"));
			
		fu.saveToFile(new ToDo("Do zrobienie MENU",
			"Zrobimy MENU w pętli aby można było wybierać, kasować, modyfikować nasze wpisy"));
		fu.readFromFile();
	}	
	
	private static void testReadFromKeyBoard(){
		ReadFromKeyboard rfk = new ReadFromKeyboard();
		ToDo td = rfk.readOneToDo();
		System.out.println(td);
	}
	
	private static void test(){
		ToDo td1 = new ToDo("Pierwsza",
		"To jest pierwsza notatka");
		ToDo td2 = new ToDo("Dwa","Druga notatka z autorem",
		"adams");
		System.out.println(td1);
		System.out.println(td2);
	}
} 
