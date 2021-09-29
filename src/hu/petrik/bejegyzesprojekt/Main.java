package hu.petrik.bejegyzesprojekt;

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



    }
}
