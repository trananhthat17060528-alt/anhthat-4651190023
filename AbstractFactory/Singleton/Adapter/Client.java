package Adapter;

public class Client {
    public static void main(String[] args) {
        PriceCalculator car = new CarPriceCalculator(10);
        PriceCalculator truck = new TruckPriceCalculator(10);
        PriceCalculator uk = new UKCarPriceAdapter(10);

        System.out.println("Car price: " + car.calculatorPrice() + " USD");
        System.out.println("Truck price: " + truck.calculatorPrice() + " USD");
        System.out.println("UK Car price: " + uk.calculatorPrice() + " USD");
    }
}
