import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.perscholas.data.Address;
import org.perscholas.data.BookManager;
import org.perscholas.data.Person;

public class MainRunner {
    public static void main(String[] args) {


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


        //update operation
        //update by phone
        Person person = bm.update(987652);
        System.out.println("updated name : "+person.getName());
        System.out.println("updated person with phone : "+person.toString());

        //update by name
        Person person1 = bm.update("Mary");
        System.out.println("updated person with name :  : "+person1.toString());

        //remobe contact by phone
        bm.remove(908767);
        //print new list after removing
        contactList.stream().forEach(System.out::println);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Mobile Number without dashes ");





            //System.out.println("Mobile number " +scan+ "is in the address book: " + line.contains (scan));

        //Person p = bm.update("Pete", "Mobile", "28865534");


        /*
      boolean end = false;

        //instantiate the person class
        Address a = new Address();

        while (end==false) {

            System.out.println("Please select an option: \n" +
                    "1. Add an entry. \n" +
                    "2. Edit entries - Search by name. \n" +
                    "3. Edit entries - Search by mobile number. \n" +
                    "4. Delete an entry - Search by name. \n" +
                    "5. Delete an entry - Search by mobile number." +
                    "6. View all entries in address book - Sorted by name. \n" +
                    "7. View all entries in address book - Sorted by mobile number. \n" +
                    "8. Exit address book.");
          
            int menuChoice = 0;

            if (menuChoice==1) {
                //have the user enter another address and add it to the file
                a.enterAdd();
            }
            else if (menuChoice==2)
            {

            }
            else if (menuChoice==3)
            {

            }
            else if (menuChoice==4)
            {

            }
            else if (menuChoice==5)
            {


            }
            else if (menuChoice==6)
            {
                a.viewByName();
            }
            else if (menuChoice==7)
            {

            }
            else if (menuChoice==8)
            {

            }

        }

*/
    }
}
