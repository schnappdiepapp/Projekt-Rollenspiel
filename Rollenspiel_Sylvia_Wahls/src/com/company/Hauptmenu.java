package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Hauptmenü mit
 *  - Main
 *  - Spielfiguren-Erzeugung
 *  - Methoden für die Hauptmenü-Auswahl und Kämpfe
 * @author Sylvia Wahls
 */

public class Hauptmenu {

    private Random kampf = new Random();

    public static void main(String[] args) {

        Hauptmenu hauptmenu = new Hauptmenu();
        hauptmenu.myMenu();


    }


    Bogenschuetze bogenschuetze = new Bogenschuetze("Bobo", 1.75, 80, 80, 30, 20, "männlich", 1);
    Dieb dieb = new Dieb("Didi", 1.65, 100, 90, 50, 40, "männlich", 1);
    Diebin diebin = new Diebin("Dibbi", 1.60, 95, 85, 50, 50, "weiblich", 1);
    Krieger krieger = new Krieger("Kriega", 1.90, 50, 55, 90, 90, "männlich", 1);
    Kriegerin kriegerin = new Kriegerin("Krieggi", 1.70, 50, 55, 85, 90, "weiblich", 1);
    Magier magier = new Magier("Maggi", 1.95, 45, 50, 75, 45, "männlich", 1);
    Monster monster = new Monster("Monsti", 4, 70, 40, 110, 95, "neutral", 1);
    Gegner gegner = new Gegner("Haudruff", 1.20, 200, 200, 200, 200, "neutral", 2);

    static final String HAUPTMENUE =
            "----------------------------------------------\n"
                    + "MyGame       Hauptmenü       von: Sylvia Wahls\n"
                    + "----------------------------------------------\n"
                    + "1) Spiel starten\n"
                    + "2) Highscores\n"
                    + "3) Einstellungen\n"
                    + "4) Über MyGame\n"
                    + "5) Spiel Testen\n"
                    + "0) Spiel beenden\n"
                    + "----------------------------------------------\n"
                    + "Bitte wählen: ";


    public void myMenu() {
        do {
            System.out.println(HAUPTMENUE);
            switch (new Scanner(System.in).next()) {
                case "1":
                    starteSpiel();
                    break;
                case "2":
                    highscores();
                    break;
                case "3":
                    einstellungen();
                    break;
                case "4":
                    ueberMyGame();
                    break;
                case "5":
                    myTests();
                    break;
                case "0":
                    System.out.println("**************************\n Vielen Dank und Tschüss!\n**************************");
                    System.exit(0);
                    break;
                default:
                    falscheEingabe();
                    break;
            }

        } while (true);
    }

    public void starteSpiel() {

        do {
            System.out.println("Wähle eine Klasse aus!");
            System.out.println("1 = Bogenschütze");
            System.out.println("2 = Dieb");
            System.out.println("3 = Diebin");
            System.out.println("4 = Krieger");
            System.out.println("5 = Kriegerin");
            System.out.println("6 = Magier");
            System.out.println("7 = Monster");
            System.out.println("0 = zurück zum Hauptmenü");

            switch (new Scanner(System.in).next()) {
                case "1":
                    nimmBogenschuetze();
                    break;
                case "2":
                    nimmDieb();
                    break;
                case "3":
                    nimmDiebin();
                    break;
                case "4":
                    nimmKrieger();
                    break;
                case "5":
                    nimmKriegerin();
                    break;
                case "6":
                    nimmMagier();
                    break;
                case "7":
                    nimmMonster();
                    break;
                case "0":
                    myMenu();
                    break;
                default:
                    falscheEingabe();
                    break;
            }

        } while (true);


    }


    public void highscores() {
        System.out.println("**********\nHighscores\n**********");
    }

    public void einstellungen() {
        System.out.println("*************\nEinstellungen\n*************");
    }

    public void ueberMyGame() {
        System.out.println("***********\nÜber MyGame\n***********");
    }

    public void myTests() {
        System.out.println("********** Spiel Ausgabe *********");
        System.out.println(bogenschuetze.toString());
        System.out.println(dieb.toString() + "Diebesgutkammer:\n" + dieb.diebesgutKammer + "\n\n");
        System.out.println(diebin.toString() + "Diebesgutkammer:\n" + diebin.diebesgutKammer2 + "\n\n");
        System.out.println(krieger.toString());
        System.out.println(kriegerin.toString());
        System.out.println(magier.toString());
        System.out.println(monster.toString());
    }

    public void falscheEingabe() {
        System.out.println("\nFalsche Eingabe. Zurück zum Hauptmenü!\n");
        myMenu();
    }


    public void nimmBogenschuetze() {
        System.out.println(bogenschuetze.toString()); // toString-Methode aus der Klasse Bogenschütze wird auf das Objekt bogenschütze aufgerufen
        Random feind = new Random();
        int gegner = feind.nextInt(2); // zufällige Gegner-Anzahl von 0 bis 2

        System.out.println(">>>>>>>>>>>>>>Du hast " + gegner + " Gegner<<<<<<<<<<<<<<\n");

        boolean sieg = kampf.nextBoolean(); // sieg ist random true oder false
        if (gegner == 0) {
            System.out.println("Du hast keine Pfeile gebraucht und trotzdem: ");
            System.out.println("Yeah!!! Gewonnen!");
            bogenschuetze.setErfahrungsPunkte(bogenschuetze.getErfahrungsPunkte() + bogenschuetze.getErfahrungsPunkte() + (gegner * 2)); // die Erfahrungspunkte werden berechnet und mit dem setter neu gesetzt
        } else if (sieg) {
            int anzPfeile = bogenschuetze.pfeileAbschiessen();
            System.out.println(anzPfeile + " Pfeile geschossen");
            System.out.println("Yeah!!! Gewonnen!");
            bogenschuetze.setErfahrungsPunkte(bogenschuetze.getErfahrungsPunkte() + bogenschuetze.getErfahrungsPunkte() + (gegner * 2)); // die Erfahrungspunkte werden berechnet und mit dem setter neu gesetzt
        } else {
            int anzPfeile = bogenschuetze.pfeileAbschiessen();
            System.out.println(anzPfeile + " Pfeile geschossen");
            System.out.println("Schade, Verloren!");
        }
        System.out.println("\nNeuer Status:");
        System.out.println(bogenschuetze.toString());
    }

    public void nimmDieb() {
        System.out.println(dieb.toString());
        Random feind = new Random();
        int gegner = feind.nextInt(2);
        System.out.println(">>>>>>>>>>>>>>Du hast " + gegner + " Gegner<<<<<<<<<<<<<<\n");
        boolean sieg = kampf.nextBoolean();
        if (gegner == 0) {
            System.out.println("Yeah!!! Gewonnen!");
            dieb.setErfahrungsPunkte(dieb.getErfahrungsPunkte() + dieb.getErfahrungsPunkte() + (gegner * 2));
        } else if (sieg) {
            System.out.println("Yeah!!! Gewonnen!");
            dieb.setErfahrungsPunkte(dieb.getErfahrungsPunkte() + dieb.getErfahrungsPunkte() + (gegner * 2));
            dieb.willStehlen(); // Methode aus Klasse Dieb wird auf das Objekt dieb aufgerufen
            System.out.println(">>> Dieb: Ich habe " + dieb.diebesgutKammer.get(dieb.diebesgutKammer.size() - 1) + " gestohlen, hrhrhr <<<\n"); // Ausgabe des letzten Eintrags der Arraylist
        } else {
            System.out.println("Schade, Verloren!");
            dieb.willStehlen();
            System.out.println(">>> Dieb: Ich habe " + dieb.diebesgutKammer.get(dieb.diebesgutKammer.size() - 1) + " gestohlen, hrhrhr <<<\n");
        }

        System.out.println("\nNeuer Status:");
        System.out.println(dieb.toString());
    }

    public void nimmDiebin() {
        System.out.println(diebin.toString());
        Random feind = new Random();
        int gegner = feind.nextInt(2);
        System.out.println(">>>>>>>>>>>>>>Du hast " + gegner + " Gegner<<<<<<<<<<<<<<\n");
        boolean sieg = kampf.nextBoolean();
        if (gegner == 0) {
            System.out.println("Yeah!!! Gewonnen!");
            diebin.setErfahrungsPunkte(diebin.getErfahrungsPunkte() + diebin.getErfahrungsPunkte() + (gegner * 2));
        } else if (sieg) {
            System.out.println("Yeah!!! Gewonnen!");
            diebin.setErfahrungsPunkte(diebin.getErfahrungsPunkte() + diebin.getErfahrungsPunkte() + (gegner * 2));
            diebin.willStehlen2();
            System.out.println(">>> Diebin: Ich habe " + diebin.diebesgutKammer2.get(diebin.diebesgutKammer2.size() - 1) + " gestohlen, hihihi <<<\n");
        } else {
            System.out.println("Schade, Verloren!");
            diebin.willStehlen2();
            System.out.println(">>> Diebin: Ich habe " + diebin.diebesgutKammer2.get(diebin.diebesgutKammer2.size() - 1) + " gestohlen, hihihi <<<\n");
        }

        System.out.println("\nNeuer Status:");
        System.out.println(diebin.toString());
    }

    public void nimmKrieger() {
        System.out.println(krieger.toString());
        Random feind = new Random();
        int gegner = feind.nextInt(2);
        System.out.println(">>>>>>>>>>>>>>Du hast " + gegner + " Gegner<<<<<<<<<<<<<<\n");
        boolean sieg = kampf.nextBoolean();
        if (gegner == 0) {
            System.out.println("Yeah!!! Gewonnen!");
            krieger.setErfahrungsPunkte(krieger.getErfahrungsPunkte() + krieger.getErfahrungsPunkte() + (gegner * 2));
        } else if (sieg) {
            System.out.println("Yeah!!! Gewonnen!");
            krieger.setErfahrungsPunkte(krieger.getErfahrungsPunkte() + krieger.getErfahrungsPunkte() + (gegner * 2));
        } else {
            System.out.println("Schade, Verloren!");
        }
        System.out.println("\nNeuer Status:");
        System.out.println(krieger.toString());
    }

    public void nimmKriegerin() {
        System.out.println(kriegerin.toString());
        Random feind = new Random();
        int gegner = feind.nextInt(2);
        System.out.println(">>>>>>>>>>>>>>Du hast " + gegner + " Gegner<<<<<<<<<<<<<<\n");
        boolean sieg = kampf.nextBoolean();
        if (gegner == 0) {
            System.out.println("Yeah!!! Gewonnen!");
            kriegerin.setErfahrungsPunkte(kriegerin.getErfahrungsPunkte() + kriegerin.getErfahrungsPunkte() + (gegner * 2));
        } else if (sieg) {
            System.out.println("Yeah!!! Gewonnen!");
            kriegerin.setErfahrungsPunkte(kriegerin.getErfahrungsPunkte() + kriegerin.getErfahrungsPunkte() + (gegner * 2));
        } else {
            System.out.println("Schade, Verloren!");
        }
        System.out.println("\nNeuer Status:");
        System.out.println(kriegerin.toString());
    }

    public void nimmMagier() {
        System.out.println(magier.toString());
        Random feind = new Random();
        int gegner = feind.nextInt(2);
        System.out.println(">>>>>>>>>>>>>>Du hast " + gegner + " Gegner<<<<<<<<<<<<<<\n");

        boolean sieg = kampf.nextBoolean();
        if (gegner == 0) {
            System.out.println("Yeah!!! Gewonnen!");
            magier.setErfahrungsPunkte(magier.getErfahrungsPunkte() + magier.getErfahrungsPunkte() + (gegner * 2));
        } else if (sieg) {
            String zauber = magier.zauberSpruchAufsagen();
            System.out.println(zauber);
            System.out.println("Yeah!!! Gewonnen!");
            magier.setErfahrungsPunkte(magier.getErfahrungsPunkte() + magier.getErfahrungsPunkte() + (gegner * 2));
        } else {
            String zauber = magier.zauberSpruchAufsagen();
            System.out.println(zauber);
            System.out.println("Schade, Verloren!");
        }
        System.out.println("\nNeuer Status:");
        System.out.println(magier.toString());
    }

    public void nimmMonster() {
        System.out.println(monster.toString());
        Random feind = new Random();
        int gegner = feind.nextInt(2);
        System.out.println(">>>>>>>>>>>>>>Du hast " + gegner + " Gegner<<<<<<<<<<<<<<\n");
        boolean sieg = kampf.nextBoolean();
        if (gegner == 0) {
            System.out.println("Yeah!!! Gewonnen!");
            monster.setErfahrungsPunkte(monster.getErfahrungsPunkte() + monster.getErfahrungsPunkte() + (gegner * 2));
        } else if (sieg) {
            System.out.println("Yeah!!! Gewonnen!");
            monster.setErfahrungsPunkte(monster.getErfahrungsPunkte() + monster.getErfahrungsPunkte() + (gegner * 2));
        } else {
            System.out.println("Schade, Verloren!");
        }
        System.out.println("\nNeuer Status:");
        System.out.println(monster.toString());
    }


}

