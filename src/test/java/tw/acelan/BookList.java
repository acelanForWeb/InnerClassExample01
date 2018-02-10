package tw.acelan;

public class BookList {
	// BookNode is a inner class
	private class BookNode{
		public Book book;
		public BookNode next;
		
		public BookNode(Book book){
			this.book = book;
			next = null;
		}
	}
	
	
	private BookNode list;//指向一個BookNode節點
	
	public BookList(){
		list = null;
	}
	
	//新增一本Book到Book串列中
	public void add(Book book){
		BookNode node = new BookNode(book);
		BookNode tmpNode;
		if(list == null){
			list = node;
		}else{
			tmpNode = list;
			while(tmpNode.next != null){
				tmpNode = tmpNode.next;
			}
			tmpNode.next=node;//將新的節點加到最後的節點之後
		}
	}
	
	//輸出書本串列內容
	public String toString(){
		String str = "";
		BookNode tmpNode = list;
		while(tmpNode != null){
			str += tmpNode.book + "\n";
			tmpNode = tmpNode.next;
		}
		
		return str;
	}
}
