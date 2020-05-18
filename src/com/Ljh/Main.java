package com.Ljh;

import com.Ljh.Person.Person;
import com.Ljh.Transport.Airship;
import com.Ljh.Transport.Automobile;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person tom = new Person("tom.201902208");

        Airship tomairship = new Airship("air1");
        Automobile tomautomobile = new Automobile("automoblile1");

        tom.drivingTransprot(tomairship);
        tom.drivingTransprot(tomautomobile);
    }
}
