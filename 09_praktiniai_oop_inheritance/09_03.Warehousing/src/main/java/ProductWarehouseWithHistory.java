public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory warehouseHistory = new ChangeHistory();


    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        warehouseHistory.add(initialBalance);
    }

    public String history() {
        return warehouseHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        warehouseHistory.add(getBalance() + amount);
        super.addToWarehouse(amount);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double balance = getBalance();
        if (balance < amount) {
            warehouseHistory.add(balance);
            return balance;
        }
        double taken = super.takeFromWarehouse(amount);
        warehouseHistory.add(balance - amount);
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + warehouseHistory.maxValue());
        System.out.println("Smallest amount of product: " + warehouseHistory.minValue());
        System.out.println("Average: " + warehouseHistory.average());
    }
}
