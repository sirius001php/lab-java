package main.java.technology_lab2;;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TruckTest {
    private Truck truck;

    @Mock
    private Location loc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(loc.getFullLocation()).thenReturn("raz");
        when(loc.getNameFactory()).thenReturn("Dwa");
        truck = new Truck("Transporter", "PlEF234FE00M6744", BodyType.Pickup, 2010, 1904, 5292, 2050, loc);
    }

    @Test
    public void changeCreationYear_ChangeCreationYearOfAnPassenger_Model(){
        truck.setModel("Transporter");
        assertEquals(truck.getModel(), "Transporter");
        verify(loc, times(2)).getFullLocation();
        verify(loc, times(2)).getNameFactory();
    }


    @Test
    public void equals_checkEquality_True() {
        Truck temp = new Truck("Transporter", "PlEF234FE00M6744", BodyType.Pickup, 2010, 1904, 5292, 2050, loc);
        assertEquals(truck, temp);
    }
}