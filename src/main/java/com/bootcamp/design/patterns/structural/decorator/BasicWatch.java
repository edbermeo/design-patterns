package com.bootcamp.design.patterns.structural.decorator;

public class BasicWatch implements Watch {

    @Override
    public void createFunctionality() {
        System.out.println(" Basic Watch with: ");
        this.addTimer();
    }

    private void addTimer() {
        System.out.print(" Timer");
    }
}