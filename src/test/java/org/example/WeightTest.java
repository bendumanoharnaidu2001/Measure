package org.example;

import org.example.Units.WeightUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeightTest {
    @Test
    public void compareTwoWeightsInSameUnits() {
        Weight weight1 = new Weight(100, WeightUnit.G);
        Weight weight2 = new Weight(100, WeightUnit.G);

        assertEquals(weight1, weight2);
    }
    @Test
    public void addTwoWeights() {
        Weight weight1 = new Weight(100, WeightUnit.G);
        Weight weight2 = new Weight(1, WeightUnit.KG);

        assertEquals(new Weight(1100, WeightUnit.G), weight1.add(weight2));
    }
    @Test
    public void substractTwoWeights() {
        Weight weight1 = new Weight(1, WeightUnit.KG);
        Weight weight2 = new Weight(100, WeightUnit.G);

        assertEquals(new Weight(900, WeightUnit.G), weight1.subtract(weight2));
    }
    @Test
    public void compareTwoWeightsInDifferentUnits() {
        Weight weight1 = new Weight(100, WeightUnit.G);
        Weight weight2 = new Weight(1, WeightUnit.KG);

        assertEquals(-1, weight1.compareTo(weight2));
    }
    @Test
    public void compareTwoWeightsInDifferentUnits1() {
        Weight weight1 = new Weight(1000, WeightUnit.KG);
        Weight weight2 = new Weight(1, WeightUnit.KG);

        assertEquals(1, weight1.compareTo(weight2));
    }
    @Test
    public void compareTwoWeightsInDifferentUnits2() {
        Weight weight1 = new Weight(1, WeightUnit.KG);
        Weight weight2 = new Weight(1000, WeightUnit.G);

        assertEquals(0, weight1.compareTo(weight2));
    }
}