package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class CartTest {
    public static void main(String[] args) {
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
