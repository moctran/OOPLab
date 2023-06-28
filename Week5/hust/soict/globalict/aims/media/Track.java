package soict.globalict.aims.media;
import soict.globalict.aims.Playable;
import soict.globalict.aims.exception.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    @Override
    public void play() throws PlayerException
    {
//        System.out.println("Playing track: " + this.getTitle());
//        System.out.println("Track length: " + this.getLength());
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD Length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
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
