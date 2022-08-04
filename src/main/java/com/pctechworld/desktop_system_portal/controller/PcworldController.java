package com.pctechworld.desktop_system_portal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pctechworld.desktop_system_portal.Entities.Pcworld;
import com.pctechworld.desktop_system_portal.services.PcworldImpl;
import org.springframework.web.bind.annotation.PutMapping;


@RequestMapping("api/product")
@RestController
public class PcworldController {

    @Autowired
    private PcworldImpl srv;

    @GetMapping(value = "")
    public List<Pcworld> fetchAllByProducts() {
        return srv.fetchAllByProducts();
    }

    @GetMapping(value="/id/{productId}")
    public Optional<Pcworld> fetchAllByProductId(@PathVariable ("productId") Pcworld productId){
        return srv.fetchAllByproductId(productId);

    }

    @GetMapping(value = "/name/{productName}")
    public Optional<List<Pcworld>> fetchNameByProductName(@PathVariable("productName") String productName) {
        return srv.fetchNameByProductName(productName);
    }

    @PostMapping(value = "/add")
    public String addIdByProductId(@RequestBody Pcworld addObj) {
        return srv.addIdByProductId(addObj);
    }

    @PutMapping(value="/update")
    public Pcworld updateByProductId( @RequestBody Pcworld uptObj) {
        
        
        return srv.updateByProductId(uptObj);
    }

    @DeleteMapping(value = "/delete/{productId}")
    public String deleteIDByProcuctId(@PathVariable Pcworld productId){
        return srv.deleteIdByProductId(productId);
    }
}
