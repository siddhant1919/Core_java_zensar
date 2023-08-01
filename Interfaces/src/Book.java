
public abstract class Book implements BookManager, Printable {
	
	protected int bId;
	protected String bookName;
	protected float bookPrice;
	protected Date publishDate;
	
	
	public Book(int bId, String bookName, float bookPrice, Date publishDate)
	{
		this.bId = bId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.publishDate = publishDate;
		
	}
	
	public void bookDetails(int bId)
	{
		if(bId >=1 && bId <= 100)
		{
			System.out.println("Book details are"+bId+bookName+bookPrice+publishDate);
		}
		else 
		{
			System.out.println("Unable to find book enter correct book no");
		}
	}
	
	public abstract float calBookPrice();

	public void print() {
		
		
	}
	
}

class Novel extends Book 
{
	protected  String authorName;
	
	public Novel(int bId, String bookName, float bookPrice, Date publishDate, String authorName)
	{
		super(bId,bookName,bookPrice,publishDate);
		this.authorName = authorName;
	}
	

	public float calBookPrice()
	{
		int bookAge=0;
		int currentYear=2022;
		bookAge = currentYear-(publishDate.getYy());
		
		if(bookAge >= 5 && bookAge<=10)
		{
			float bookDiscount = bookPrice*10/100;
			bookPrice = bookPrice-bookDiscount;
		}
		else
		{
			System.out.println("To early to get discount");
		}
		return bookPrice;
	}
	
	public void print()
	{
		System.out.println("Price of book after discount"+ calBookPrice());
	}
	
	
	
	public static void main(String[] args)
	{
		Book b = new Novel(100, "Thinking in java", 899.0f, new Date(1,2,1984), "jhon jackob");
		b.bookDetails(100);
		float price = b.calBookPrice();
		b.print();
//		System.out.println(price);
	}
	
}
