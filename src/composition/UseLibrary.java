  package composition;

public class UseLibrary {
	public static void main (String[] args) {
	Book b=new Book();
	b.title="Storybook";
	b.author="dr.muthulakshim";
	b.price=200;
	b.publication=1998;
	
	NovelBook nb=new NovelBook();
	nb.edition="second";
	nb.pages=1020;
	nb.title="birdsnovel";
	
	Library l=new Library();
	l.type="big";
	l.location="chennai";
	l.book=b;
	l.novelbook = nb;
	
//	System.out.println(l.type+" "+l.location+" "+l.book.title+" "+l.book.price+" "+l.book.author+" "+l.book.publication);
//	System.out.println(l.novelbook.edition+" "+l.novelbook.pages+" "+l.novelbook.title);
	System.out.println(b+"\n"+nb+"\n"+l);

}
}
