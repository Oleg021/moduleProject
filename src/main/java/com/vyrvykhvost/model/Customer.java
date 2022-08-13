package com.vyrvykhvost.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Customer {
    private String id;
    private String email;
    private int age;

    public Customer() {}
    public Customer(String email, int age) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Customer: " +
                "id = " + id +
                ", email = " + email +
                ", age = " + age +
                "}";
    }
}
