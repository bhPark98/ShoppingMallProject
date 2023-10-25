package com.shopping.shoppingmall.Category;

import com.shopping.shoppingmall.Product.Product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue
    @Column(name="categoryNo")
    private Long id;

    @OneToMany(mappedBy = "Category")
    List<Product> products = new ArrayList<>();

    private String categoryName;

}
