package q2;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Page page1 = new Page(1, "Page 1 Content");
		Page page2 = new Page(2, "Page 2 Content");
		Page page3 = new Page(1, "Page 1 Content");
		Page page4 = new Page(2, "Page 2 Content");
		
		ArrayList<Page> p = new ArrayList<Page>();
		ArrayList<Page> p2 = new ArrayList<Page>();
		
		p.add(page1);
		p.add(page2);
		p2.add(page3);
		p2.add(page4);
		
		Chapter ch1 = new Chapter(1, "First Chapter", p);
		Chapter ch2 = new Chapter(1, "First Chapter", p2);
		
		
		ArrayList<Chapter> c = new ArrayList<Chapter>();
		ArrayList<Chapter> c2 = new ArrayList<Chapter>();
		
		c.add(ch1);
		c2.add(ch2);
		
		
		Book b = new Book("Grapes of Wrath", "Fore word of Grapes Of Wrath", c);
		Book b2 = new Book("Introduction to Java", "Fore word of Intro to Java", c2);
		
		ArrayList<Book> barr = new ArrayList<Book>();
		
		barr.add(b);
		barr.add(b2);
		
		
		BookShelf shelf = new BookShelf(barr);
		System.out.println(shelf.getInfo());
		//Integer p0num = shelf.pickUpBook(0).getNumOfPages();
		//Integer p1num = shelf.pickUpBook(1).getNumOfPages();
		System.out.println("");
		Book pick = shelf.pickUpBook(0);
		Book pick2 = shelf.pickUpBook(1);

		
		System.out.println(pick);
		System.out.println(shelf.pickUpBook(0).chapters);
		
		
		/*
		System.out.println("Page: no: " + page1.getNo() + " , content: " + page1.getContent() + System.lineSeparator());
		System.out.println("Page: no: " + page2.getNo() + " , content: " + page2.getContent() + System.lineSeparator());
		System.out.println(pick2);
		System.out.println(shelf.pickUpBook(1).chapters);
		System.out.println("Page: no: " + page3.getNo() + " , content: " + page3.getContent() + System.lineSeparator());
		System.out.println("Page: no: " + page4.getNo() + " , content: " + page4.getContent() + System.lineSeparator());
		//System.out.println(shelf.pickUpBook(0));
		//System.out.println("");
		//System.out.println(shelf.pickUpBook(1));
		System.out.println("");
		System.out.println("Pick up book:" + pick.getInfo());
		System.out.println(pick.getChapters());
		System.out.println("Page: no:1"  + ", content:" + page1.getContent());
		System.out.println("Page: no:" + pick.getNumOfPages() + ", content:" + page2.getContent());
		
		*/
		
	}

}
