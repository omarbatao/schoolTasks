/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.site;

/**
 *
 * @author FSEVERI\ceretta2991
 */
public class Libro {
 
    private String titolo;
    private String autore;
    private String desc;
    private int id;

    public Libro(String titolo, String autore, String desc, int id) {
        this.titolo = titolo;
        this.autore = autore;
        this.desc = desc;
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getDesc() {
        return desc;
    }

    public int getId() {
        return id;
    }
    public String ottieniId(){
        return ""+this.id;
    }
    
    
    
    
}
