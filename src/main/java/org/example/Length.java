package org.example;

import org.example.Units.LengthUnit;

public class Length extends MeasureAddAndSubtract<LengthUnit>{
    public Length(double value, LengthUnit unit) {
        super(value, unit);
    }
}
