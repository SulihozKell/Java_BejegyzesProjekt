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

        for (Bejegyzes elem : bejegyzesek) {
            System.out.println(elem);
        }
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
}
