package org.perscholas.data;

import java.util.List;

public class BookManager implements Print<Person>, Update<Person>, Search<Person> {
    @Override
    public void print(List<Person> p) {

    }

    @Override
    public Person update(String name, String element, String value) {
       //insert search implementation

        return null;
    }

    @Override
    public Person update(long phone, String element, String value) {
       //insert search implementation
       return null;
    }


    @Override
    public Person search(Person person) {
        return null;
    }
}
