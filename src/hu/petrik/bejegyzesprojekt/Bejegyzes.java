package hu.petrik.bejegyzesprojekt;

import java.time.LocalDate;

public class Bejegyzes {
    String szerzo;
    String tartalom;
    int likeok;
    LocalDate letrejott;
    LocalDate szerkesztve;

    Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        likeok = 0;
        letrejott = LocalDate.now();
        szerkesztve = LocalDate.now();
    }




}
