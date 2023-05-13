package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("abc", "xyz", 50.60f);
        Store firstStore = new Store();
        firstStore.addDVD(dvd1);
        firstStore.addDVD(dvd2);
        firstStore.addDVD(dvd3);
        firstStore.printStore();
        firstStore.removeDVD(dvd2);
        firstStore.removeDVD(dvd4);
        firstStore.printStore();
    }
}
