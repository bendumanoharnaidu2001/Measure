package org.example.Units;

public enum WeightUnit implements Units{
    //convert to G
    G(1),
    KG(1000),
    MG(0.001);

    private double value;
    private WeightUnit(double value){
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
