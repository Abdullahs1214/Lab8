package com.example.lab8;

import androidx.annotation.Nullable;

import java.util.Objects;

public class City {

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
/*
    public int compareTo(Object o){
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    @Override
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city1.getCityName(),city) && Objects.equals(city1.getProvinceName(), province);
    }
    @Override
    public int hashCode(){
        return Objects.hash(city,province);
    }
 */
}
