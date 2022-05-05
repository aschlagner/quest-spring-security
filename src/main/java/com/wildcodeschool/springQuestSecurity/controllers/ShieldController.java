package com.wildcodeschool.springQuestSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String all() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String heroes() {
        return "Avengers..... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "<ul><li>Amsterdam<li>Barcelona<li>Berlin<li>Brüssel<li>Bukarest<li>Lissabon<li>London<li>Madrid<li>Biarritz<li>Bordeaux<li>La Loupe<li>Lille<li>Lyon<li>Marseille<li>Nantes<li>Orléans<li>Paris<li>Reims<li>Straßburg<li>Toulouse<li>Tours</ul>";
    }

}