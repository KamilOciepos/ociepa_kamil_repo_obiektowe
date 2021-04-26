import java.time.LocalDateTime;

class ToDo{
	private String title = "";
	private String content = "";
	private String author = "Anonymous";
	private LocalDateTime add_date = LocalDateTime.now();
	
	
	public ToDo(String title, String content){
		this.title = title;
		this.content = content;
	}
	
	public ToDo(String title,String content,String author){
		this.title = title;
		this.content = content;
		this.author = author;	
	}
	
	@Override
	
	public String toString(){
		return "Title: "+title+"\n"
			+"Content: "+content+"\n"
			+"Author: "+author+"\n"
			+"Data: "+date+"\n";
}