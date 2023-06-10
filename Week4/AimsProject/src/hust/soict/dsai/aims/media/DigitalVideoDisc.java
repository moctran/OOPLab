package hust.soict.dsai.aims.media;

import hust.soict.dsai.Playable;

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
    public void play()
    {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    public boolean isMatch(String title)
    {
        return this.getTitle().equals(title);
    }
}
