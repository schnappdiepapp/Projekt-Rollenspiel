package com.company;

/**
 * Klasse Krieger erbt von Oberklasse Spielfigur
 */

public class Krieger extends Spielfigur{


    public Krieger(String name, double groesse, int ausdauer, int schnelligkeit, int schlagkraft, int ruestungsStaerke, String geschlecht, int erfahrungsPunkte) {
        super(name, groesse, ausdauer, schnelligkeit, schlagkraft, ruestungsStaerke, geschlecht, erfahrungsPunkte);

    }


    public String toString(){
        String ausgabe = "      /| ________________\n" +
                "O|===|* >________________>      *Krieger*\n" +
                "      \\|\n" +
                "*********** Werte ***********\n"+
                " Name: \t\t\t\t" + this.getName()+
                "\n Größe: \t\t\t" + this.getGroesse()+
                "\n Ausdauer: \t\t\t" + this.getAusdauer()+
                "\n Schnelligkeit: \t" + this.getSchnelligkeit()+
                "\n Schlagkraft: \t\t" + this.getSchlagkraft()+
                "\n Rüstungsstärke: \t" + this.getRuestungsStaerke()+
                "\n Geschlecht: \t\t" + this.getGeschlecht()+
                "\n Erfahrungspunkte\t" + this.getErfahrungsPunkte()+
                "\n******************************\n\n";
        return ausgabe;
    }
}