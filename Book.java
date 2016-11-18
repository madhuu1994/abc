class Book implements Comparable
{
	private String title;
	private double price;
	
	public Book(String title,double price)
	{
		this.title=title;
		this.price=price;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	@Override
	public String toString()
	{
		return "Price : " + price;
	}
	
	@Override
	public int compareTo(Object obj)
	{
		Book b = (Book)obj;
		
		if(b.getPrice() < this.price)
		{
			return 1;
		}
		else if(b.getPrice() > this.price)
		{
			return -1;
		}
		else
			return 0;
	}
	
	/*public boolean equals(Object obj)
	{
	}*/
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}