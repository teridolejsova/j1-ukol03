package cz.czechitas.ukol3.model;

public class Pocitac {

    boolean jeZapnuty;
    Procesor cpu;
    Pamet ram;
    Disk pevnydisk;

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
        if(jeZapnuty()){
            System.err.println("Počítač už jede");
        } else{
            if(getCpu() == null || getPevnydisk()==null || getRam()==null){
                System.err.println("Počítači chybí součástky.");
                //todo jednotlive komponenty
                if(getRam()==null){
                    System.out.println("Chybí ram");
                }
            }else{
                jeZapnuty = true;
                System.out.println("Počítač se zapnul");
            }

        }
    }

    public void vypniSe() {
        if(jeZapnuty()){
            jeZapnuty = false;
            System.out.println("Počítač se vypnul");
        }
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
                '}';
    }

}

