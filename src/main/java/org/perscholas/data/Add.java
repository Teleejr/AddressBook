package org.perscholas.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public interface Add<T> {

    public void add(T t);
/*
    default void addAddress(String name, String surname, String phone, String mobile, String email, String street, String number, String town, String zip) {

        //set access to file
        File file = new File("src/main/resources/org.perscholas.data.Address.csv");

        BufferedWriter buffer = null;

        //try to write to file if no exceptions
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            buffer = new BufferedWriter(fileWriter);
            buffer.write(name.trim().toLowerCase() + "," + surname.trim().toLowerCase() + "," + phone.trim().toLowerCase() + "," +
                    mobile.trim().toLowerCase() + "," + email.trim().toLowerCase() + "," + street.trim().toLowerCase() + "," +
                    number.trim().toLowerCase() + "," + town.trim().toLowerCase() + "," + zip.trim().toLowerCase() + "\n");
        }
        // catch any exceptions
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //if the fileWriter isn't null flush and close it
                if (buffer != null) {
                    buffer.flush();
                    buffer.close();
                }
                // catch any IO exceptions
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

 */
}
