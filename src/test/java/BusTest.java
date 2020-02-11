import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    public BusTest() {
    }

    @Before
    public void before(){
        bus = new Bus("Crammond", 5);
        person = new Person();

    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1,bus.passengerCount());
    }

    @Test
    public void canCountPassengers(){
        bus.passengerCount();
        assertEquals(0,bus.passengerCount());
    }

    @Test
    public void passengerCannotGetOnBusIfBusFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());

    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }





}
