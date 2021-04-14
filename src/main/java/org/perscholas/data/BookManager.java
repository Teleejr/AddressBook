package org.perscholas.data;

import java.io.*;
import java.util.*;

/**
 * The type Book manager.
 */
public class BookManager implements Add, Update<Person>, Search<Person> {

    //method to append users input into file
    public void enterAdd() {

    }

    //update person by name
    @Override
    public Person update(String name, String element, String value) {
       //insert search implementation
        //write logic of update  funtion
        return null;
    }

    //update person by phone
    @Override
    public Person update(long phone, String element, String value) {
       //insert search implementation
       return null;
    }


    //search person by phone
    @Override
    public Person search(String name) {
        return null;
    }

    //search person by name
    @Override
    public Person search(long phone) {
        return null;
    }


    /**
     * Gets all contact from file.
     *
     * @param fr the file Reader
     * @return the all contact from file
     * @throws IOException the io exception
     */
   /* public List<Person> getAllContactFromFile(FileReader fr) throws IOException {

        BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
        Person p = null;  // new object
        List<Person> persons = new List<>();
        String line;  // String to hold content

        while ((line = br.readLine()) != null)  // while the line is not empty
        {
            String[] words = line.split(","); // create a String Array split by comma that stock the CSV elements.
            p = new Person(words[0], words[1], Long.parseLong(words[2]), Long.parseLong(words[3]), words[4],
                    new Address(Integer.parseInt(words[6]), words[5], words[7], Integer.parseInt(words[8])));

            persons.add(p); //add contact(Person) to the list
            words = new String[9]; //remove data from arrays
        }
        return persons;
    }*/


}
