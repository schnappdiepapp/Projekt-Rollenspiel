package com.company;

import java.util.Random;
/**
 * Klasse Bogenschütze erbt von Oberklasse Spielfigur
 */

public class Bogenschuetze extends Spielfigur{


    public Bogenschuetze(String name, double groesse, int ausdauer, int schnelligkeit, int schlagkraft, int ruestungsStaerke, String geschlecht, int erfahrungsPunkte) {
        super(name, groesse, ausdauer, schnelligkeit, schlagkraft, ruestungsStaerke, geschlecht, erfahrungsPunkte);

    }

    // Random Anzahl Pfeile von 0 - 20
    public int pfeileAbschiessen(){
        Random anzPfeile = new Random();
        return anzPfeile.nextInt(20);

    }

    public String toString(){
        System.out.println();
        String ausgabe = "   (\n" +
                "    \\\n" +
                "     )\n" +
                "##-------->    *Bogenschütze*\n"+
                "     )\n" +
                "    /\n" +
                "   (\n\n" +
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
