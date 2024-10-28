/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces;
    private int nSugarPackets;
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
    }

    
    public static void main(String[] args) {
        new Cafe("MyCafe", "123 Sesame", 4);
    }
    
}
