public class Hangar {
    public static void main(String[] args) {

        Car clio = new Car("Clio", 34000);
        Boat ventura = new Boat("Ventura", 20000);

        System.out.println(ventura.doStuff());
        System.out.println(clio.doStuff());
    }
}