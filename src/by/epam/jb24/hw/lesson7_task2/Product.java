package by.epam.jb24.hw.lesson7_task2;

public class Product {
	private String nameOfGoods = "";
	private int countOfGoods = 0;
	private double price = 0;
	private double totalPriceOfGoods = 0;
	

	public Product(String nameOfGoods, int countOfGoods, double price) {
		this.setNameOfGoods(nameOfGoods);
		this.setCountOfGoods(countOfGoods);
		this.setPrice(price);
		this.setTotalPriceOfGoods(countOfGoods,price);
	}

	public String getNameOfGoods() {
		return nameOfGoods;
	}

	public void setNameOfGoods(String nameOfGoods) {
		this.nameOfGoods = nameOfGoods;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return nameOfGoods.hashCode() + (int) (31 * price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Product myProduct = (Product) obj;
		if (nameOfGoods != myProduct.nameOfGoods) {
			return false;
		}

		if (price != myProduct.price) {
			return false;
		}
		return true;
	}

	public int getCountOfGoods() {
		return countOfGoods;
	}

	public void setCountOfGoods(int countOfGoods) {
		this.countOfGoods = countOfGoods;
	}

	public double setTotalPriceOfGoods(int countOfGoods, double price) {
		totalPriceOfGoods = this.countOfGoods * this.price;
		return totalPriceOfGoods;
	}
	
	public double getTotalPriceOfGoods() {
		return totalPriceOfGoods;
	}
	
	@Override
	public String toString() {
		return "\n" + nameOfGoods + "   " + price + "$  " + countOfGoods + "  " + totalPriceOfGoods + "$";
	}

}
