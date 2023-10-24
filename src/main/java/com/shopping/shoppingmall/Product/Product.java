package com.shopping.shoppingmall.Product;

import com.shopping.shoppingmall.Cart.Cart;
import com.shopping.shoppingmall.Category.Category;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @Column(name="pId")
    private Long id;

    @OneToOne
    @JoinColumn(name="cartNo")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name="categoryNo")
    private Category category;

    private String pName;

    private String pInfo;

    private int pStock;

    private int pSell;

}
