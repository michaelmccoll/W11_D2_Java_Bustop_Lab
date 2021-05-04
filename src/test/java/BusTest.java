import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busstop;

    @Before
    public void setUp(){
        bus = new Bus("edinburgh",1);
        busstop = new BusStop("Morningside");
        person = new Person();
        busstop.addPerson(person);
    }

    @Test
    public void canGetPassengers(){
        assertEquals(0,bus.getPassengers());
    }

    @Test
    public void addPassenger(){
        bus.addPassenger(person);
        assertEquals(1,bus.getPassengers());
        bus.addPassenger(person);
        assertEquals(1,bus.getPassengers());
    }

    @Test
    public void removePassenger(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0,bus.getPassengers());
    }

    @Test
    public void canPickUp(){
        bus.pickUp(busstop);
        assertEquals(1,bus.getPassengers());
    }
}
