import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Print {

    default void viewByName(String pathname) throws IOException {
        //Access file to be read, create an ArrayList of String type to hold info, and use a BufferedReader to read file.
        FileReader fileName = new FileReader(pathname);
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
