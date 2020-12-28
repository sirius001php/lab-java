package main.java.technology_lab2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarIT {
    private Car car;
    protected Boody boody;

    @Before
    public void setUp() {
        car = new Car("Mers");
        for (int i=0; i < 5; i++) {
            car.addBody(boody);
        }
    }
    @Test
    public void getBodyCarAmount_checkArrayAmount_True() {
        assertEquals(car.getSize(), 5);
    }

    @Test
    public void addBody_addElementToArray_True() {
        car.addBody(boody);
        assertEquals(car.getSize(), 6);
    }


}