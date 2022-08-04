package com.pctechworld.desktop_system_portal.services;


import java.util.ArrayList;
import java.util.Optional;

import com.pctechworld.desktop_system_portal.Entities.Pccart;

public interface PccartInterface {
    public ArrayList fetchAll();

    public Optional<Pccart> fetchAllByCartId(String cartId);
    
    public String addIdByCartId(Pccart cartObj);

    public String deleteByCartId(String cartId);

    public Pccart updateByProductId(Pccart cartObj);

    public String deleteByProductId(String productId);

    
}
