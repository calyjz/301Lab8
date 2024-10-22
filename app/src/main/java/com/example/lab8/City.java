package com.example.lab8;

public class City implements Comparable<City>{

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    /**
     * overrides the equals method, compares object attributes
     * @param o
     * Object to compare to
     * @return
     * boolean, true if all the attributes are equal and the objects are both City objects
     */
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        City city = (City) o;
        return city.getProvinceName().equals(this.province) && city.getCityName().equals(this.city);
    }
}
