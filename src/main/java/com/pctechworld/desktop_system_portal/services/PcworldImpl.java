package com.pctechworld.desktop_system_portal.services;

import java.util.List;
import java.util.Optional;

//import org.hibernate.engine.spi.Status;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pctechworld.desktop_system_portal.Entities.Pcworld;
import com.pctechworld.desktop_system_portal.Entities.STATUS;
//import com.pctechworld.desktop_system_portal.Entities.STATUS;
//import com.pctechworld.desktop_system_portal.Entities.Pcworld;
import com.pctechworld.desktop_system_portal.repositories.PcworldRepository;

@Service
public class PcworldImpl implements PcworldInterface {

    @Autowired
    PcworldRepository ret;

    public List<Pcworld> fetchAllByProducts() {
        return ret.findAll();

    }

    public Optional<List<Pcworld>> fetchNameByProductName(String productName) {
        return ret.findByProductName(productName);

    }

    public Optional<Pcworld> fetchAllByproductId(Pcworld pret) {
        //Optional<Pcworld> vr= ret.findById(productId);
        if (pret.getProductStatus()==STATUS.ACTIVE)
        {
            return ret.findById(pret.getProductId());
        }
        else
        {
            return null;
        }

    }

    public String addIdByProductId(Pcworld addRet) {
        ret.save(addRet);
        return "added";
    }

    public Pcworld updateByProductId(Pcworld productRet){
        if(productRet.getProductId() == null){
            return productRet;
        }
        else{
            Optional<Pcworld> p1 = ret.findById(productRet.getProductId());
    
            p1.get().setProductCatagories(productRet.getProductCatagories());
            p1.get().setProductDescription(productRet.getProductDescription());
            p1.get().setProductName(productRet.getProductName());
            p1.get().setProductImage(productRet.getProductImage());
            p1.get().setProductPrice(productRet.getProductPrice());
            p1.get().setProductStatus(productRet.getProductStatus());
    
            ret.deleteById(productRet.getProductId());
            return ret.save(p1.get());
            
        }

}

    public String deleteIdByProductId(Pcworld productId) {
        if (productId.getProductId()==null)
        {
            return "Enter a Vslid Id";
        }
        else
        {
            Optional<Pcworld> d1 = ret.findById(productId.getProductId());
            if(d1.get().getProductStatus()==STATUS.ACTIVE){
                d1.get().setProductStatus(STATUS.INACTIVE);
                ret.save(d1.get());
                return "Retect Deleted Successfully";
            }
            else
            {
                return "!! Retect does not Exist !!";
            }
        }     
    }

   


}