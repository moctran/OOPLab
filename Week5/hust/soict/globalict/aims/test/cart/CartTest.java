package soict.globalict.aims.test.cart;

import soict.globalict.aims.cart.Cart;
import soict.globalict.aims.media.Book;
import soict.globalict.aims.media.CompactDisc;
import soict.globalict.aims.media.DigitalVideoDisc;
import soict.globalict.aims.media.Media;

import javax.naming.LimitExceededException;

public class CartTest {
    public static void main(String[] args) throws LimitExceededException {
        //Create a new cart
        Cart cart = new Cart();

        //Create new objects and add them to the cart
        Media dvd = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd);
        Media book = new Book("Kafka by the shore", "Science", 5.99f);
        cart.addMedia(book);
        Media cd = new CompactDisc("Little Mermaid", "Cartoon", "Disney", 6, 8.99f, "Hailey Bieber");
        cart.addMedia(cd);

        cart.sortByTitleCost();
        cart.print();
        cart.sortByCostTitle();
        cart.print();
    }
}
