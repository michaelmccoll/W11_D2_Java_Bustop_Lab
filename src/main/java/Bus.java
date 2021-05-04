import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination,Integer capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengers.size() < this.capacity){
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUp(BusStop busstop) {
        Person person = busstop.removePerson();
        this.addPassenger(person);
    }
}
