package com.example.oblig2_webprogrammering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {

    private final List<Billett> alleBilletter = new ArrayList<>();


    @GetMapping("hentFilmer")
    public List<Filmer> hentFilmer(){
        List<Filmer> listFilmer = new ArrayList<>();
        listFilmer.add(new Filmer("Velg en film"));
        listFilmer.add(new Filmer("Black Widow"));
        listFilmer.add(new Filmer("Fast & Furious 9"));
        listFilmer.add(new Filmer("The Batman"));
        listFilmer.add(new Filmer("The Boss Baby: Family business"));
        return listFilmer;
    }

    @GetMapping("/hentAlle")
    public List<Billett> hentAlle(){
        return alleBilletter;
    }

    @PostMapping("/lagre")
    public void lagreBillett(Billett innBillett){
        alleBilletter.add(innBillett);
    }


    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleBilletter.clear();
    }

}
