package soict.globalict.aims.screen;

import soict.globalict.aims.cart.Cart;
import soict.globalict.aims.media.Book;
import soict.globalict.aims.media.DigitalVideoDisc;
import soict.globalict.aims.store.Store;

public class AimsScreen {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation"
                , "Roger Allers", 87, 19.95f);


        Book book = new Book("Doraemon", "Comics", (float) 12.00);
        book.addAuthor("Mai Duc An");


        store.addMedia(dvd);
        store.addMedia(book);

        new StoreScreen(store, cart);
    }
}
