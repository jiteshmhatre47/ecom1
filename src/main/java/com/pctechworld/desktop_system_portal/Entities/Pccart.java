package com.pctechworld.desktop_system_portal.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "pccart")
public class Pccart {
    
    @Id
    private String cartId;
    public int cartQuantity;
    @Column(name = "productId",nullable=false,insertable = true,updatable = true)
    public String productId;
   

    public Pccart(String cartId, int cartQuantity, String productId) {
        this.cartId = cartId;
        this.cartQuantity = cartQuantity;
        this.productId = productId;
    }


    public Pccart(){

    }


    public String getCartId() {
        return this.cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public int getCartQuantity() {
        return this.cartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "{" +
            " cartId='" + getCartId() + "'" +
            ", cartQuantity='" + getCartQuantity() + "'" +
            ", productId='" + getProductId() + "'" +
            "}";
    }






    

    

    
}

