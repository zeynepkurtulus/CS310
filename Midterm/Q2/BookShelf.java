package q2;


import java.util.ArrayList;

public class BookShelf {
	
	ArrayList<Book> books;
	Integer numOfBooks;
	
	
	Integer getTotalNumberOfBooks() { //returns the total number of books 
		return books.size();
	}
	
	
	Book pickUpBook(int index) {
		return books.get(index);
	}
	
	
	//SETTERS AND GETTERS 
		public ArrayList<Book> getBooks() {
			return books;
		}
		public void setBooks(ArrayList<Book> books) {
			this.books = books;
		}
		public Integer getNumOfBooks() {
			return numOfBooks;
		}
		public void setNumOfBooks(Integer numOfBooks) {
			this.numOfBooks = numOfBooks;
		}
		
	
	public BookShelf(ArrayList<Book> _books){
		super();
		this.books = _books;
		this.numOfBooks = this.getTotalNumberOfBooks();
	
	}
	
	
	@Override
	public String toString() {
		return "BookShelf: " + "" + System.lineSeparator() + books +System.lineSeparator() + "Total number of books:" + numOfBooks;
	}
	
	
	String getInfo() {
		return this.toString();
	}
	
	
	

}
