import java.util.ArrayList;
import java.util.List;

public class BookShelf 
{
	private int bookid;
	private String bookname;
	private String auther;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	@Override
	public String toString() {
		return "BookShelf [bookid=" + bookid + ", bookname=" + bookname + ", auther=" + auther + "]";
	}
	public BookShelf()
	{
		System.out.println("In Default cinstructor");
	}
	public BookShelf(int bookid, String bookname, String auther) {
		//super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.auther = auther;
	}
	public static void main(String[] args) 
	{
		BookShelf book=new BookShelf();
		List<BookShelf> l=new ArrayList<>();
		l.add(new BookShelf(1,"Java","Kathy"));
		l.add(new BookShelf(2,"Jsp","Khalid"));
		l.add(new BookShelf(3,"Spring","Max"));
		//System.out.println("List Elements: "+l.toString());
		for(BookShelf b:l)
		{
			System.out.println(""+b.getAuther());
		}
		l.stream().forEach(bs->{
			if(bs.getBookname()=="Java")
			{	
				System.out.println(""+bs.bookid);
				System.out.println(""+bs.getBookname());		
			}
		});
		
		l.forEach(bs->System.out.println(""+bs.getBookid()));
		
	}
	
	
}
