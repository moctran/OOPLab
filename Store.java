package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX = 100000;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX];
    private int qtyInStore = 0;
    public void addDVD(DigitalVideoDisc disc)
    {
        if (qtyInStore == MAX)
        {
            System.out.println("The store is out of space");
        }
        else {
            itemsInStore[qtyInStore] = disc;
            qtyInStore+=1;
            System.out.println("The disc has been added");
        }
        return;
    }
    public void removeDVD(DigitalVideoDisc disc)
    {
        int found = 0;
        int index;
        if (qtyInStore == 0)
        {
            System.out.println("No discs in store");
            return;
        }
        for (int i = 0; i < qtyInStore; i++)
        {
            if (itemsInStore[i] == disc)
            {
                index = i;
                DigitalVideoDisc tmp[] = new DigitalVideoDisc[qtyInStore-1];
                for (int j = 0; j < index; j++)
                {
                    tmp[j] = itemsInStore[j];
                }
                for (int j = index; j < qtyInStore-1; j++)
                {
                    tmp[j] = itemsInStore[j+1];
                }
                itemsInStore = tmp;
                qtyInStore-=1;
                found = 1;
                System.out.println("The disc has been removed");
                break;
            }
        }
        if (found == 0)
            System.out.println("The disc is not found");
    }

    public void printStore()
    {
        System.out.println("***********************STORE***********************");
        System.out.println("In Store Items:");
        for (int i = 0; i < qtyInStore; i++)
        {
            System.out.println(itemsInStore[i].getId() + ". DVD - " + itemsInStore[i].getTitle() + " - "
                    + itemsInStore[i].getCategory() + " - " + itemsInStore[i].getDirector() + " - "
                    + itemsInStore[i].getLength() + ": " + itemsInStore[i].getCost() + "$");
        }
    }
}
