public class ProgressiveTaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        double percent = amount >= 100000 ? 0.15 : 0.1;
        return percent * amount;
    }
}