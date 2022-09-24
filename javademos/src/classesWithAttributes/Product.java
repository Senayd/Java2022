package classesWithAttributes;

public class Product {

	// private sadece tanımlandığı classta erişilir

	// this içinde bulunduğum class demek!

	// alanın üstüne gel-Z fefactor -> encapsilation okey
	// encapsilation-> private değişkene dışarıdan metotlarla erişmek
	// alanları private vermeye bile gerek yok
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		// this.id = id; bu classin id si mi gelen id mi karışmasın diye this bulunduğun
		// classı ifade eder
		// bunları karıştırmamak için _degisken yazarsan bunun field olduğunu anlarsın
		this.id = id;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getKod() { // kod alanı sadece okunabilir olmasını istiyorum bu sebeple sadece get metodu
								// var
		return this.name.substring(0, 1) + this.id;
//	public void setKod(String _kod) {
//		this._kod = _kod;
//	}

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	
}