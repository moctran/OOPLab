package soict.globalict.aims.media;
import java.util.*;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    private String author;
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Book(String title, String category, float cost, String author) {
        super(title, category, cost);
        this.author = author;
    }
    public void addAuthor(String authorName)
    {
        for (int i = 0; i < this.authors.size(); i++)
        {
            if (authorName.compareTo(this.authors.get(i)) == 0)
            {
                System.out.println("The author already existed");
                return;
            }
        }
        this.authors.add(authorName);
        System.out.println("The author is added");
    }

    public void removeAuthor(String authorName)
    {
        for (int i = 0; i < this.authors.size(); i++)
        {
            if (authorName.compareTo(this.authors.get(i)) == 0)
            {
                this.authors.remove(authorName);
                System.out.println("The author is removed");
                return;
            }
        }
        System.out.println("The author is not found");
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
}
