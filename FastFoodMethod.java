package programAssignment03;

import java.text.NumberFormat;

public class FastFoodMethod {
	
	private String food;
	private int quantity;
	private double price;
	private double total;
	
	public FastFoodMethod() {
		food = "";
		quantity = 0;
		price = 0;
		total = 0;
	}
	public FastFoodMethod(String food, int quantity, double price, double total) {
		this.food = food;
		this.quantity = quantity;
		this.price = price;
		this.total = quantity * price;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String getFood() {
		return food;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public double getTotal() {
		return total;
	}
	
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String NumberFormatted = currency.format(price);
		return NumberFormatted;
	}
	public String getTotalFormatted() {
		NumberFormat currency1 = NumberFormat.getCurrencyInstance();
		String NumberFormatted1 = currency1.format(total);
		return NumberFormatted1;
	}

}
