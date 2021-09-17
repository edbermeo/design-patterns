package com.bootcamp.design.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class BankExpense implements Observer {

    private String type;
    private Double totalCalculated;
    private final Double rateCoefficient;

    public BankExpense(String type, Double rateCoefficient) {
        this.type = type;
        this.rateCoefficient = rateCoefficient;
    }

    @Override
    public void update(Observable o, Object value) {
        this.totalCalculated = ((Double) value) * rateCoefficient;
    }

    public Double getTotalCalculated() {
        return totalCalculated;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankExpense{");
        sb.append("type='").append(type).append('\'');
        sb.append(", totalCalculated=").append(totalCalculated);
        sb.append(", rateCoefficient=").append(rateCoefficient);
        sb.append('}');
        return sb.toString();
    }
}