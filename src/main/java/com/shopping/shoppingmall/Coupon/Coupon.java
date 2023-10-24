package com.shopping.shoppingmall.Coupon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coupon {

    @Id
    @Column(name="cId")
    private String id;

    private String cName;

    private Float cRate;

    private Long cPrice;


}
