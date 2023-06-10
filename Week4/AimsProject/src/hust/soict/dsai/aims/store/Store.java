package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public static final int MAX = 100000;
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addMedia(Media media)
    {
        if (itemsInStore.contains(media))
        {
            System.out.println("The media has already existed");
            return;
        }
        itemsInStore.add(media);
        System.out.println("The product has been added");
        return;
    }
    public void removeMedia(Media media)
    {
        if (itemsInStore.contains(media))
        {
            itemsInStore.remove(media);
            System.out.println("The product has been removed");
        }
        else System.out.println("The product is not found");
        return;
    }

    public void printStore()
    {
        System.out.println("***********************STORE***********************");
        System.out.println("In Store Items:");
        for (int i = 0; i < itemsInStore.size(); i++)
        {
            System.out.println(itemsInStore.get(i).getId() + " - " + itemsInStore.get(i).getTitle() + " - "
                    + itemsInStore.get(i).getCategory() + " :" + itemsInStore.get(i).getCost() + "$");
        }
    }
    public Media searchID(int x)
    {
        for (int i = 0; i < itemsInStore.size(); i++)
        {
            if (itemsInStore.get(i).getId() == x)
            {
                System.out.println(itemsInStore.get(i).toString());
                return itemsInStore.get(i);
            }
        }
        System.out.println("Not found");
        return null;
    }
    public Media searchTitle(String title)
    {
        for (int i = 0; i < itemsInStore.size(); i++)
        {
            if (title.compareTo(itemsInStore.get(i).getTitle())==0) {
                System.out.println(itemsInStore.get(i).toString());
                return itemsInStore.get(i);
            }
        }
        System.out.println("Not found");
        return null;
    }
    public void addBook() {
        System.out.println("----Add Book----");
        System.out.println("Title of the book: ");
        String title = sc.nextLine().trim();
        System.out.println("Category of the book: ");
        String category = sc.nextLine().trim();
        System.out.println("Cost of the book: ");
        float cost = sc.nextFloat();
        sc.nextLine();
        Book book = new Book(title, category, cost);
        addMedia(book);
    }
    public void addDvd() {
        System.out.println("----Add DVD----");
        System.out.println("Title of the DVD: ");
        String title = sc.nextLine().trim();
        System.out.println("Category of the DVD: ");
        String category = sc.nextLine().trim();
        System.out.println("Director of the DVD: ");
        String director = sc.nextLine().trim();
        System.out.println("Length of the DVD: ");
        int length = sc.nextInt();sc.nextLine();
        System.out.println("Cost of the DVD: ");
        float cost = sc.nextFloat();
        sc.nextLine();
        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
        addMedia(dvd);
    }
    public void addCd() {
        System.out.println("----Add CD----");
        System.out.println("Title of the CD: ");
        String title = sc.nextLine().trim();
        System.out.println("Category of the CD: ");
        String category = sc.nextLine().trim();
        System.out.println("Director of the CD: ");
        String director = sc.nextLine().trim();
        System.out.println("Length of the CD: ");
        int length = sc.nextInt();
        sc.nextLine();
        System.out.println("Cost of the CD: ");
        float cost = sc.nextFloat();
        sc.nextLine();
        System.out.println("Artist of the CD: ");
        String artist = sc.nextLine().trim();
        CompactDisc cd = new CompactDisc(title, category, director, length, cost, artist);
        addMedia(cd);
    }
}
