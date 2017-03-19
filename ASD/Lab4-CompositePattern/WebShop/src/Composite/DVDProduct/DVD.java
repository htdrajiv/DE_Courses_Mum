package Composite.DVDProduct;

import Composite.ProductCatalog;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class DVD implements ProductCatalog {
    private String title;

    public DVD(String title){
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public void showDetails() {
        System.out.println("Title "+this.title);
    }
}
