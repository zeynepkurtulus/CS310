package q1;

public class Letter implements Printable {

	String sender;
	String receiver;
	String textContent;
	
	Letter(String _sender, String _receiver, String _textContent) // non-default constructor 
	{
		sender = _sender;
		receiver = _receiver;
		textContent = _textContent;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Letter [sender=" + sender + ", receiver=" + receiver + ", textContent=" + textContent + "]";
	}


	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return this.toString();
	}
	

}
