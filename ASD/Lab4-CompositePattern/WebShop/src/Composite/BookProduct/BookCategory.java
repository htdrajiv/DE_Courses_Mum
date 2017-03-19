package Composite.BookProduct;

import Composite.ProductCatalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class BookCategory implements ProductCatalog {
    private String name;

    List<ProductCatalog> categories;

    public BookCategory(String name){
        this.name = name;
        categories = new ArrayList();
    }

    public void addCategory(ProductCatalog category){
        this.categories.add(category);
    }

    public void removeCategory(ProductCatalog category){
        this.categories.remove(category);
    }

    @Override
    public void showDetails() {
        for(ProductCatalog category : categories){
            category.showDetails();
        }
    }
}
