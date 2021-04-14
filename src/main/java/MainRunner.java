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

/*
        System.out.println("------------------------------------");
        System.out.println(Arrays.toString(contactList.toArray()));
        System.out.println("------------------------------------");

        Person p2 = bm.search(contactList.get(2).getPhone());
        System.out.println("some text : "+p2.toString());


            System.out.println("Enter a Mobile Number without dashes ");
            //System.out.println("Mobile number " +scan+ "is in the address book: " + line.contains (scan));

        //Person p = bm.update("Pete", "Mobile", "28865534");

*/
        Scanner input = new Scanner(System.in);
      boolean end = false;

        int menuChoice = 0;

        while (end==false) {

            if (menuChoice==0) {
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
                bm.enterAdd();
                System.out.println("Address Added");

                //restart main menu
                menuChoice = 0;
            }
            else if (menuChoice==2)
            {
                Person p = bm.update("Mary");
                System.out.println("updated by name : "+p.toString());
                menuChoice = 0;
            }
            else if (menuChoice==3)
            {
                Person p = bm.update(123456);
                System.out.println("updated by phone : "+p.toString());
                menuChoice = 0;
            }
            else if (menuChoice==4)
            {
                System.out.println("enter name of contact that you want to remove : ");
                String name = input.next();
                boolean value = bm.remove(name);
                if(value) {
                    menuChoice = 6;
                    System.out.println("removed recored with name : "+ name);
                }else{
                    menuChoice = 0;
                }
            }
            else if (menuChoice==5)
            {
                System.out.println("enter phone number that you want to remove : ");
                long number  = input.nextLong();
                boolean value = bm.remove(number);
                if(value) {
                    System.out.println("removed recored with number : "+ number);
                    menuChoice = 6;
                }else{
                    menuChoice = 0;
                }
            }
            else if (menuChoice==6)
            {
                for (Person person : contactList) {
                    System.out.println(person);
                }
                menuChoice = 0;
            }
            else if (menuChoice==7)
            {
                menuChoice = 0;
            }
            else if (menuChoice==8)
            {
                System.exit(0);
            }

        }

    }
}
