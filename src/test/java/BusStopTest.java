import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busstop;
    private Person person;

    @Before
    public void setUp(){
        busstop = new BusStop("Morningside");
        person = new Person();
    }

    @Test
    public void canAddPersonToQueue(){
        busstop.addPerson(person);
        assertEquals(1,busstop.getBusStopPassengers());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busstop.addPerson(person);
        busstop.removePerson();
        assertEquals(0,busstop.getBusStopPassengers());
    }
}
