/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mukhlis.control;

import com.mukhlis.entity.Tableproduct;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class Cart {
     private Map<Integer, Tableproduct> carts;

    public Cart() {
        carts = new HashMap<>();
    }

    public Cart(Map<Integer, Tableproduct> carts) {
        this.carts = carts;
    }

    /**
     * @return the carts
     */
    public Map<Integer, Tableproduct> getCarts() {
        return carts;
    }

    /**
     * @param carts the carts to set
     */
    public void setCarts(Map<Integer, Tableproduct> carts) {
        this.carts = carts;
    }
    
}
