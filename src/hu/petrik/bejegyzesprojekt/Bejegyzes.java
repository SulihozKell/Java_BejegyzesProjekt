package hu.petrik.bejegyzesprojekt;

import java.time.LocalDateTime;

public class Bejegyzes {
    String szerzo;
    String tartalom;
    int likeok;
    LocalDateTime letrejott;
    LocalDateTime szerkesztve;

    Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        likeok = 0;
        letrejott = LocalDateTime.now();
        szerkesztve = LocalDateTime.now();
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

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like() {
        this.likeok++;
    }

    @Override
    public String toString() {
        if (this.letrejott != this.szerkesztve) {
            return this.szerzo + "-" + this.likeok + "-" + this.letrejott +
                    "\nSzerkesztve: " + this.szerkesztve + "\n" + this.tartalom;
        }
        else {
            return this.szerzo + "-" + this.likeok + "-" + this.letrejott +
                    "\n" + this.tartalom;
        }
    }
}
