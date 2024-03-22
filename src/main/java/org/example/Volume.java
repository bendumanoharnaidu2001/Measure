package org.example;

import org.example.Units.VolumeUnit;

public class Volume extends MeasureAddAndSubtract<VolumeUnit> {
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }
}
