import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws TradeIDException {
        Trade trade1 = new Trade("id1", "APPL", 200, 7.5);
        Trade trade2 = new Trade("id1", "APPL", 200);
//        trade2.setter(-1);
//        Trade.validate(trade1.getId(), trade2.getId());

        System.out.println(trade1.toString());
        System.out.println(trade2.toString());

        List<Trade> trades = new ArrayList<Trade>();
        trades.add(new Trade("T1", "sasa", 12, 32));
        trades.add(new Trade("T2", "sasa", 13, 2));
        trades.add(new Trade("T3", "sasa", 14, 44));
        trades.add(new Trade("T4", "sasa", 15, 7));

        Collections.sort(trades, new TradeSort());
        for (Trade trade : trades) {
            System.out.println(trade.getId());
        }
    }

    static class TradeSort implements Comparator<Trade> {

        @Override
        public int compare(Trade t1, Trade t2) {
            return (int) (t1.getPrice() - t2.getPrice());
        }
    }
}
