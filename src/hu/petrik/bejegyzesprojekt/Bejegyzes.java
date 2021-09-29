package hu.petrik.bejegyzesprojekt;

import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
        this.szerkesztve = LocalDateTime.now();
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
        if (this.letrejott.equals(this.szerkesztve)) {
            return this.szerzo + "-" + this.likeok + "-" + this.letrejott +
                    "\n" + this.tartalom;
        }
        else {
            return this.szerzo + "-" + this.likeok + "-" + this.letrejott +
                    "\nSzerkesztve: " + this.szerkesztve + "\n" + this.tartalom;
        }
    }
}
