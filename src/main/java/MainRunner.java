import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainRunner {

    public static void main(String[] args) throws IOException {
        //Access file to be read, create an ArrayList of String type to hold info, and use a BufferedReader to read file.
        FileReader fileName = new FileReader("src/main/resources/Address.csv");
        List<String> contacts = new ArrayList<>();
        BufferedReader br = new BufferedReader(fileName);

        //While the BufferedReader is ready, read the line and add it to the contacts ArrayList.
        while(br.ready()) {
            contacts.add(br.readLine());
        }

        //Sort the contacts using Collections and print the result using a for loop.
        Collections.sort(contacts);
        for (String contact : contacts) System.out.println(contact);


    }
}
