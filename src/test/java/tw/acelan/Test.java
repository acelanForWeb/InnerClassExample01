package tw.acelan;

public class Test {
	public static void main(String[] args){
		//new �@��book��C
		BookList bookList= new BookList();
		
		//new�X�T����
		Book book1=new Book("�㴵�žǲߵ��O1");
		Book book2=new Book("�㴵�žǲߵ��O2");
		Book book3=new Book("�㴵�žǲߵ��O3");
		
		//�N�ѥ[�J��book��C��
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		//��X�Ӧ�C�����ѥ�
		System.out.println(bookList);
	}
}
