package hust.soict.globalict.garbage;
import java.io.IOException;
public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "/Users/moctran/Desktop/HUST/2022.2/Object-oriented Programming/Lab/Week3/OtherProjects/hust/soict/globalict/garbage/text.txt";

        byte[] inputBytes = { 0 };
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes)
        {
            outputStringBuilder.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
