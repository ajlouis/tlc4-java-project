package Streams;

import java.math.BigDecimal;

public class Trade {
    private final String symbol;
    private int quantity;
    private final BigDecimal price;

    public Trade(String symbol, int quantity, BigDecimal price) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int t) {
        this.quantity = t;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public BigDecimal getPrice() {
        return price;
    }
}
