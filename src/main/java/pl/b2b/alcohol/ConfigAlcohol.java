package pl.b2b.alcohol;

import java.util.ArrayList;
import java.util.List;

public class ConfigAlcohol {

    public String expensiveAlcohol(List<Alcohol> alcohols) {

        Alcohol result = alcohols.get(0);

        for   (Alcohol alcohol : alcohols ) {

            if  ( alcohol.getPrice()  > result.getPrice()  ) {
                result = alcohol;
            }

        }

        return nameAndPrice(result);
    }



    public String cheapAlcohol(List<Alcohol> alcohols) {

        Alcohol result = alcohols.get(0);
        for   (Alcohol alcohol : alcohols ) {
            if  ( alcohol.getPrice()  < result.getPrice()  ) {
                result = alcohol;
            }
        }
        return result.getName();
    }


    public double averagePrice(List<Alcohol> alcohols) {
        Alcohol result = alcohols.get(0);
        double suma = 0;

        for   (Alcohol alcohol : alcohols ) suma += alcohol.getPrice();

        double srednia = suma / alcohols.size();

        return srednia;
    }




    public List<String> namesOfAlcoholsWitchPriceIsHigherThanAverage(List<Alcohol> alcohols) {
        List<String> lista = new ArrayList<String>();
        double srednia =  averagePrice(alcohols);

        for   (Alcohol alcohol : alcohols ) {
            if (alcohol.getPrice() > srednia )  lista.add(alcohol.getName());
        }



        return lista;
    }

    public String nameAndPrice(Alcohol alcohol) {
        String name = alcohol.getName();
        double price = alcohol.getPrice();
        String suma = name + " " + price;
        return suma;
    }



    public List<String> nameAndPriceBelowAveragePrice(List<Alcohol> alcohols) {
        List<String> lista = new ArrayList<String>();
        double srednia =  averagePrice(alcohols);

        for   (Alcohol alcohol : alcohols )
            if (alcohol.getPrice() < srednia )  lista.add(nameAndPrice(alcohol));

        return lista;
    }

}
