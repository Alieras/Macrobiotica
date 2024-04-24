package com.macrobiotica.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testimonios")
public class TestimoniosController {
    
    @GetMapping("/listado")
    public String listado() {
        
        return "/testimonios/fragmento";

    }
}


