package q2;

public class Page {
	
	Integer no;
	String content;
	

	
	//SETTERS AND GETTERS 
	
	public Integer getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Page: no:" + no + ", content:" + content + System.lineSeparator();
	}
	
	
	String getInfo() {
		return this.toString()
;	}
	
	
	public Page(Integer _no, String _content){ // default constructor 
		super(); 
		this.no = _no;
		this.content = _content;
	}
	
	

}
