package Composite.BookProduct;

import Composite.ProductCatalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class FictionCategory implements ProductCatalog {
    private String genre;

    List<ProductCatalog> books;

    public FictionCategory(String genre){
        books = new ArrayList();
        this.genre = genre;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBook(Book book){
        this.books.add(book);
    }

    @Override
    public void showDetails() {
        System.out.println("Fiction book with "+genre+" genre. ");
        for(ProductCatalog book : books){
            book.showDetails();
        }
    }
}
