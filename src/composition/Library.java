package composition;

public class Library {
	String type;
	String location;
	Book book;
	NovelBook novelbook;
	public String toString() {
		return "Type="+type+"Location="+location+"Book="+book+"NovelBook="+novelbook;
	}
	

}
