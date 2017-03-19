package Composite.DVDProduct;

import Composite.ProductCatalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class DVDCategory implements ProductCatalog {
    private String name;
    List<ProductCatalog> categories;

    public DVDCategory(String name){
        this.name = name;
        this.categories = new ArrayList();
    }

    public void addCategory(ProductCatalog category){
        this.categories.add(category);
    }

    public void removeCategory(ProductCatalog category){
        this.categories.remove(category);
    }

    @Override
    public void showDetails() {
        System.out.println("DVD category is "+name);
        for(ProductCatalog category : categories){
            category.showDetails();
        }
    }
}
