package com.pctechworld.desktop_system_portal.controller;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pctechworld.desktop_system_portal.Entities.Pccart;
import com.pctechworld.desktop_system_portal.services.PccartImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RequestMapping("/api/cart")
@ RestController
public class PccartController {

    @Autowired
    private PccartImpl srv;
    
    
    @GetMapping(value = "")
    public ArrayList fetchAll() {
        return srv.fetchAll();
    }

    @GetMapping(value = "/{cartId}")
    public Optional<Pccart> fetchAllByCartId(@PathVariable("cartId") String cartId){
            return srv.fetchAllByCartId(cartId);
        }
    
    @PostMapping(value="/add")
    public String addIdByCartId(@RequestBody Pccart cartObj) {
        return srv.addIdByCartId(cartObj);
    }

    @DeleteMapping(value = "/delete/{cartId}")
    public String deleteByCartId(@PathVariable String cartId){
        return srv.deleteByCartId(cartId);
    }

    @PutMapping(value="/update")
    public Pccart updateByProductId(@RequestBody Pccart cartobj){
        return srv.updateByProductId(cartobj);
    }
    
    @DeleteMapping(value="/pdelete/{productId}")
    public String deleteByProductId(@PathVariable("productId") String productId){
        return srv.deleteByProductId(productId);
    }
}
