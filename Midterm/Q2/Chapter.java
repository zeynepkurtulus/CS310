package q2;

import java.util.ArrayList;

public class Chapter {

	Integer no;
	ArrayList<Page> pages;
	String title;
	
	
	public Chapter(Integer _no, String _title, ArrayList<Page> _pages ){
		super();
		this.no = _no;
		this.title = _title;
		this.pages = _pages;
	}

	//SETTERS AND GETTERS

	public Integer getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public ArrayList<Page> getPages() {
		return pages;
	}


	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Chapter: no: " + no + ", title:" + title + "Pages: " + pages;
	}
	
	String getInfo() {
		return this.toString();
	}
	
	
	
}
