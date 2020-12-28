package main.java.technology_lab2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TruckIT {
    private Truck truck;
    protected Location loc;

    @Before
    public void setUp() {
        truck = new Truck("Transporter", "PlEF234FE00M6744", BodyType.Pickup, 2010, 1904, 5292, 2050, loc);
    }

    @Test
    public void equals_checkEquality_True() {
        Truck temp = new Truck("Transporter", "PlEF234FE00M6744", BodyType.Pickup, 2010, 1904, 5292, 2050, loc);
        assertEquals(truck, temp);
    }
}