package file;

public class Cafe {
	private int rating;
	private String coffeeName;
	float price;
	//int quantity;
	
	public Cafe(int rating, String coffeeName, float price) {
		super();
		this.rating = rating;
		this.coffeeName = coffeeName;
		this.price = price;
//		this.quantity = quantity;
		}

	@Override
	public String toString() {
		return "Cafe [rating=" + rating + ", coffeeName=" + coffeeName + ", price=" + price + "]";
	}
	

//	public int getRating() {
//		return rating;
//	}
//
//	public void setRating(int rating) {
//		this.rating = rating;
//	}
//
//	public String getCoffeeName() {
//		return coffeeName;
//	}
//
//	public void setCoffeeName(String coffeeName) {
//		this.coffeeName = coffeeName;
//	}
//
//	public float getPrice() {
//		return price;
//	}
//
//	public void setPrice(float price) {
//		this.price = price;
//	}
//	
}
