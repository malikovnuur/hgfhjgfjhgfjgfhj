package service.Impl;

import model.Book;
import service.BookService;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookServiceImpl implements BookService {
    List<Book>books=new LinkedList<>();
    @Override
    public String createBooks(List<Book> books) {

        this.books=books;
        return "Successfully created";
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        for (Book book : books) {
            if (book.getGenre().contains(genre)) {

                return (List<Book>) book;
            }
        }
        return null;
    }

    @Override
    public String removeBookById(Long id) {


        boolean isRemoved = false;
        Iterator<Book> iterator = books.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getId() == id) {
                iterator.remove();
                isRemoved = true;
            }
        }
        return isRemoved ? "Person Removed Successfully":"Remove Failed!";
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
        return null;
    }
}
