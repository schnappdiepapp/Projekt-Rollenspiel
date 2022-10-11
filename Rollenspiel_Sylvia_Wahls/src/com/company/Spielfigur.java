package com.company;

public class Spielfigur {

    private String name, geschlecht;
    private int ausdauer, schnelligkeit, schlagkraft, ruestungsStaerke, erfahrungsPunkte;
    double groesse;

    /**
     * Oberklasse
     * @param name
     * @param groesse
     * @param ausdauer
     * @param schnelligkeit
     * @param schlagkraft
     * @param ruestungsStaerke
     * @param geschlecht
     * @param erfahrungsPunkte
     * Konstruktor
     * getter und setter
     */
    public Spielfigur (String name, double groesse, int ausdauer, int schnelligkeit, int schlagkraft, int ruestungsStaerke, String geschlecht, int erfahrungsPunkte){
        this.name = name;
        this.groesse = groesse;
        this.ausdauer = ausdauer;
        this.schnelligkeit = schnelligkeit;
        this.schlagkraft = schlagkraft;
        this.ruestungsStaerke = ruestungsStaerke;
        this.geschlecht = geschlecht;
        this.erfahrungsPunkte = erfahrungsPunkte;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public int getAusdauer() {
        return ausdauer;
    }

    public void setAusdauer(int ausdauer) {
        this.ausdauer = ausdauer;
    }

    public int getSchnelligkeit() {
        return schnelligkeit;
    }

    public void setSchnelligkeit(int schnelligkeit) {
        this.schnelligkeit = schnelligkeit;
    }

    public int getSchlagkraft() {
        return schlagkraft;
    }

    public void setSchlagkraft(int schlagkraft) {
        this.schlagkraft = schlagkraft;
    }

    public int getRuestungsStaerke() {
        return ruestungsStaerke;
    }

    public void setRuestungsStaerke(int ruestungsStaerke) {
        this.ruestungsStaerke = ruestungsStaerke;
    }


    public int getErfahrungsPunkte() {
        return erfahrungsPunkte;
    }

    public void setErfahrungsPunkte(int erfahrungsPunkte) {
        this.erfahrungsPunkte = erfahrungsPunkte;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
}
