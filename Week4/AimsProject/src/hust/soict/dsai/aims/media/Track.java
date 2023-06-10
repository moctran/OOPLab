package hust.soict.dsai.aims.media;

import hust.soict.dsai.Playable;

public class Track implements Playable {
    private String title;
    private float length;

    public String getTitle() {
        return title;
    }

    public float getLength() {
        return length;
    }

    public void play()
    {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    public boolean equals (Object object)
    {
        if (!(object instanceof Track))
            return false;
        else return (((Track) object).getTitle().equals(this.getTitle()) && ((Track) object).getLength() == this.getLength());
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
}
