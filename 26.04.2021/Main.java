

class Main{

    public static void main(String[] args){
		ReadFromKeyboard rfk = new ReadFromKeyboard();
		ToDo td = rfk.readOneToDo();
		System.out.println(td);
		
	}
	private static void test(){
		ToDo td1 = new ToDo("Pierwsza","To jest pierwsza notatka");
		ToDo td2 = new ToDo("Druga","To jest druga notatka z autorem","Kamil");
		
		System.out.println(td1);
		System.out.println(td2);
		
		
		
	}
}