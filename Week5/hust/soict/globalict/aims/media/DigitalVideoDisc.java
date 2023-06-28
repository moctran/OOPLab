package soict.globalict.aims.media;

import soict.globalict.aims.Playable;
import soict.globalict.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }


    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "director='" + director + '\'' +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
    public void print()
    {
        System.out.println(this.id + ". " + this.title + " - " + this.category + " - " + this.director
        + " - " + this.length + ": " + this.cost + "$");
    }
//    public void play()
//    {
//        System.out.println("Playing DVD: " + this.getTitle());
//        System.out.println("DVD length: " + this.getLength());
//    }
    public boolean isMatch(String title)
    {
        return this.getTitle().equals(title);
    }
    @Override
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD Length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
    }
}
