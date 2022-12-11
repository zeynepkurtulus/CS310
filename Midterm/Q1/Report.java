package q1;

import java.time.LocalDateTime;

public class Report implements Printable{
	
	String title;
	String text;
	LocalDateTime reportDate;
	
	Report(String _title, String _text, LocalDateTime _reportDate) // non-default constructor 
	{
		
		title = _title;
		text = _text;
		reportDate = _reportDate;
	}
	
	@Override
	public String toString() {
		return "Report [title=" + title + ", text= " + text +", reportDate=" + reportDate + "]";
	}


	@Override
	public String getContent() {
		
		return this.toString();
	}
	
	
	

}
