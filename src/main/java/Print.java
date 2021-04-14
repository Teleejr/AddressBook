import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Print {

    default public void viewByName() {
        File fileName = new File("src/main/resources/Address.csv");
        List<String> contacts = null;
        try

        {
            Scanner scan = new Scanner(fileName);
            contacts = new ArrayList<>();

            while (scan.hasNextLine()) {
                contacts.add(scan.nextLine());
            }//End while

        }//End try
        catch(
                FileNotFoundException f)

        {
            f.printStackTrace();
        }//End catch

        for(
                String contact :contacts)System.out.println(contact);
    }
}
