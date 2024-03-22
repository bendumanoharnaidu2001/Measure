package org.example;

import org.example.Units.Units;

public class MeasureAddAndSubtract<T extends Units> extends Measurement<T> {
    public MeasureAddAndSubtract(double value, T unit) {
        super(value, unit);
    }

    public Measurement<T> add(Measurement<T> other) {
        Measurement<T> otherMeasurement = other.convertToTargerUnit(this.unit);
        return new Measurement<T> (this.value + otherMeasurement.value, this.unit);
    }
    public Measurement<T> subtract(Measurement<T> other) {
        Measurement<T> otherMeasurement = other.convertToTargerUnit(this.unit);
        return new Measurement<T> (this.value - otherMeasurement.value, this.unit);
    }
}
