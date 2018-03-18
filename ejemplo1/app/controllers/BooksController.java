package controllers;

import play.mvc.*;
import java.util.Set;

import models.Book;
import views.html.books.*;

import play.data.Form;

import javax.inject.Inject;
import play.data.FormFactory;

public class BooksController extends Controller {

	@Inject
	FormFactory formFactory;


	// For all books
	public Result index() {
		Set<Book> books = Book.allBooks();
		return ok(index.render(books));
	}


	// To create book
	public Result create() {
		Form<Book> bookForm = formFactory.form(Book.class);
		return ok(create.render(bookForm));
	}


	// To save books
	public Result save() {
		Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();
		Book book = bookForm.get();
		Book.add(book);
		return redirect(routes.BooksController.index());    
	}


	// To edit book
	public Result edit(Integer id) {

		Book book = Book.findById(id);
		Form<Book> bookForm = formFactory.form(Book.class).fill(book);
		return ok(edit.render(bookForm));
	}


	// To update books
	public Result update() {

		return TODO;
	}

	// To destroy book
	public Result destroy(Integer id) {

		return TODO;
	}


	public Result show(Integer id) {

		return TODO;
	}


}