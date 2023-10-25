package com.shopping.shoppingmall.Member;

import com.shopping.shoppingmall.Cart.Cart;
import com.shopping.shoppingmall.Coupon.Coupon;
import com.shopping.shoppingmall.Order.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Member {

    @Id
    @Column(name="mId")
    private String id;

    private String mPassword;

    @Embedded
    private MemberInfo memberInfo; // 멤버 정보

    private Date mCreatedAt;

    private Date mUpdatedAt;

    private boolean isCoupon;
    @OneToMany
    @JoinColumn(name="cId")
    List<Coupon> coupons = new ArrayList<>();
    @OneToMany
    List<Order> orders = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="cartNo")
    private Cart cart;

}
