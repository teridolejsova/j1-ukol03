package cz.czechitas.ukol3.model;

public class Disk {

    //v bajtech ???!!
    long kapacita;
    long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "kapacita=" + kapacita +
                ", vyuziteMisto=" + vyuziteMisto +
                '}';
    }
}
