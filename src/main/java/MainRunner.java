
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.perscholas.data.Address;
import org.perscholas.data.BookManager;
import org.perscholas.data.Person;


public class MainRunner {


    public static void main(String args[]) {

        BookManager bm = new BookManager();
        List<Person> contactList = new ArrayList<>();
        FileReader fr = null;
        try {
            File file = new File("./src/main/resources/Address.csv");    //creates a new file instance
            fr = new FileReader(file);

            //function getAllContactFromFile, create a List of object person from the csv file.
            contactList = bm.getAllContactFromFile(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                Objects.requireNonNull(fr).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        System.out.println("------------------------------------");
        System.out.println(Arrays.toString(contactList.toArray()));
        System.out.println("------------------------------------");

            Person p2 = bm.search(contactList.get(2).getPhone());
        System.out.println("some text : "+p2.toString());

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a Mobile Number without dashes ");
            //System.out.println("Mobile number " +scan+ "is in the address book: " + line.contains (scan));

        //Person p = bm.update("Pete", "Mobile", "28865534");



    }
}
