package review;

public class BookDBC {

	private String title;
	private int price;
	private boolean favorite;
	
	public BookDBC(String title, int price, boolean favorite) {
		this.title = title;
		this.price = price;
		this.favorite = favorite;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public String getTitle() {
		return title;
	}
	
}
