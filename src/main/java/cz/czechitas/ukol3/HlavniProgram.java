package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac pocitac = new Pocitac();

        Disk disk = new Disk();
        disk.setKapacita(239_379_410_944L);
        pocitac.setPevnydisk(disk);
        //pro lepsi kontrolu nastavena 0. Realné využité místo je 187229093888 b.
        disk.setVyuziteMisto(0);


        Pamet pamet = new Pamet();
        pamet.setKapacita(8_000_000_000L);
        pocitac.setRam(pamet);

        Procesor procesor = new Procesor();
        procesor.setVyrobce("Intel");
        pocitac.setCpu(procesor);

        /*System.out.println(pocitac.toString());


        System.out.println("Krok 1");
        pocitac.jeZapnuty();
        System.out.println("Krok 2");
        pocitac.zapniSe();
        System.out.println("Krok 3");
        pocitac.zapniSe();
        System.out.println("Krok 4");
        pocitac.vypniSe();
        System.out.println("Krok 5");
        pocitac.vypniSe();*/

        pocitac.zapniSe();
        pocitac.vytvorSouborOVelikosti(100_000_000);
        System.out.println(disk.getVyuziteMisto());
        pocitac.vytvorSouborOVelikosti(300_000_000_000L);
        pocitac.vymazSouboryOVelikosti(200_000_000_000L);
        System.out.println(disk.getVyuziteMisto());


    }

}
