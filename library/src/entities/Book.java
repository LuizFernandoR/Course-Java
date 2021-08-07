package entities;

public class Book {
	
	private String name;
	private Double price;
	private String autor;
	private Integer quantity;
	

	public Book(String name, Double price, String autor, Integer quantity) {
		this.name = name;
		this.price = price;
		this.autor = autor;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAutor() {
		return autor;
	}
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String toString() {
		return   name
			   + ", "
			   + autor
			   + ", "
			   + String.format("%.2f", price)
			   + ", "
			   + quantity
			   + " Units";
		
	}
}
