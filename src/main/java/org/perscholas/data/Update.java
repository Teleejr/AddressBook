package org.perscholas.data;

public interface Update<T> {

    T update(String name, String element, String value);
    T update(long phone, String element, String value);

}
