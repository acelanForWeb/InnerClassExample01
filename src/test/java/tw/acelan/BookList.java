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
	
	
	private BookNode list;//���V�@��BookNode�`�I
	
	public BookList(){
		list = null;
	}
	
	//�s�W�@��Book��Book��C��
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
			tmpNode.next=node;//�N�s���`�I�[��̫᪺�`�I����
		}
	}
	
	//��X�ѥ���C���e
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
