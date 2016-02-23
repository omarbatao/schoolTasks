/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.site;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author FSEVERI\ceretta2991
 */
@Controller
public class MainController {
    
    private List<Libro> libri;
    
    public MainController(){
        libri = new ArrayList<Libro>();
        
        libri.add(new Libro("Libro 1","Autore Libro1","Descrizione",1));
        libri.add(new Libro("Libro 2","Autore Libro2","Descrizione",2));
        libri.add(new Libro("Libro 3","Autore Libro3","Descrizione",3));
        libri.add(new Libro("Libro 4","Autore Libro4","Descrizione",4));
        libri.add(new Libro("Libro 5","Autore Libro5","Descrizione",5));
        libri.add(new Libro("Libro 6","Autore Libro6","Descrizione",6));
    }
    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)//defaulr get metod
    public String index(ModelMap map/*, @RequestParam(value = "id",required=false) String id*/){
        
        map.put("titolo","Archivio Libri");
        map.put("titpag","titolo");
        //map.put("valpass",id);
        map.put("libri",libri);
        
        return "paginaPrincipale";
    }
    @RequestMapping(value = "/visionaLibro", method = RequestMethod.GET)//defaulr get metod
    public String visonaLibro(ModelMap map,@RequestParam(value = "id",required=false) Integer id){
        
        if(id==null) return "redirect";
        
        if(id<1||id>libri.size()) return "redirect";
        Libro libro = libri.get(id-1);
        map.put("libro",libro);
        return "visionaLibro";
    }
    
}
