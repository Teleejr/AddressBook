import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {

    public static void main(String[] args) {
        File fileName = new File("src/main/resources/Address.csv");
        List<String> contacts = null;
        Scanner scan;

        try {
            scan = new Scanner(fileName);
            contacts = new ArrayList<>();

            while(scan.hasNextLine()) {
                contacts.add(scan.nextLine());
            }//End while

        }//End try
        catch (FileNotFoundException f) {
            f.printStackTrace();
        }//End catch

        for (String contact : contacts) System.out.println(contact);




    }
}
