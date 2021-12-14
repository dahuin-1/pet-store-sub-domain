package com.example.petstore.domain;
/*
http :8088/cats name="몽이
http :8088/customers id="help@naver.com" address:='{"zipcode":"123","detail":"..."}'
http :8088/cartItems customer="http://localhost:8088/customers/help@naver.com" pet="http://localhost:8088/cats/1"

 */
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    String id;

    @Embedded
    Address address;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

}

// http :8083/customers id="help@naver.com" address:='{"zipcode":"123","detail":"..."}'
// http :8083/cartItems customer="http://localhost:8083/customers/help@naver.com" pet="http://localhost:8080/cats/1"