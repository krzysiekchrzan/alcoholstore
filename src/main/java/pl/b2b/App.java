package pl.b2b;

import pl.b2b.alcohol.Alcohol;
import pl.b2b.alcohol.ConfigAlcohol;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Piwa
        Alcohol kasztelan = new Alcohol(6, 3.5, "Kasztelan");
        Alcohol perla = new Alcohol(20, 2.3, "perla");
        Alcohol lech = new Alcohol(40, 4.7, "Lech");

        List<Alcohol> piwa = new ArrayList<>();
        piwa.add(kasztelan);
        piwa.add(perla);
        piwa.add(lech);


        //Wina
        Alcohol malbec = new Alcohol(4, 25, "Malbec");
        Alcohol franc = new Alcohol(12, 32.9, "Franc");
        Alcohol primitivo = new Alcohol(21, 19.9, "Primitivo");
        Alcohol viognier = new Alcohol(6, 78, "Viognier");
        Alcohol chardonnay = new Alcohol(19, 43.7, "Chardonnay");

        List<Alcohol> wina = new ArrayList<>();
        wina.add(malbec);
        wina.add(franc);
        wina.add(primitivo);
        wina.add(viognier);
        wina.add(chardonnay);


        //Wodki
        Alcohol zubrowka = new Alcohol(45, 31, "Zubrowka");
        Alcohol bols = new Alcohol(16, 38.8, "Bols");
        Alcohol bialyBocian = new Alcohol(12, 37.5, "Bialy Bocian");
        Alcohol finlandia = new Alcohol(62, 38, "Finlandia");
        Alcohol stock = new Alcohol(15, 40.7, "Stock");

        List<Alcohol> wodki = new ArrayList<>();
        wodki.add(zubrowka);
        wodki.add(bols);
        wodki.add(bialyBocian);
        wodki.add(finlandia);
        wodki.add(stock);

        ConfigAlcohol configAllcohol = new ConfigAlcohol();

        System.out.println(configAllcohol.expensiveAlcohol(piwa));
        //System.out.println(configAllcohol.expensiveAlcohol(wina));
        //System.out.println(configAllcohol.expensiveAlcohol(wodki));



        //configAlcohol.expensiveAlcohol(wodki);

        //System.out.println ( configAlcohol.averagePrice(piwa) );

    }
}
