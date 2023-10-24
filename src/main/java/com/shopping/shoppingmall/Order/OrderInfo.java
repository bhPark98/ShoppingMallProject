package com.shopping.shoppingmall.Order;

import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class OrderInfo {

    private String oComment;

    private Date oEnroll;

    private String Addressee;

    private String Address;

    private String oPhone;

}
