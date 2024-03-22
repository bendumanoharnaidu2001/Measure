package org.example;

import org.example.Units.WeightUnit;

public class Weight extends MeasureAddAndSubtract<WeightUnit> {
    public Weight(double value, WeightUnit unit) {
        super(value, unit);
    }
}
