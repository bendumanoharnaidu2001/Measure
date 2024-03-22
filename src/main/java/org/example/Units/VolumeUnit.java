package org.example.Units;

public enum VolumeUnit implements Units{
    //convert to ml
    ml(1),
    l(1000),
    cl(10);

    private double value;
    private VolumeUnit(double value){
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
