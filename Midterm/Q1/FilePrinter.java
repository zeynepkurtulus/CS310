package q1;

public class FilePrinter extends Printer {

	String fileName;
	
	FilePrinter(String _fileName){
		super(); //constructor call of the super class 
		fileName = _fileName;
	}
	
	
	
	
	public void printOut(Printable p) {
		System.out.println("Data printed to file:" + fileName);
		System.out.println(p.getContent());
		
	}
	
}
