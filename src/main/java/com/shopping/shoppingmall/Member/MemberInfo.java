package com.shopping.shoppingmall.Member;

import javax.persistence.Embeddable;

@Embeddable
public class MemberInfo {

    private String mName;

    private int mAge;

    private String mGender;

    private String mEmail;

    private String mPhone;

    private String mAddress;

}
