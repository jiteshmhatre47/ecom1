package com.pctechworld.desktop_system_portal.services;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pctechworld.desktop_system_portal.Entities.Pccart;
import com.pctechworld.desktop_system_portal.Entities.Pcworld;
import com.pctechworld.desktop_system_portal.Entities.STATUS;

import com.pctechworld.desktop_system_portal.repositories.PccartRepository;
import com.pctechworld.desktop_system_portal.repositories.PcworldRepository;

@Service
public class PccartImpl implements PccartInterface {

    @Autowired
    PccartRepository obj;
    @Autowired
    PcworldRepository ret;

    public ArrayList fetchAll(){
        float totalPrice=0;
        int i=0;
        ArrayList list = new ArrayList();
        List<Pccart> c1 = obj.findAll();
        for(i = 0; i<c1.size();i++){
            
            Optional<Pcworld> c2 = ret.findById(c1.get(i).getProductId());
            int c3 = c1.get(i).getCartQuantity();
            totalPrice = totalPrice + (c3*c2.get().getProductPrice()); 
            list.add(Arrays.asList(c2.get().getProductImage(),c2.get().getProductName(),c2.get().getProductPrice(),c2.get().getProductCatagories(),c2.get().getProductDescription(),c2.get().getProductStatus(),totalPrice));  
        
            
    }
        return list;
  
    
        
}
    public Optional<Pccart> fetchAllByCartId(String cartId) {
        Optional<Pccart> ret=obj.findById(cartId);
        if(ret.isPresent())
        {
            return obj.findById(cartId);
        }
        return ret;
        
      


      
     
    }

    public String addIdByCartId(Pccart cartId) {
        Optional<Pcworld> ir=ret.findById(cartId.getProductId());
        if(ir.isPresent()){
        if(ir.get().getProductStatus()==STATUS.ACTIVE){
            obj.save (cartId);
        return "Updated Successfully";
        }
        else
        {
            return "Inactive value return";
        }
        }
        else
        {
            return "does not exist";
        }
        
    } 


    public Pccart updateByProductId(Pccart cartObj){
        if(cartObj.getCartId()== null){
            return null;
        }
        else{
            Optional<Pccart> c1 = obj.findById(cartObj.getCartId());
            c1.get().setCartQuantity(cartObj.getCartQuantity());
            c1.get().setProductId(cartObj.getProductId());
            obj.deleteById(cartObj.getCartId());
            return obj.save(cartObj);
        }

    }

    public String deleteByCartId(String cartId){
        obj.deleteById(cartId);
        return "Deleted successfully";
    }

    public String deleteByProductId(String productId)
    {
        obj.deleteByProductId(productId);
        return "Deleted successfully";
    } 

    
}

