import Composite.BookProduct.Book;
import Composite.BookProduct.BookCategory;
import Composite.BookProduct.FictionCategory;
import Composite.DVDProduct.DVD;
import Composite.DVDProduct.DVDCategory;
import Composite.DVDProduct.Drama;

public class Main {

    public static void main(String[] args) {
        BookCategory productCatalog = new BookCategory("TYPE - B");
        FictionCategory fictionCategory = new FictionCategory("Science fiction");
        Book book = new Book("125SCI","Mars Missions");
        fictionCategory.addBook(book);
        productCatalog.addCategory(fictionCategory);

        DVDCategory dvdCategory = new DVDCategory("TYPE - D");
        Drama drama = new Drama("Modern");
        DVD dvd = new DVD("MyAim");
        drama.addDvd(dvd);
        dvdCategory.addCategory(drama);
        productCatalog.addCategory(dvdCategory);

        productCatalog.showDetails();
    }
}
