package pl.b2b.alcohol;

import org.junit.Before;
import org.junit.Test;
import pl.b2b.cnf.DataAlcohol;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConfigAllcoholTest {

    private List<Alcohol> piwa;
    private List<Alcohol> wina;
    private List<Alcohol> wodki;

    ConfigAlcohol configAllcohol;

    @Before
    public void setUp() {
        DataAlcohol dataAlcohol = new DataAlcohol();
        piwa = dataAlcohol.getPiwa();
        wina = dataAlcohol.getWina();
        wodki = dataAlcohol.getWodki();
        configAllcohol = new ConfigAlcohol();
    }

    @Test
    public void expensiveAlcohol() {
        assertEquals("Miloslaw", configAllcohol.expensiveAlcohol(piwa));
        assertEquals("Viognier", configAllcohol.expensiveAlcohol(wina));
        assertEquals("Lubelska", configAllcohol.expensiveAlcohol(wodki));
    }

    @Test
    public void cheapAlcohol() {
        assertEquals("Perla", configAllcohol.cheapAlcohol(piwa));
        assertEquals("Primitivo", configAllcohol.cheapAlcohol(wina));
        assertEquals("Zoladkowa", configAllcohol.cheapAlcohol(wodki));
    }

    @Test
    public void average() {
        assertEquals(4.8928, configAllcohol.averagePrice(piwa), 4);
        assertEquals(42.1111, configAllcohol.averagePrice(wina), 4);
        assertEquals(38.75, configAllcohol.averagePrice(wodki), 4);
    }

    @Test
    public void namesOfAlcoholsWitchPriceIsHigherThanAverage() {
        List<String> alcoholList = configAllcohol.namesOfAlcoholsWitchPriceIsHigherThanAverage(piwa);
        assertEquals(true, alcoholList.contains("Krolewskie"));
        assertEquals(true, alcoholList.contains("Zywiec"));
        assertEquals(true, alcoholList.contains("Miloslaw"));
        alcoholList = configAllcohol.namesOfAlcoholsWitchPriceIsHigherThanAverage(wina);
        assertEquals(true, alcoholList.contains("Viognier"));
        assertEquals(true, alcoholList.contains("Fresco"));
        assertEquals(true, alcoholList.contains("Carlorossi"));
        alcoholList = configAllcohol.namesOfAlcoholsWitchPriceIsHigherThanAverage(wodki);
        assertEquals(true, alcoholList.contains("Bols"));
        assertEquals(true, alcoholList.contains("Stock"));
        assertEquals(true, alcoholList.contains("Lubelska"));

    }

    @Test
    public void nameAndPrice() {
        assertEquals("Kasztelan 3.5", configAllcohol.nameAndPrice(piwa.get(0)));
        assertEquals("Malbec 25.0", configAllcohol.nameAndPrice(wina.get(0)));
        assertEquals("Zubrowka 31.0", configAllcohol.nameAndPrice(wodki.get(0)));
    }

    @Test
    public void nameAndPriceBelowAveragePrice() {
        List<String> resultList = configAllcohol.nameAndPriceBelowAveragePrice(piwa);
        assertEquals(true, resultList.contains("Kasztelan 3.5"));
        assertEquals(true, resultList.contains("Perla 2.3"));
        assertEquals(true, resultList.contains("Lech 4.7"));
        resultList = configAllcohol.nameAndPriceBelowAveragePrice(wina);
        assertEquals(true, resultList.contains("Franc 32.9"));
        assertEquals(true, resultList.contains("Primitivo 19.9"));
        assertEquals(true, resultList.contains("Kadarka 25.8"));
    }
}