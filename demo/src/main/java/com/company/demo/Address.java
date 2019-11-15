package com.company.demo;

import org.springframework.stereotype.Component;

/**
 *
 * @author w211198372
 */
@Component
public class Address {
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public void getCityCountry() {
        System.out.println("I am in " + city + " in the " + country + ".");
    }
}
