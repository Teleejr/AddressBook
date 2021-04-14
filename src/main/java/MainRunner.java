
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import org.perscholas.data.Address;
import org.perscholas.data.BookManager;
import org.perscholas.data.Person;


public class MainRunner {


    public static void main(String args[]) {
        try  // exception handling try catch
        {
            File file = new File("myFile.txt");    //creates a new file instance
            FileReader fr = new FileReader("./src/main/resources/Address.csv");   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb = new StringBuffer();    //constructs a string buffer with no characters
            Person p = new Person();   // new object

            String line;  // String to hold content
            while ((line = br.readLine()) != null)  // while the line is not empty
            {
                String[] words = line.split(",");
                //System.out.println(Arrays.toString(words[1]));  // Array of strings
                System.out.println(words[1]);
                //sb.append(line);      //appends line to string buffer
                sb.append("\n");     //line feed
            }
            fr.close();    //closes the stream and release the resources
            System.out.println("Contents of File: ");  // prints the file content
            System.out.println(sb.toString());   //returns a string that textually represents the object
            System.out.println(sb.indexOf("Smith"));

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a Mobile Number without dashes ");
            //System.out.println("Mobile number " +scan+ "is in the address book: " + line.contains (scan));
        } catch (IOException e) // exception handling
        {
            e.printStackTrace(); // if exception print stack trace
        }


//        //instanciate new contact
//        Person p = new Person("Pete", "Prattis", 210123456, 123456, "pete@mail.com",
//                new Address(1, "Newstrt", "Athens", 1234));
//        Person p2 = new Person("Adam", "Adams", 210234567, 123987, "adam@mail.com",
//                new Address(21, "Oldstrt", "London", 5553));
        BookManager bm = new BookManager();
        Person p = bm.update("Pete", "Mobile", "28865534");



    }
}
