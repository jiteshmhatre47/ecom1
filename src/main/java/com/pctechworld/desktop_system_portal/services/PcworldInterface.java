package com.pctechworld.desktop_system_portal.services;

import java.util.List;
import java.util.Optional;

import com.pctechworld.desktop_system_portal.Entities.Pcworld;

////import java.util.List;

//import com.pctechworld.desktop_system_portal.Entities.Pcworld;
//import com.pctechworld.desktop_system_portal.services.PcworldImpl;

public interface PcworldInterface {
  
    public List<Pcworld> fetchAllByProducts();

    public Optional<Pcworld> fetchAllByproductId(Pcworld productId);

    public Optional<List<Pcworld>> fetchNameByProductName(String productName);

    public String addIdByProductId(Pcworld addRet);

    public String deleteIdByProductId(Pcworld productId);
}
