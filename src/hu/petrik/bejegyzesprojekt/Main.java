package hu.petrik.bejegyzesprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Bejegyzes> bejegyzesek = new ArrayList<>();
        bejegyzesek.add(new Bejegyzes("Valaki Neve", "Remek Tartalom"));
        bejegyzesek.add(new Bejegyzes("Teszt Elek", "Tesztelés"));

        System.out.println("Hány elemet adjak hozzá a listához? ");
        int db = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < db; i++) {
            bejegyzesek.add(new Bejegyzes("Szerző", "Tartalom"));
        }

        fajlBeolvasas("bejegyzesek.txt", bejegyzesek);

        int likeDbOszt = bejegyzesek.size() * 20;

        for (int i = 0; i < likeDbOszt; i++) {
            double veletlen = Math.random() * bejegyzesek.size();
            bejegyzesek.get((int)veletlen).like();
        }

        String bejegyzesSzovegModositasa = bejegyzesek.get(1).getTartalom();
        System.out.println(bejegyzesSzovegModositasa);
        System.out.println("A második bejegyzés módosítása: ");
        String modositas = sc.nextLine();
        bejegyzesek.get(1).setTartalom(modositas);

        System.out.println(bejegyzesek.get(1));

        for (Bejegyzes elem : bejegyzesek) {
            System.out.println(elem);
            System.out.println();
        }

        legnepszerubbBejegyzes(bejegyzesek);

        if (tobbBejegyesMint35(bejegyzesek)) {
            System.out.println("Van olyan bejegyzés aminek több mint 35 likeja van.");
        }
        else {
            System.out.println("Nincs olyan bejegyzés aminek több mint 35 likeja lenne.");
        }

        System.out.println("Összesen " + hanyBejegyzesKevesebbMint15Like(bejegyzesek) + " db bejegyzésnek van" +
                "kevesebb mint 15 likeje.");

        //likeokSzerintCsokkenoen(bejegyzesek);
    }

    public static void fajlBeolvasas(String fajlNev, ArrayList<Bejegyzes> bejegyzesek) {
        try {
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor != null) {
                String[] adatok = sor.split(";");
                Bejegyzes bejegyzes = new Bejegyzes(adatok[0], adatok[1]);
                bejegyzesek.add(bejegyzes);
                sor = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void legnepszerubbBejegyzes(ArrayList<Bejegyzes> bejegyzesek) {
        int legnagyobb = bejegyzesek.get(0).getLikeok();

        for (Bejegyzes elem : bejegyzesek) {
            if (elem.getLikeok() > legnagyobb) {
                legnagyobb = elem.getLikeok();
            }
        }

        System.out.println("A legnépszerűbb bejegyzésnek " + legnagyobb + " likeja van.");
    }

    public static boolean tobbBejegyesMint35(ArrayList<Bejegyzes> bejegyzesek) {
        for (Bejegyzes elem : bejegyzesek) {
            if (elem.getLikeok() >= 35) {
                return true;
            }
        }
        return false;
    }

    public static int hanyBejegyzesKevesebbMint15Like(ArrayList<Bejegyzes> bejegyzesek) {
        int db = 0;
        for (Bejegyzes elem : bejegyzesek) {
            if (elem.getLikeok() <= 15) {
                db++;
            }
        }
        return db;
    }
/*
    public static void likeokSzerintCsokkenoen(ArrayList<Bejegyzes> bejegyzesek) {
        ArrayList<Bejegyzes> rendezettBejegyzesek = new ArrayList<>();

        //int legnagyobb = bejegyzesek.get(0).getLikeok();

        for (Bejegyzes elem1 : bejegyzesek) {
            for (Bejegyzes elem2 : bejegyzesek) {

            }
        }

        for (Bejegyzes elem : rendezettBejegyzesek) {
            System.out.println(elem);
            System.out.println();
        }
    }
    */
}
