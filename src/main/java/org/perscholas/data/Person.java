package org.perscholas.data;

import com.sun.jdi.request.ClassUnloadRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private int phone;
    private int mobile;
    private String email;
    private Address address;
}
