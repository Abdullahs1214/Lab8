package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    private City city;
    private City city1;
    public CustomList MockCityList(){
        return new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan","SK"));
        assertEquals(list.getCount(), listSize + 1);
    }
    @Test
    public void hasCityTest(){
        list = MockCityList();
        city1 = new City("Estevan","SK");
        list.addCity(city1);
        assertTrue(list.hasCity(city1));
        city = new City("Calgary", "AB");
        assertFalse(list.hasCity(city));
    }
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        city1 = new City("Estevan","SK");
        list.addCity(city1);
        city = new City("Calgary", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city1));
        assertTrue(list.hasCity(city));
        list.deleteCity(city1);
        assertFalse(list.hasCity(city1));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }
    @Test
    public void countCitiesTest(){
        list = MockCityList();
        assertEquals(list.countCities,0);
        city1 = new City("Estevan","SK");
        list.addCity(city1);
        assertEquals(list.countCities,1);
        city = new City("Calgary", "AB");
        list.addCity(city);
        assertEquals(list.countCities,2);
        list.deleteCity(city);
        assertEquals(list.countCities,1);
        list.deleteCity(city1);
        assertEquals(list.countCities,0);
    }
}
