import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Person {

    //create access to file for address book
    File file = new File("src/main/resources/Address.csv");

    //method to append users input into file
    public void add(String name, String surname, String phone, String mobile, String email, String street, String number, String town, String zip) {
        FileWriter fileWriter = null;

        //try to write to file if no exceptions
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(name.trim().toLowerCase() + "," + surname.trim().toLowerCase() + "," + phone.trim().toLowerCase() + "," + email.trim().toLowerCase() +
                    "," + street.trim().toLowerCase() + "," + number.trim().toLowerCase() + "," + town.trim().toLowerCase() + "," + zip.trim().toLowerCase());
        }
        // catch any exceptions
        catch (Exception e)
            {
                e.printStackTrace();
            }
        finally
        {
            try {
                //if the fileWriter isn't null flush and close it
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
                // catch any IO exceptions
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }





}
