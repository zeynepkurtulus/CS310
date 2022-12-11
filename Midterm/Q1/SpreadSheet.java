package q1;

public class SpreadSheet implements Printable{

	String subject;
	int numberOfColumns;
	int numberOfRows;
	
	SpreadSheet(String _subject, int _numberOfColumns, int _numberOfRows){ // non-default constructor 
		
		subject = _subject;
		numberOfColumns = _numberOfColumns;
		numberOfRows = _numberOfRows;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "SpreadSheet [subject=" + subject + ", numberOfColumns=" + numberOfColumns + ", numberOfRows="
				+ numberOfRows + "]";
	}



	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return this.toString();
	}
	

}
