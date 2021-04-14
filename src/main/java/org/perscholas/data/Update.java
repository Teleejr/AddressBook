package org.perscholas.data;

public interface Update<T> {

    T update(String name);
    T update(long phone);

}
