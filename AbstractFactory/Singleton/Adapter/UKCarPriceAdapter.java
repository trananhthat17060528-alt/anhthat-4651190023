package Adapter;

public class UKCarPriceAdapter implements PriceCalculator{
    private UKCarPriceCalculator ukCalculator;
    public UKCarPriceAdapter(double basePrice){
        ukCalculator = new UKCarPriceCalculator(basePrice);
    }
    @Override
    public double calculatorPrice() {
        return ukCalculator.getPrice();
    }
}
