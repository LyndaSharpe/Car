public class CarInfo {
    // list all attributes
    private String name;
    private int age;
    private double price;

    // constructor method

    public CarInfo(String name, int age, double price){
        setName (name);
        setAge (age);
        setPrice (price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setModel(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price; }


    //create behavioural method, depreciatePrice
    public void depreciatePrice() {
    setAge(getAge() +1); //increasing the age by 1
    setPrice(getPrice() -500.00); //decreasing price by 500
    }
}
