package Composite.DVDProduct;

import Composite.ProductCatalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class Action implements ProductCatalog {
    private String type;
    List<ProductCatalog> dvds;

    public Action(String type){
        this.type = type;
        this.dvds = new ArrayList();
    }

    public void addDvd(ProductCatalog dvd){
        this.dvds.add(dvd);
    }

    public void removeDvd(ProductCatalog dvd){
        this.dvds.remove(dvd);
    }

    @Override
    public void showDetails() {
        System.out.println("Action category of type "+this.type);
        for(ProductCatalog dvd:dvds){
            dvd.showDetails();
        }
    }
}
