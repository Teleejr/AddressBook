import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainRunner {

    public static void main(String[] args) throws IOException {
        FileReader fileName = new FileReader("src/main/resources/Address.csv");
        List<String> contacts = new ArrayList<>();
        BufferedReader br = new BufferedReader(fileName);

        while(br.ready()) {
            contacts.add(br.readLine());
        }

        Collections.sort(contacts);
        for (String contact : contacts) System.out.println(contact);


    }
}
