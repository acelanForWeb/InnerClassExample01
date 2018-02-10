package tw.acelan;

public class Test {
	public static void main(String[] args){
		//new 一個book串列
		BookList bookList= new BookList();
		
		//new出三本書
		Book book1=new Book("艾斯藍學習筆記1");
		Book book2=new Book("艾斯藍學習筆記2");
		Book book3=new Book("艾斯藍學習筆記3");
		
		//將書加入到book串列中
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		//輸出該串列中的書本
		System.out.println(bookList);
	}
}
