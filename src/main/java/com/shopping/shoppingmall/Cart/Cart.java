package com.shopping.shoppingmall.Cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {

    @Id
    @GeneratedValue
    @Column(name="cartNo")
    private Long id;

    private int cartQuantity;



}
