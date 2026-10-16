package Encapsulation;

public class Product {
	private String Product;
	private int Cost;
	private boolean inStock;

	public String getProduct() {
		return this.Product;

	}

	public int getCost() {
		return this.Cost;

	}

	public boolean getInstock() {

		return this.inStock;
	}

	public void setProduct_details(String product) {
		this.Product = product;
		// System.out.println(this.Product);
	}

	public void setCost(int cost) {
		this.Cost = cost;
		// System.out.println(this.Cost);
	}

	public void setInstock(boolean Instock) {
		this.inStock = Instock;
		// System.out.println(this.inStock);
	}

	public void setProCostInstock(String product, int cost, boolean Instock) {
		this.Product = product;
		this.Cost = cost;
		this.inStock = Instock;
	}

}
