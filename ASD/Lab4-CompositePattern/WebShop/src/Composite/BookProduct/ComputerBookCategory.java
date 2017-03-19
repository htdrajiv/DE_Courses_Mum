package Composite.BookProduct;

import Composite.ProductCatalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class ComputerBookCategory implements ProductCatalog {
    private String type;
    List<ProductCatalog> books;

    public ComputerBookCategory(String type){
        this.type = type;
        books = new ArrayList();
    }

    public void addBook(ProductCatalog book){
        this.books.add(book);
    }

    public void removeBook(ProductCatalog book){
        this.books.remove(book);
    }

    @Override
    public void showDetails() {
        System.out.println("BookCategory is "+type);
        for(ProductCatalog book : books){
            book.showDetails();
        }
    }
}
