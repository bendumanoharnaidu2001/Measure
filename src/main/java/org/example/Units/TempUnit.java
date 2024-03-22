package org.example.Units;

public enum TempUnit implements Units {
    //convert to celsius
    C(1),
    F(5.0/9.0),
    K(1);

    //C = (F - 32) * 5/9
    //F = C * 9/5 + 32
    private double value;
    private TempUnit(double value){
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
