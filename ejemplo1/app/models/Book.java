package models; 				

import java.util.HashSet;
import java.util.Set;

public class Book {
	public Integer id;
	public String title;
	public Double price;
	public String author;


	public Book() {

	}


	public Book(Integer id, String title, Double price, String author) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
	}


	private static Set<Book> books;

	static {
		books = new HashSet<>();
		books.add(new Book(1, "C++", 19.99, "ABC"));
		books.add(new Book(2, "Java", 19.99, "XYZ"));
	}


	public static Set<Book> allBooks() {
		return books;
	}


	public static Book findById(Integer id) {
		for(Book b: books) {
			if(id.equals(b.id))
				return b;
		}
		return null;
	}


	public static void add(Book book) {
		books.add(book);
	}


	public static boolean remove(Book b) {
		return books.remove(b);
	}

}