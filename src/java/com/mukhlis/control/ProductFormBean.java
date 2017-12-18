/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mukhlis.control;

/**
 *
 * @author user
 */
class ProductFormBean {
    private String namaProduk;
    private double hargaProduk;
    private int quantity;

    public ProductFormBean() {
    }

    public ProductFormBean(String namaProduk, double hargaProduk, int quantity) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.quantity = quantity;
    }
    
    

    /**
     * @return the namaProduk
     */
    public String getNamaProduk() {
        return namaProduk;
    }

    /**
     * @param namaProduk the namaProduk to set
     */
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    /**
     * @return the hargaProduk
     */
    public double getHargaProduk() {
        return hargaProduk;
    }

    /**
     * @param hargaProduk the hargaProduk to set
     */
    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
