package com.company;

import java.util.ArrayList;
import java.util.Random;
/**
 * Klasse Dieb erbt von Oberklasse Spielfigur
 */

public class Dieb extends Spielfigur{

    ArrayList<String> diebesgutKammer = new ArrayList<>();
    public Dieb(String name, double groesse, int ausdauer, int schnelligkeit, int schlagkraft, int ruestungsStaerke, String geschlecht, int erfahrungsPunkte) {
        super(name, groesse, ausdauer, schnelligkeit, schlagkraft, ruestungsStaerke, geschlecht, erfahrungsPunkte);

    }



    public String willStehlen() {
        String[] randomBeute = {"ein Bonbon", "eine Schokolade", "einen Stinkerkäse"};  // Array mit Strings
        Random beute = new Random();
        int diebesgut = beute.nextInt(randomBeute.length);
        diebesgutKammer.add(randomBeute[diebesgut]);
        return diebesgutKammer.get(diebesgutKammer.size()-1);
    }

    public String toString(){
        String ausgabe = "   '\n" +
                "=={==========-     *Dieb*\n" +
                "   `\n"+
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
