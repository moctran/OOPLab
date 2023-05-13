package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

class DiskWrapper{
    DigitalVideoDisc d;
    DiskWrapper(DigitalVideoDisc d)
    {
        this.d = d;
    }
}
public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        DiskWrapper dw1 = new DiskWrapper(jungleDVD);
        DiskWrapper dw2 = new DiskWrapper(cinderellaDVD);
        correctSwap(dw1,dw2);
        dw1.d.print();
        dw2.d.print();

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(Object o1, Object o2)
    {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void correctSwap(DiskWrapper d1, DiskWrapper d2)
    {
        DigitalVideoDisc tmp = d1.d;
        d1.d = d2.d;
        d2.d = tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title)
    {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
