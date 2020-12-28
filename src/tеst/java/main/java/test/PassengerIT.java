package main.java.technology_lab2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerIT {
    private Passenger passenger;
    protected Location loc;

    @Before
    public void setUp() {
        passenger = new Passenger("Golf", "ZFA22300005556777", BodyType.Hatchback, 2019, 1789, 4284, 5, "C", loc);
    }

    @Test
    public void equals_checkEquality_True() {
        Passenger temp = new Passenger("Golf", "ZFA22300005556777", BodyType.Hatchback, 2019, 1789, 4284, 5, "C", loc);
        assertEquals(passenger, temp);
    }

}