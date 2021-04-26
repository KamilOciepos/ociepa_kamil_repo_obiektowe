import java.util.Scanner;

class ReadFromKeyboard{
	public ToDo readOneToDo(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj tytuł: ");
		String title = sc.nextLine();
		System.out.println("Podaj treść notatki: ");
		String content = sc.nextLine();
		System.out.println("Podaj autor lub naciśnij ENTER jeśli nie chcesz podawać: ");
		String author = sc.nextLine();
		
		
		if(author.length()<0){
			return new ToDo(title,content);	
		}else{
			return new ToDo(tile,content,author);
		}
	}
	
	
}