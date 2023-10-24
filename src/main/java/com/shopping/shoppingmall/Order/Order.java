package com.shopping.shoppingmall.Order;

import com.shopping.shoppingmall.Member.Member;
import com.shopping.shoppingmall.Product.Product;

import javax.lang.model.element.ModuleElement;
import javax.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue
    @Column(name="oNo")
    private Long id;

    private Long oPrice;

    @ManyToOne
    @JoinColumn(name="pId")
    private Product product;

    @Embedded
    private OrderInfo orderInfo;
}
