public class CarData {
    public static void main(String[] args) {
        System.out.println("=== CAR INC. INVENTORY ===");
        CarInfo carInfo00 = new CarInfo(  "Ford EcoSport", 3, 19500.25);
        CarInfo carInfo01 = new CarInfo("Fiat 500", 7, 9750.45);
        System.out.println("Name = " + carInfo00.getName());
        System.out.println("Age = " + carInfo00.getAge());
        System.out.println("Price = £" + carInfo00.getPrice() + "\n");

        //call the growOlder method to make person00 older
        carInfo00.depreciatePrice();
        System.out.println("A year later with average mileage .....");
        System.out.println("Name = " + carInfo00.getName());
        System.out.println("Age = " + carInfo00.getAge());
        System.out.println("Price with average mileage = £" + carInfo00.getPrice() + "\n");

        System.out.println("Name = " + carInfo01.getName());
        System.out.println("Age = " + carInfo01.getAge());
        System.out.println("Price = £" + carInfo01.getPrice() + "\n");

        //call the growOlder method to make person01 older
        carInfo01.depreciatePrice();
        System.out.println("A year later with average mileage .....");
        System.out.println("Name = " + carInfo01.getName());
        System.out.println("Age = " + carInfo01.getAge());
        System.out.println("Price with average mileage = £" + carInfo01.getPrice() + "\n");



        // CREATE Car 1 AND car 2 OBJECTS AND PRINT THEM
    }
}
