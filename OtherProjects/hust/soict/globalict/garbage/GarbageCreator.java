package hust.soict.globalict.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GarbageCreator {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("/Users/moctran/Desktop/HUST/2022.2/Object-oriented Programming/Lab/Week3/OtherProjects/hust/soict/globalict/garbage/text.txt"));
//        StringBuilder stringBuilder = new StringBuilder();
//        String line = null;
//        String ls = System.getProperty("line.separator");
//        while ((line = reader.readLine()) != null) {
//            stringBuilder.append(line);
//            stringBuilder.append(ls);
//        }
//// delete the last new line separator
//        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//        reader.close();
//
//        String content = stringBuilder.toString();
//        System.out.println(content);
//    }

    public static void main(String[] args) throws IOException {
        String filename = "/Users/moctran/Desktop/HUST/2022.2/Object-oriented Programming/Lab/Week3/OtherProjects/hust/soict/globalict/garbage/text.txt";
//
//        Path pathToFile = Paths.get(filename);
//        System.out.println(pathToFile.toAbsolutePath());

        byte[] inputBytes = { 0 };
        long startTime, endTime;
//        inputBytes = Files.readAllBytes(pathToFile);

        //inputBytes = GarbageCreator.class.getResourceAsStream("text.txt").readAllBytes();
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes)
        {
            outputString += (char)b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
