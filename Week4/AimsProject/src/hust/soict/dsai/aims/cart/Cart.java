package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.*;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private float totalCost = 0;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    public void addMedia (Media media)
    {
        if (qtyOrdered < MAX_NUMBERS_ORDERED)
        {
            if (itemsOrdered.contains(media))
                System.out.println("The product already exists");
            else
            {
                itemsOrdered.add(media);
                qtyOrdered += 1;
                System.out.println("The product has been added");
            }
        }
        else System.out.println("The cart is full");
        return;
    }
    public void removeMedia (Media media)
    {
        if (itemsOrdered.contains(media))
        {
            itemsOrdered.remove(media);
            qtyOrdered -= 1;
            System.out.println("The product has been removed");
        }
        else System.out.println("The product is not found");
        return;
    }
    public float totalCost()
    {
        float result = 0;
        for (int i = 0; i < itemsOrdered.size(); i++)
        {
            result+=itemsOrdered.get(i).getCost();
        }
        return result;
    }

    public void print()
    {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++)
        {
            System.out.println(itemsOrdered.get(i).toString());
        }
        this.totalCost = totalCost();
        System.out.println("Total cost: " + this.totalCost);
        System.out.println("***************************************************");
    }

    public Media searchID(int x)
    {
        for (int i = 0; i < itemsOrdered.size(); i++)
        {
            if (itemsOrdered.get(i).getId() == x)
            {
                System.out.println(itemsOrdered.get(i).toString());
                return itemsOrdered.get(i);
            }
        }
        System.out.println("Not found");
        return null;
    }
    public Media searchTitle(String title)
    {
        for (int i = 0; i < itemsOrdered.size(); i++)
        {
            if (title.compareTo(itemsOrdered.get(i).getTitle())==0) {
                System.out.println(itemsOrdered.get(i).toString());
                return itemsOrdered.get(i);
            }
        }
        System.out.println("Not found");
        return null;
    }
    public ArrayList<Media> filterMediaByTitle(String title)
    {
        ArrayList<Media> mediaArrayList = new ArrayList<>();
        for (Media media: itemsOrdered)
        {
            if (media.getTitle().contains(title))
            {
                mediaArrayList.add(media);
            }
        }
        return mediaArrayList;
    }
    public void sortByTitleCost() {
        this.itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }
    public void sortByCostTitle() {
        this.itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }
    public void placeOrder()
    {
        System.out.println("-----------------------------------");
        System.out.println("Thanks for choosing our store");
        System.out.println("-----------------------------------");
    }
}
