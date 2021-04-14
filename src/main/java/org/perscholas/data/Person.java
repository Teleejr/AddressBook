package org.perscholas.data;

import com.sun.jdi.request.ClassUnloadRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private String surname;
    private long phone;
    private long mobile;
    private String email;
    private Address address;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return phone == person.phone && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
