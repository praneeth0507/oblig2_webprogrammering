package com.example.oblig2_webprogrammering;

public class Billett {
    private String film;
    private int antall;
    private String fornavn;
    private String etternavn;
    private String tlfnr;
    private String epost;

    public Billett(String film, int antall, String fornavn, String etternavn, String tlfnr, String epost){
        this.film=film;
        this.antall=antall;
        this.fornavn=fornavn;
        this.etternavn=etternavn;
        this.tlfnr=tlfnr;
        this.epost=epost;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
