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
        /*
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


            System.out.println("Enter a Mobile Number without dashes ");
            //System.out.println("Mobile number " +scan+ "is in the address book: " + line.contains (scan));

        //Person p = bm.update("Pete", "Mobile", "28865534");

*/

      boolean end = false;

        int menuChoice = 0;

        while (end==false) {

            if (menuChoice==0) {
                Scanner input = new Scanner(System.in);

                System.out.println("Please select an option: \n" +
                        "1. Add an entry. \n" +
                        "2. Edit entries - Search by name. \n" +
                        "3. Edit entries - Search by mobile number. \n" +
                        "4. Delete an entry - Search by name. \n" +
                        "5. Delete an entry - Search by mobile number." +
                        "6. View all entries in address book - Sorted by name. \n" +
                        "7. View all entries in address book - Sorted by mobile number. \n" +
                        "8. Exit address book.");

                menuChoice = input.nextInt();

            }
            else if (menuChoice==1) {
                //have the user enter another address and add it to the file

                // enable scanner for input
                Scanner input = new Scanner(System.in);

                // array to tell user what to enter
                String[] prompts = new String[9];
                prompts[0] = "enter First Name";
                prompts[1] = "enter Last Name";
                prompts[2] = "enter Home Phone";
                prompts[3] = "enter Mobile Phone";
                prompts[4] = "enter Email";
                prompts[5] = "enter Street";
                prompts[6] = "enter Street Number";
                prompts[7] = "enter Town";
                prompts[8] = "enter Zip";

                // array to save user input
                String[] add = new String[9];

                // display text from array and collect responses in array
                for (int i=0; prompts.length>i; i++)
                {
                    System.out.println(prompts[i]);
                    add[i] = input.nextLine();
                }

                // called add method to add user responses to file
                Person p = new Person(add[0], add[1], Long.parseLong(add[2]), Long.parseLong(add[3]), add[4],
                        new Address(Integer.parseInt(add[6]), add[5], add[7], Integer.parseInt(add[8])));

                menuChoice = 0;
            }
            else if (menuChoice==2)
            {
                menuChoice = 0;
            }
            else if (menuChoice==3)
            {
                //get input
                //run method to show input
                menuChoice = 0;
            }
            else if (menuChoice==4)
            {
                menuChoice = 0;
            }
            else if (menuChoice==5)
            {

                menuChoice = 0;
            }
            else if (menuChoice==6)
            {
                menuChoice = 0;
            }
            else if (menuChoice==7)
            {
                menuChoice = 0;
            }
            else if (menuChoice==8)
            {

            }

        }

    }
}
