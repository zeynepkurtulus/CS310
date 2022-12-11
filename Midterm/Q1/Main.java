package q1;
import java.time.LocalDateTime;

public class Main {
	
	
	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();
		FilePrinter fileprinter = new FilePrinter("output1.txt");
		Report reprt = new Report("Final Exam", "I am trying to complete the question, yeah still!",  time); //report object 
		SpreadSheet sheet = new SpreadSheet("Budget", 10, 10); // speadsheet obj 
		Letter let = new Letter("Jack", "Henry", "Letter content"); //letter obj 
		
		fileprinter.addDocument(reprt);
		fileprinter.addDocument(sheet);
		fileprinter.addDocument(let);
		
		ConsolePrinter cprinter = new ConsolePrinter();
		cprinter.addDocument(reprt);
		cprinter.addDocument(sheet);
		cprinter.addDocument(let);
		

		fileprinter.printAllDocuments();
		cprinter.printAllDocuments();
		
		
		
		
		
		
		
	}

}
