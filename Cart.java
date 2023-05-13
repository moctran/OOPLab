package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private float totalCost = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc)
    {
        if (qtyOrdered == MAX_NUMBERS_ORDERED)
        {
            System.out.println("The cart is almost full");
        }
        else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered+=1;
            System.out.println("The disc has been added");
        }
        return;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList)
    {
        if (qtyOrdered == MAX_NUMBERS_ORDERED)
        {
            System.out.println("The cart is almost full");
        }
        else {
            for (int i = 0; i < dvdList.length; i++)
            {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered += 1;
                if (qtyOrdered == MAX_NUMBERS_ORDERED)
                {
                    System.out.println("The cart is almost full");
                    break;
                }
            }
        }
        return;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
    {
        if (qtyOrdered == MAX_NUMBERS_ORDERED)
        {
            System.out.println("The cart is almost full");
        }
        else {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered+=1;
            System.out.println("The first disc has been added");
            if (qtyOrdered == MAX_NUMBERS_ORDERED)
            {
                System.out.println("The cart is almost full");
            }
            else
            {
                itemsOrdered[qtyOrdered] = dvd2;
                qtyOrdered+=1;
                System.out.println("The second disc has been added");
            }
        }
        return;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        int found = 0;
        int index;
        if (qtyOrdered == 0)
        {
            System.out.println("No discs in cart");
            return;
        }
        for (int i = 0; i < qtyOrdered; i++)
        {
            if (itemsOrdered[i] == disc)
            {
                index = i;
                DigitalVideoDisc tmp[] = new DigitalVideoDisc[qtyOrdered-1];
                for (int j = 0; j < index; j++)
                {
                    tmp[j] = itemsOrdered[j];
                }
                for (int j = index; j < qtyOrdered-1; j++)
                {
                    tmp[j] = itemsOrdered[j+1];
                }
                itemsOrdered = tmp;
                qtyOrdered-=1;
                found = 1;
                System.out.println("The disc has been removed");
                break;
            }
        }
        if (found == 0)
            System.out.println("The disc is not found");
    }

    public float totalCost()
    {
        float result = 0;
        for (int i = 0; i < qtyOrdered; i++)
        {
            result+=itemsOrdered[i].getCost();
        }
        return result;
    }

    public void print()
    {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++)
        {
            System.out.println(itemsOrdered[i].getId() + ". DVD - " + itemsOrdered[i].getTitle() + " - "
            + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - "
            + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("***************************************************");
        this.totalCost = totalCost();
        System.out.println(this.totalCost);
    }

    public void searchID(int x)
    {
        for (int i = 0; i < qtyOrdered; i++)
        {
            if (itemsOrdered[i].getId() == x)
            {
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("Not found");
        return;
    }
    public void searchTitle(String title)
    {
        for (int i = 0; i < qtyOrdered; i++)
        {
            if (title.compareTo(itemsOrdered[i].getTitle())==0) {
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("Not found");
        return;
    }
}
