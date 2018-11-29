package pl.b2b.cnf;

import pl.b2b.alcohol.Alcohol;

import java.util.ArrayList;
import java.util.List;

public class DataAlcohol {

    private List<Alcohol> piwa;
    private List<Alcohol> wina;
    private List<Alcohol> wodki;

    public DataAlcohol(){
        //Piwa
        Alcohol kasztelan = new Alcohol(6,3.5, "Kasztelan");
        Alcohol perla = new Alcohol(20,2.3, "Perla");
        Alcohol lech = new Alcohol(40,4.7, "Lech");
        Alcohol krolewskie = new Alcohol(46,5, "Krolewskie");
        Alcohol zywiec = new Alcohol(25,5.8, "Zywiec");
        Alcohol miloslaw = new Alcohol(25,9.35, "Miloslaw");
        Alcohol okocim = new Alcohol(8,3.6, "Okocim");

        piwa = new ArrayList<>();
        piwa.add(kasztelan);
        piwa.add(perla);
        piwa.add(lech);
        piwa.add(krolewskie);
        piwa.add(zywiec);
        piwa.add(miloslaw);
        piwa.add(okocim);


        //Wina
        Alcohol malbec = new Alcohol(4,25,"Malbec");
        Alcohol franc = new Alcohol(12, 32.9,"Franc");
        Alcohol primitivo = new Alcohol(21, 19.9,"Primitivo");
        Alcohol viognier = new Alcohol(6,78,"Viognier");
        Alcohol chardonnay = new Alcohol(19,43.7,"Chardonnay");
        Alcohol fresco = new Alcohol(40,48.7,"Fresco");
        Alcohol kadarka = new Alcohol(34,25.8,"Kadarka");
        Alcohol paparomano = new Alcohol(28,37.9,"Paparomano");
        Alcohol carlorossi = new Alcohol(13,67.1,"Carlorossi");

        wina = new ArrayList<>();
        wina.add(malbec);
        wina.add(franc);
        wina.add(primitivo);
        wina.add(viognier);
        wina.add(chardonnay);
        wina.add(fresco);
        wina.add(kadarka);
        wina.add(paparomano);
        wina.add(carlorossi);


        //Wodki
        Alcohol zubrowka = new Alcohol(45,31,"Zubrowka");
        Alcohol bols = new Alcohol(16, 38.8,"Bols");
        Alcohol bialyBocian = new Alcohol(12, 37.5,"Bialy Bocian");
        Alcohol finlandia = new Alcohol(62,38,"Finlandia");
        Alcohol stock = new Alcohol(15,40.7,"Stock");
        Alcohol tvwodka = new Alcohol(34,47.7,"Tvwodka");
        Alcohol zoladkowa = new Alcohol(12,20.9,"Zoladkowa");
        Alcohol lubelska = new Alcohol(67,55.4,"Lubelska");

        wodki = new ArrayList<>();
        wodki.add(zubrowka);
        wodki.add(bols);
        wodki.add(bialyBocian);
        wodki.add(finlandia);
        wodki.add(stock);
        wodki.add(tvwodka);
        wodki.add(zoladkowa);
        wodki.add(lubelska);
    }

    public List<Alcohol> getPiwa() {
        return piwa;
    }

    public List<Alcohol> getWina() {
        return wina;
    }

    public List<Alcohol> getWodki() {
        return wodki;
    }
}
