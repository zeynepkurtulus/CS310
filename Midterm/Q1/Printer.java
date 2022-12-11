package q1;

import java.util.ArrayList;

public abstract class Printer{
	
	private ArrayList<Printable> docs = new ArrayList<Printable>();
	

	
	void printAllDocuments(){
			for(Printable x: docs) {
				printOut(x);
			}
		
	}
	
	void addDocument(Printable print){
		docs.add(print);
		
	}
	public abstract void printOut(Printable p); // abstract method does not have a body 

	
	
}
