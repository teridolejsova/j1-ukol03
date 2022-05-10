package cz.czechitas.ukol3.model;

public class Pocitac {

    boolean jeZapnuty;
    Procesor cpu;
    Pamet ram;
    Disk pevnydisk;
    Disk druhyDisk;

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty()) {
            if (vejdeSeNaDisk(pevnydisk,velikost)) {
                pevnydisk.setVyuziteMisto(pevnydisk.getVyuziteMisto() + velikost);
            } else {
                if (vejdeSeNaDisk(druhyDisk,velikost)) {
                    druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() + velikost);
                }else{
                    System.err.println("Není místo ani na jednom z disků.");
                }

            }
        }
    }

    private boolean vejdeSeNaDisk(Disk disk,Long velikost) {
        return disk.getVyuziteMisto() + velikost <= disk.getKapacita();
    }

    public void vymazSouboryOVelikosti(long velikost) {
        //Metoda vymazSouboryOVelikosti(long velikost) sníží proměnnou vyuziteMisto o velikost. vyuziteMisto nemůže klesnout pod 0.
        if (jeZapnuty()) {
            if (jesteJeCoMazat(pevnydisk,velikost)) {
                pevnydisk.setVyuziteMisto(pevnydisk.getVyuziteMisto() - velikost);
            } else {
                if (jesteJeCoMazat(druhyDisk,velikost)) {
                    druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() - velikost);
            }else{
                    System.err.println("Vše již bylo smazáno.");}
            }
        }
    }

    private boolean jesteJeCoMazat(Disk disk, long velikost) {
        return (pevnydisk.getVyuziteMisto() - velikost) >= 0;
    }

    public boolean jeZapnuty() {
        //mohu cele smazat a napsat jen
        // return jeZapnuty
        if (jeZapnuty) {
            System.out.println("Počítač je zapnutý.");
        } else {
            System.out.println("Počítač je vypnutý");
        }
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty()) {
            System.err.println("Počítač už jede");
        } else {
            if (getCpu() == null || getPevnydisk() == null || getRam() == null) {
                System.err.println("Počítači chybí součástky.");
                //todo jednotlive komponenty
                if (getRam() == null) {
                    System.out.println("Chybí ram");
                }
            } else {
                jeZapnuty = true;
                System.out.println("Počítač se zapnul");
            }
        }
    }

    public void vypniSe() {
        if (jeZapnuty()) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul");
        }
    }

    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnydisk() {
        return pevnydisk;
    }

    public void setPevnydisk(Disk pevnydisk) {
        this.pevnydisk = pevnydisk;
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnydisk=" + pevnydisk +
                ", druhyDisk=" + druhyDisk +
                '}';
    }
}

