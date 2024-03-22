package org.example;

import org.example.Units.TempUnit;

public class Temp extends Measurement<TempUnit>{
    public Temp(double value, TempUnit unit) {
        super(value, unit);
    }
}
