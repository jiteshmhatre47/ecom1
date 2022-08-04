package com.pctechworld.desktop_system_portal.Entities;

import java.util.LinkedList;
import java.util.List;

//import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

//import org.hibernate.annotations.SQLDelete;
//import org.hibernate.annotations.Where;

@Entity
public class Pcworld {


    
    @Id
    String productId;
    String productImage;
    String productName;
    float  productPrice;
    String productDescription;
    @Enumerated (EnumType.STRING)
    STATUS productStatus;
    @Enumerated(EnumType.STRING)
    CATAGORIES productCatagories;

    @OneToMany
    @JoinColumn(name="productId",referencedColumnName="productId")
    private List<Pccart> pccart = new LinkedList<>();
    

    public Pcworld() {
    }



    public Pcworld(String productId, String productImage, String productName, float productPrice, String productDescription, STATUS productStatus, CATAGORIES productCatagories) {
        this.productId = productId;
        this.productImage = productImage;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productStatus = productStatus;
        this.productCatagories = productCatagories;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductImage() {
        return this.productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public STATUS getProductStatus() {
        return this.productStatus;
    }

    public void setProductStatus(STATUS productStatus) {
        this.productStatus = productStatus;
    }

    public CATAGORIES getProductCatagories() {
        return this.productCatagories;
    }

    public void setProductCatagories(CATAGORIES productCatagories) {
        this.productCatagories = productCatagories;
    }

    

    @Override
    public String toString() {
        return "{" +
            " productId='" + getProductId() + "'" +
            ", productImage='" + getProductImage() + "'" +
            ", productName='" + getProductName() + "'" +
            ", productPrice='" + getProductPrice() + "'" +
            ", productDescription='" + getProductDescription() + "'" +
            ", productStatus='" + getProductStatus() + "'" +
            ", productCatagories='" + getProductCatagories() + "'" +
            "}";
    }



    


   

}
