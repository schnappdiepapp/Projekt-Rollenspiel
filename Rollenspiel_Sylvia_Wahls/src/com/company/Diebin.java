package com.company;

import java.util.ArrayList;
import java.util.Random;
/**
 * Klasse Diebin erbt von Oberklasse Spielfigur
 */

public class Diebin extends Spielfigur{


    ArrayList<String> diebesgutKammer2 = new ArrayList();
    public Diebin(String name, double groesse, int ausdauer, int schnelligkeit, int schlagkraft, int ruestungsStaerke, String geschlecht, int erfahrungsPunkte) {
        super(name, groesse, ausdauer, schnelligkeit, schlagkraft, ruestungsStaerke, geschlecht, erfahrungsPunkte);

    }

    public String willStehlen2() {
        String[] randomBeute = {"einen Schlüppi", "einen Schnurrbart", "den gesamten Besitz, einfach alles"};
        Random beute = new Random();
        int diebesgut = beute.nextInt(randomBeute.length);
        diebesgutKammer2.add(randomBeute[diebesgut]);
        return diebesgutKammer2.get(diebesgutKammer2.size()-1);
    }

    public String toString(){
        String ausgabe = "   '\n" +
                "=={==========-     *Diebin*\n" +
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
