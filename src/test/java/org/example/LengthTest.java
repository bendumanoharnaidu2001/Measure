package org.example;

import org.example.Units.LengthUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {

    @Test
    public void compareTwoLengthsInSameUnits() {
        Length length1 = new Length(100, LengthUnit.CM);
        Length length2 = new Length(100, LengthUnit.CM);

        assertEquals(length1, length2);
    }
    @Test
    public void compareTwoLengthsInDifferentUnits() {
        Length length1 = new Length(100, LengthUnit.CM);
        Length length2 = new Length(1, LengthUnit.M);

        assertEquals(length1, length2);
    }
    @Test
    public void compareTwoLengthsInDifferentUnits2() {
        Length length1 = new Length(100, LengthUnit.CM);
        Length length2 = new Length(1000, LengthUnit.MM);

        assertEquals(length1, length2);
    }
    @Test
    public void compareTwoDifferentLengths() {
        Length length1 = new Length(100, LengthUnit.CM);
        Length length2 = new Length(1000, LengthUnit.MM);
        assertEquals(length1, length2);
    }
    @Test
    public void compareTwoNotEqualLengthsInDifferentUnits() {
        Length length1 = new Length(100, LengthUnit.CM);
        Length length2 = new Length(2, LengthUnit.M);

        assertNotEquals(length1, length2);
    }
    @Test
    public void compareTwoLengths() {
        Length length1 = new Length(100, LengthUnit.CM);
        Length length2 = new Length(10, LengthUnit.M);
        assertEquals(-1, length1.compareTo(length2));
    }
    @Test
    public void compareTwoLengths2() {
        Length length1 = new Length(4, LengthUnit.M);
        Length length2 = new Length(200, LengthUnit.CM);
        assertEquals(1, length1.compareTo(length2));
    }
    @Test
    public void addTwoLength() {
        Length length1 = new Length(100, LengthUnit.CM);
        Length length2 = new Length(1, LengthUnit.M);
        Length expected = new Length(200, LengthUnit.CM);
        assertEquals(expected, length1.add(length2));
    }
    @Test
    public void substracTwoLength() {
        Length length1 = new Length(100, LengthUnit.CM);
        Length length2 = new Length(1, LengthUnit.M);
        Length expected = new Length(0, LengthUnit.CM);
        assertEquals(expected, length1.subtract(length2));
    }

    //Testing using generics

    @Test
    public void compareTwoLengthsInSameUnitsUsingGenerics() {
        Measurement<LengthUnit> length1 = new Measurement<LengthUnit>(100, LengthUnit.CM);
        Measurement<LengthUnit> length2 = new Measurement<LengthUnit>(100, LengthUnit.CM);

        assertEquals(length1, length2);
    }


}