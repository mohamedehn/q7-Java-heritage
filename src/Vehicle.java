public abstract class Vehicle{
    private String brand;
    private int kilometers;

    public Vehicle(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public String getBrand(){
        return this.brand;
    }

    public String setBrand(){
        return this.brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }

    public int setKilometers(){
        return this.kilometers;
    }

    public abstract String doStuff();
}