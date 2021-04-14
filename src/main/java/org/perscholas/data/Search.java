package org.perscholas.data;

public interface Search<T> {
    T search(String name);
    T search(long phone);
}
