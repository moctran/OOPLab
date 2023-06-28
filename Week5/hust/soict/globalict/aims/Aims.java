package soict.globalict.aims;

import javafx.collections.transformation.FilteredList;
import soict.globalict.aims.Playable;
import soict.globalict.aims.cart.Cart;
import soict.globalict.aims.exception.PlayerException;
import soict.globalict.aims.media.Book;
import soict.globalict.aims.media.CompactDisc;
import soict.globalict.aims.media.DigitalVideoDisc;
import soict.globalict.aims.media.Media;
import soict.globalict.aims.store.Store;

import javax.naming.LimitExceededException;
import java.util.*;

public class Aims {
    public static Store store = new Store();
    public static Cart cart = new Cart();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws LimitExceededException, PlayerException {
        int option;
        do {
            showMenu();
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    store.printStore();
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    cart.print();
                    cartMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose a number 0-1-2-3");
            }
        } while (option != 0);
    }
    public static void showMenu()
    {
        System.out.println("AIMS: ");
        System.out.println("-----------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-----------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu()
    {
        System.out.println("Options: ");
        System.out.println("-----------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("-----------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void viewStore() throws LimitExceededException, PlayerException
    {
        int option;
        do {
            storeMenu();
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    store.printStore();
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    cart.print();
                    cartMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose a number 0-1-2-3-4");
            }
        }while (option != 0);
    }
    public static void mediaDetailsMenu()
    {
        System.out.println("Options: ");
        System.out.println("-----------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("-----------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void seeMediaDetails() throws LimitExceededException, PlayerException {
        System.out.println("Enter the title of the media: ");
        String title = sc.nextLine().trim();
        Media media = store.searchTitle(title);
        if (media == null) {
            System.out.println("Not found");
        } else {
            int option;
            do {
                System.out.println(media);
                mediaDetailsMenu();
                option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        addMediaToCart();
                        cart.print();
                        break;
                    case 2:
                        playMedia();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (option != 0);
        }
    }
    public static void addMediaToCart() throws LimitExceededException {
        System.out.println("Enter title of the media: ");
        String title = sc.nextLine().trim();
        Media media = cart.searchTitle(title);
        if (media == null) {
            cart.addMedia(store.searchTitle(title));
        } else {
            System.out.println("The product already existed");
        }
    }
    public static void updateStore() {
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("-----------------------------------");
            System.out.println("1. Add media");
            System.out.println("2. Remove media");
            System.out.println("0. Back");
            System.out.println("-----------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose a number 0-1-2");
            }
        } while (option != 0);
    }
    public static void addMediaToStore() {
        int option;
        do {
            System.out.println("Add Media to Store: ");
            System.out.println("-----------------------------------");
            System.out.println("1. Add book");
            System.out.println("2. Add DVD");
            System.out.println("3. Add CD");
            System.out.println("0. Back");
            System.out.println("-----------------------------------");
            option = sc.nextInt();
            sc.nextLine();
            switch(option) {
                case 1:
                    store.addBook();
                    break;
                case 2:
                    store.addDvd();
                    break;
                case 3:
                    store.addCd();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose a number 0-1-2-3");
            }
        } while(option != 0);
    }
    public static void removeMediaFromStore()
    {
        int option;
        do {
            store.printStore();
            System.out.println("Remove from store: ");
            System.out.println("-----------------------------------");
            System.out.println("1. Remove by ID");
            System.out.println("2. Remove by Title");
            System.out.println("0. Back");
            System.out.println("-----------------------------------");
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    System.out.println("Enter ID: ");
                    int ID = sc.nextInt();
                    sc.nextLine();
                    Media removeId = store.searchID(ID);
                    store.removeMedia(removeId);
                    break;
                case 2:
                    System.out.println("Enter title: ");
                    String title = sc.next().trim();
                    Media removeTitle = store.searchTitle(title);
                    store.removeMedia(removeTitle);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose a number 0-1-2");
            }
        } while (option != 0);
    }
    public static void cartMenu() throws PlayerException
    {
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("-----------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("-----------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    filterMediaInCart();
                    break;
                case 2:
                    sortMediaInCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMedia();
                    break;
                case 5:
                    cart.placeOrder();
                    break;
                default:
                    System.out.println("Please choose a number 0-1-2-3-4-5");
            }
        } while (option != 0);
    }
    public static void playMedia() throws PlayerException
    {
        System.out.println("Enter the title of the media: ");
        String title = sc.nextLine().trim();
        Media media = store.searchTitle(title);
        if (media instanceof Book)
            System.out.println("Not available");
        else if (media instanceof DigitalVideoDisc)
        {
            DigitalVideoDisc dvd = (DigitalVideoDisc) media;
            if (dvd.getLength() < 0)
                System.out.println("Not available");
            else dvd.play();
        }
        else if (media instanceof CompactDisc)
        {
            CompactDisc cd = (CompactDisc) media;
            if (cd.getLength() < 0)
                System.out.println("Not available");
            else cd.play();
        }
    }
    public static void filterMediaInCart()
    {
        int option;
        do {
            cart.print();
            System.out.println("Filter medias in cart: ");
            System.out.println("-----------------------------------");
            System.out.println("1. Filter by ID");
            System.out.println("2. Filter by Title");
            System.out.println("0. Back");
            System.out.println("-----------------------------------");
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Media filterID = cart.searchID(id);
                    if (filterID == null)
                        System.out.println("The media is not found");
                    else System.out.println(filterID.toString());
                    break;
                case 2:
                    System.out.println("Enter title: ");
                    String title = sc.nextLine().trim();
                    sc.nextLine();
                    FilteredList<Media> mediaArrayList = cart.filterMediaByTitle(title);
                    if (mediaArrayList.isEmpty())
                        System.out.println("The media is not found");
                    else {
                        for (int i = 0; i < mediaArrayList.size(); i++)
                        {
                            System.out.println(mediaArrayList.get(i).toString());
                        }
                    }
                    break;
                case 0: break;
                default:
                    System.out.println("Please enter 0-1-2");
            }
        } while (option != 0);
    }
    public static void sortMediaInCart()
    {
        int option;
        do
        {
            cart.print();
            System.out.println("Sort medias in cart: ");
            System.out.println("-----------------------------------");
            System.out.println("1. Sort by Cost");
            System.out.println("2. Sort by Title");
            System.out.println("0. Back");
            System.out.println("-----------------------------------");
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    cart.sortByCostTitle();
                    cart.print();
                    break;
                case 2:
                    cart.sortByTitleCost();
                    cart.print();
                case 0: break;
                default:
                    System.out.println("Please enter 0-1-2");
            }
        } while (option != 0);
    }
    public static void removeMediaFromCart()
    {
        int option;
        do
        {
            cart.print();
            System.out.println("Remove from cart: ");
            System.out.println("-----------------------------------");
            System.out.println("1. Remove by ID");
            System.out.println("2. Remove by Title");
            System.out.println("0. Back");
            System.out.println("-----------------------------------");
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Media removeID = cart.searchID(id);
                    cart.removeMedia(removeID);
                    break;
                case 2:
                    System.out.println("Enter title: ");
                    String title = sc.nextLine().trim();
                    Media removeTitle = cart.searchTitle(title);
                    cart.removeMedia(removeTitle);
                    break;
                case 0: break;
                default:
                    System.out.println("Please enter 0-1-2");
            }
        } while (option!=0);
    }
}
