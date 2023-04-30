public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

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
}
