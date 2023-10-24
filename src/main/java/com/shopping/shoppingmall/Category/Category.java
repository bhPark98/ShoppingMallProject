package com.shopping.shoppingmall.Category;

import com.shopping.shoppingmall.Product.Product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long categoryNo;

    @OneToMany(mappedBy = "Category")
    List<Product> products = new ArrayList<>();

    private String categoryName;

}
