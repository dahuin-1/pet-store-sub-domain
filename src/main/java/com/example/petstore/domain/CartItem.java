package com.example.petstore.domain;

import java.util.List;

import javax.persistence.*;


@Entity
public class CartItem {

    @Id  @GeneratedValue
    Long id;

    @ManyToOne
    Customer customer;

   // @OneToMany
    String pet;

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    @Embedded
    Payment payment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    
    
}
