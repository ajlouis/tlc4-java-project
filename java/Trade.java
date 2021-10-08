public class Trade {
    private String ID, symbol;
    private int quantity;
    private double price;

    public Trade(String ID, String symbol, int quantity, double price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void setter(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("value should be greater than 0");
        }
    }

    public String getId() {
        return this.ID;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public static void validate(String id1, String id2) throws TradeIDException {
        // throw an object of user defined exception
        if (id1 == id2) {
            throw new TradeIDException("Two Id's cannot be the same'");
        } else {
            System.out.println("Go on to trade");
        }
    }


    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
