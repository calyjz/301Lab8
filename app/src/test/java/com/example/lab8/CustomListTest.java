package com.example.lab8;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        list.addCity(new City("Vancouver", "BC"));
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Montreal", "QC"));

        assertTrue(list.hasCity(new City("Vancouver", "BC")));
        assertFalse(list.hasCity(new City("Victoria", "BC")));
    }


    void testRemoveCity(){
        list = MockCityList();
        City city1 = new City("Charlottetown", "Prince Edward Island");
        list.add(city1);

        City city2 = new City("Vancouver", "British Columbia");
        list.add(city2);

        assertDoesNotThrow(()->{
            list.removeCity(city1);
        });

        assertThrows(Exception.class, ()->{
            list.removeCity(new City("Edmonton", "Alberta"));
        });


    }

}
