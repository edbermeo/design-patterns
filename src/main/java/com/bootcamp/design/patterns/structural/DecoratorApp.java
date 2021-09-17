package com.bootcamp.design.patterns.structural;

import com.bootcamp.design.patterns.structural.decorator.BasicWatch;
import com.bootcamp.design.patterns.structural.decorator.LuxuryWatchDecorator;
import com.bootcamp.design.patterns.structural.decorator.SportWatchDecorator;
import com.bootcamp.design.patterns.structural.decorator.Watch;

public class DecoratorApp {

    public static void main(String... args) {

        Watch basicWatch = new BasicWatch();
        basicWatch.createFunctionality();
        System.out.println("\n---------");

        Watch sportsWatch = new SportWatchDecorator(new BasicWatch());
        sportsWatch.createFunctionality();
        System.out.println("\n---------");

        Watch sportsLuxuryWatch = new LuxuryWatchDecorator(new SportWatchDecorator(new BasicWatch()));
        sportsLuxuryWatch.createFunctionality();
    }
}