package org.perscholas.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Book manager.
 */
public class BookManager implements Add<Person>, Update<Person>, Search<Person>, Remove<Person>{
    List<Person> persons = new ArrayList<>();
    //add a new contact in the list
    @Override
    public void add(Person person) {

    }

    //update person by name
    @Override
    public Person update(String name) {
       //insert search implementation
        Person p = new Person(); ;
        for (Person person : persons) {
            if (person.getName().equalsIgnoreCase(name)) {
                p = person;
                break;
            }
        }
        p.setPhone(987665);
        return p;
    }

    //update person by phone
    @Override
    public Person update(long phone) {
       //insert search implementationPerson
        Person p = new Person(); ;
        for (Person person : persons) {
            if (person.getMobile() == phone) {
                p = person;
                break;
            }
        }
       p.setName("foo");
       return p;
    }


    //search person by phone
    @Override
    public Person search(String name) {
        return null;
    }

    //search person by name
    @Override
    public Person search(long phone) {
        //write logic of sarch funtion

        return null;
    }

    @Override
    public void remove(String name) {

    }

    @Override
    public void remove(long phone) {
        Person p = new Person(); ;
        for (Person person : persons) {
            if (person.getMobile() == phone) {
                p = person;
                break;
            }
        }
        persons.remove(p);
    }


    /**
     * Gets all contact from file.
     *
     * @param fr the file Reader
     * @return the all contact from file
     * @throws IOException the io exception
     */
    public List<Person> getAllContactFromFile(FileReader fr) throws IOException {

        BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
        Person p = null;  // new object
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
    }
}
