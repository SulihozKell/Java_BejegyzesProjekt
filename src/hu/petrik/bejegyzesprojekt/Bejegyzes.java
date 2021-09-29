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

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDate getLetrejott() {
        return letrejott;
    }

    public LocalDate getSzerkesztve() {
        return szerkesztve;
    }

    public void like() {
        this.likeok++;
    }
}
