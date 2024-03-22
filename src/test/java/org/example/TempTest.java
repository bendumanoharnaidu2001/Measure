package org.example;

import org.example.Units.TempUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class TempTest {
    @Test
    public void compareTwoTempsInSameUnits() {
        Temp temp1 = new Temp(100, TempUnit.C);
        Temp temp2 = new Temp(100, TempUnit.C);

        assertEquals(temp1, temp2);

    }
//    @Test
//    public void compareTwoTempsInDifferentUnits() {
//        Temp temp1 = new Temp(100, TempUnit.C);
//        Temp temp2 = new Temp(212, TempUnit.F);
//
//        assertEquals(0, temp1.compareTo(temp2));
//    }

}