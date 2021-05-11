import java.util.ArrayList;
import java.util.Scanner;

class ToDoUtils{
	public static void showNotes(){
		FileUtils fu = new FileUtils();
		ArrayList<ToDo> list = fu.readFromFile();
		System.out.println("Wybierz notatke do wyświetlenia:");
		for (int i=0;i<list.size();i++){
			System.out.println((i+1)+" "+ list.get(i).getTitle() );
		}
		System.out.print(">>> ");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		System.out.print(list.get(choose-1));
	}
}
