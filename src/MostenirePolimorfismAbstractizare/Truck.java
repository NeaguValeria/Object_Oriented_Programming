package MostenirePolimorfismAbstractizare;

public class Truck extends Vehicle {


    @Override
    public void printStates() {
        System.out.println("Truck - speed: " + this.getSpeed() + " gear: "+ this.getGear());
    }
}
