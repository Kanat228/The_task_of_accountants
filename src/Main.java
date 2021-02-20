public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType taxType = new TaxType();
        Bill[] payments = new Bill[]{
                //TODO создать платежи с различными типами налогооблажения
                new Bill(250000, new IncomeTaxType(), taxService),
                new Bill(200000, new VATaxType(), taxService),
                new Bill(150000, new ProgressiveTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}