package q2;



import java.util.ArrayList;

public class Book {

	String title;
	String foreWord;
	ArrayList<Chapter> chapters;
	Integer numOfPages;
	
	Integer getNumberOfPages()
	{
		Integer total = 0;
		for(Chapter c: chapters) {
			total += c.pages.size();
		}
		return total;
	}
	
	
	public Book(String _title, String _foreWord, ArrayList<Chapter> _chapters){
		super();
		this.title = _title;
		this.foreWord = _foreWord;
		this.chapters = _chapters;
		Integer total= this.getNumberOfPages();
		this.numOfPages = total;
	}
	
	 //SETTER AND GETTERS 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getForeWord() {
		return foreWord;
	}
	public void setForeWord(String foreWord) {
		this.foreWord = foreWord;
	}
	public ArrayList<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	public Integer getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(Integer numOfPages) {
		this.numOfPages = numOfPages;
	}

	@Override
	public String toString() {
		return "Book: title:" + title + ", foreWord:" + foreWord + System.lineSeparator() + chapters + System.lineSeparator()  + "Total number of pages:"
				+ numOfPages ;
	}
	
	
	public String getInfo()
	{
		return this.toString();
	}
	
	
}
