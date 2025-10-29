package variabledatatype;

class Book {

	String title;
	String author;
	double price;

	public Book() {
		this.title = "The white tiger";
		this.author = "Aravind adiga";
		this.price = 450.0;
	}

	public void show() {
		System.out.println("Title name: " + title);
		System.out.println("Author name: " + author);
		System.out.println("Book price: " + price);

	}

	public static void main(String[] args) {
		Book obj = new Book();
		obj.show();

	}

}
