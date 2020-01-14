package models;

public class Comic {

	private int id;
	private String title;
	private int pageCount;
	private double price;
	private int rating;
	public int getId() {
		return id;
	}
	
	public Comic() {} // Jackson fix
	
	public Comic(int id, String title, int pageCount, double price, int rating) {
		super();
		this.id = id;
		this.title = title;
		this.pageCount = pageCount;
		this.price = price;
		this.rating = rating;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Comic [id=" + id + ", title=" + title + ", pageCount=" + pageCount + ", price=" + price + ", rating="
				+ rating + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getPageCount()=" + getPageCount()
				+ ", getPrice()=" + getPrice() + ", getRating()=" + getRating() + "]";
	}
	
}
