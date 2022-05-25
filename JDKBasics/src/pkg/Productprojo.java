package pkg;

public class Productprojo {
  private int productId;
  private String ProductName;
  float price;
  int quantity;
  
  public Productprojo(int productId, String productName, float price, int quantity) {
	super();
	this.productId = productId;
	this.ProductName = productName;
	this.price = price;
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Productprojo [productId=" + productId + ", ProductName=" + ProductName + ", price=" + price + ", quantity="
			+ quantity + "]";
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Productprojo() {
	  
  }
  public Productprojo(int productId) {
	  super();
	  this.productId = productId;
  }
  
  
  
}
