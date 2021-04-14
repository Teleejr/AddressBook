package org.perscholas.data;

import java.io.*;
import java.util.*;

/**
 * The type Book manager.
 */
public class BookManager implements Add, Update<Person>, Search<Person>, Remove {

    List<Person> persons = new ArrayList<>();
    //method to append users input into file
    public void enterAdd() {
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
        addAddress(add[0], add[1], add[2], add[3], add[4], add[5], add[6], add[7], add[8]);
    }

    //search person by phone
    @Override
    public Person search(String name) {
        Person p = new Person();
        for (int i = 0; i < persons.size(); i++) {
            if(persons.get(i).getName().equalsIgnoreCase(name)){
                p = persons.get(i);
            }
        }
        return p;
    }

    //search person by name
    @Override
    public Person search(long phone) {
        Person p = new Person();
        for (int i = 0; i < persons.size(); i++) {
            if(persons.get(i).getPhone() == phone){
                p = persons.get(i);
                break;
            }
        }
        return p;
    }

    @Override
    public Person update(String name) {
        Person p = search(name);
        p.setEmail("mary@outlook.fr");
        return p;
    }

    @Override
    public Person update(long phone) {
        Person p = search(phone);
        p.setName("foo");
        return p;
    }

    @Override
    public boolean remove(String name) {
        Person p = search(name);
        return persons.remove(p);
    }

    @Override
    public boolean remove(long phone) {
        Person p = search(phone);
        return persons.remove(p);
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
        Person p = null;  // new objec
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
