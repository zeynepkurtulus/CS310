package q1;

public class ConsolePrinter extends Printer{


	@Override
	public void printOut(Printable p) {
		System.out.println("Data is printed to console");
		System.out.println(p.getContent());
	}
	
	
}
