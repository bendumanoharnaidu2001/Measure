package org.example;

import org.example.Units.Units;

public class Measurement<T extends Units> implements Comparable<Measurement<T>> {
    protected double value;
    protected T unit;
    public Measurement(double value, T unit) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be positive");
        }
        this.value = value;
        this.unit = unit;
    }
    public Measurement<T> convertToTargerUnit(T targetUnit) {
        double measurementInTargetUnit = targetUnit.convertFrom(unit.convertTo(value));
        return new Measurement<T>(measurementInTargetUnit, targetUnit);
    }
    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Measurement)) {
            return false;
        }
        Measurement<T> otherMeasurementInSameUnit = ((Measurement<T>) other).convertToTargerUnit(this.unit);
        return this.value == otherMeasurementInSameUnit.value && this.unit == otherMeasurementInSameUnit.unit;
    }
    @Override
    public int compareTo(Measurement<T> other ) {
        Measurement<T> otherMeasurementInSameUnit = other.convertToTargerUnit(this.unit);
        if (this.value > otherMeasurementInSameUnit.value) {
            return 1;
        }
        if (this.value < otherMeasurementInSameUnit.value) {
            return -1;
        }
        return 0;
    }

}
