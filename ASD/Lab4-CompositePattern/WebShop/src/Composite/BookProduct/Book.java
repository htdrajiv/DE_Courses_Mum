package Composite.BookProduct;

import Composite.ProductCatalog;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class Book implements ProductCatalog {
    private String isbn;
    private String title;

    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public void showDetails() {
        System.out.println("ISBN : "+this.isbn+", Title : "+this.title);
    }
}
