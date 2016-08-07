package com.bc.exampple.restws;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bruno Condemi
 */
@XmlRootElement
public class People {
    private String firstName, lastName;
    private int age;

    public People() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
