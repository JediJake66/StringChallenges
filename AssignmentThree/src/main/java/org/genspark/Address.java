package org.genspark;

import org.springframework.stereotype.Component;

@Component
public class Address
{
    public String city="Newark";
    public String state="OH";
    public String country="USA";
    public String zipcode="43055";

    @Override
    public String toString() {
        return '\n'+"Address-->" + '\n' +
                "City: " + city + '\n' +
                "State: " + state + '\n' +
                "Country: " + country + '\n' +
                "Zipcode: " + zipcode + '\n';
    }
}