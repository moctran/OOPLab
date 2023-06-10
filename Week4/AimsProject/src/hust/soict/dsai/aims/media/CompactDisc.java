package hust.soict.dsai.aims.media;
import hust.soict.dsai.Playable;

import java.util.*;
public class CompactDisc extends Disc implements Playable {
    private float length;
    private String director;
    private String artist;
    private List<Track> tracks;
    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }
    public int getLength() {
        int result = 0;
        for (Track x: tracks)
        {
            result += x.getLength();
        }
        return result;
    }
    public String getDirector() {
        return director;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track abc)
    {
        for (Track x: tracks)
        {
            if (x.getTitle().compareTo(abc.getTitle()) == 0 && x.getLength() == abc.getLength())
            {
                System.out.println("The track was already included");
                return;
            }
        }
        tracks.add(abc);
        System.out.println("The track was added");
    }
    public void removeTrack(Track abc)
    {
        for (Track x: tracks)
        {
            if (x.getTitle().compareTo(abc.getTitle()) == 0 && x.getLength() == abc.getLength())
            {
                System.out.println("The track is found");
                tracks.remove(abc);
                System.out.println("The track was removed");
                return;
            }
        }
        System.out.println("The track is not found");
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "length=" + length +
                ", director='" + director + '\'' +
                ", artist='" + artist + '\'' +
                ", tracks=" + tracks +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }

    public void play()
    {
        System.out.println("The director is: " + this.getDirector());
        System.out.println("The artist is: " + this.getArtist());
        System.out.println("The length of the CD: " + this.getLength());
        for (Track track : tracks)
        {
            track.play();
        }
    }
}
