package org.example.Units;

import org.example.Units.Units;

public enum LengthUnit implements Units {

    M(1),
    CM(0.01),
    MM(0.001),
    KM(1000);
    private double value;
    private LengthUnit(double value){
        this.value = value;
    }
    @Override
    public double convertTo(double value) {
        return value * this.value;
    }
    @Override
    public double convertFrom(double value) {
        return value / this.value;
    }
}
