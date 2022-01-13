package prob02;

public class Book {
	int book_sn;
	String book_nm;
	String author;
	boolean state=true;
	public Book(int serial,String name,String author) {
		this.book_sn=serial;
		this.book_nm=name;
		this.author=author;
		this.state=true;
	}
	
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public int getBook_sn() {
		return book_sn;
	}
	public void setBook_sn(int book_sn) {
		this.book_sn = book_sn;
	}
	public String getBook_nm() {
		return book_nm;
	}
	public void setBook_nm(String book_nm) {
		this.book_nm = book_nm;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}


	
}
