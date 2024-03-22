package org.example;
import org.example.Units.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeTest {
    @Test
    public void compareTwoVolumesInSameUnits() {
        Volume volume1 = new Volume(100, VolumeUnit.cl);
        Volume volume2 = new Volume(100, VolumeUnit.cl);

        assertEquals(volume1, volume2);
    }
    @Test
    public void compareTwoVolumesInDifferentUnits() {
        Volume volume1 = new Volume(100, VolumeUnit.cl);
        Volume volume2 = new Volume(1, VolumeUnit.l);

        assertEquals(volume1, volume2);
    }
    @Test
    public void compareTwoVolumesInDifferentUnits2() {
        Volume volume1 = new Volume(100, VolumeUnit.cl);
        Volume volume2 = new Volume(1000, VolumeUnit.ml);

        assertEquals(0, volume1.compareTo(volume2));
    }
    @Test
    public void compareTwoDifferentVolumes() {
        Volume volume1 =new Volume(1, VolumeUnit.l);
        Volume volume2 = new Volume(100, VolumeUnit.ml);

        assertEquals(1, volume1.compareTo(volume2));
    }
    @Test
    public void addTwoVolumes() {
        Volume volume1 = new Volume(100, VolumeUnit.l);
        Volume volume2 = new Volume(1, VolumeUnit.l);

        assertEquals(new Volume(101, VolumeUnit.l), volume1.add(volume2));
    }
    @Test
    public void substractTwoVolumes() {
        Volume volume1 = new Volume(1, VolumeUnit.l);
        Volume volume2 = new Volume(100, VolumeUnit.ml);

        assertEquals(new Volume(0.9, VolumeUnit.l), volume1.subtract(volume2));
    }

}