package Streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class TradeTest {
    public static void main(String[] args) {

        List<Trade> tradeList = new ArrayList<>();
        tradeList.add(new Trade("MS", 30, new BigDecimal("25.0")));
        tradeList.add(new Trade("IBM", 25, new BigDecimal("100.2")));
        tradeList.add(new Trade("GOOGLE", 45, new BigDecimal("90.0")));
        tradeList.add(new Trade("BP", 63, new BigDecimal("61")));


//        Using
//        List<String> symbols = new ArrayList<>();
//        for (Trade trade : tradeList) {
//            symbols.add(trade.getSymbol());
//        }
//        System.out.println(symbols);

        // using functional java
//        List<String> newSymbols = tradeList.stream().map(t -> t.getSymbol()).collect(Collectors.toList());
//        System.out.println("symbols:: " + newSymbols);


//        converting to maps
        Map<String, Integer> map = tradeList.stream()
                .collect(Collectors.toMap(p -> p.getSymbol(), p -> p.getQuantity(), (qty1, qty2) -> qty1 + qty2));
        System.out.println(map);


//Foreach
//        System.out.println(tradeList.get(0).getQuantity());
//        tradeList.forEach(t -> t.setQuantity(t.getQuantity() + 1));
//        System.out.println(tradeList.get(0).getQuantity());

//        Filter

//        List<Trade> highVolume = tradeList
//                .stream()
//                .filter(t -> t.getQuantity() < 45)
//                .collect(Collectors.toList());
//
//        System.out.println(highVolume);

//Method References
//        System.out.println(tradeList.stream().map(t -> t.getSymbol()));
//        System.out.println(tradeList.stream().map(Trade::getSymbol));
//        tradeList.stream().map(t -> t.getSymbol()).forEach(s -> System.out.println(s));
//        tradeList.stream().map(Trade::getSymbol).forEach(System.out::println);

//        pipelining
//        tradeList.stream().filter(t -> t.getQuantity() > 25).map(t -> t.getSymbol()).collect(Collectors.toList()).forEach(System.out::println);

//        flatMap
//        List<List<Trade>> listOfTrades = Arrays.asList(tradeList, tradeList);
//        listOfTrades.stream().flatMap(t -> t.stream()).collect(Collectors.toList()).forEach(System.out::println);

//        count
//        List<List<Trade>> listOfTradesToCount = Arrays.asList(tradeList, tradeList);
//        System.out.println(listOfTradesToCount.stream().flatMap(t -> t.stream()).count());

//        .distinct()
//        List<List<Trade>> listOfTradesToDistinct = Arrays.asList(tradeList, tradeList);
//        System.out.println(listOfTradesToDistinct.stream().flatMap(t -> t.stream()).distinct().count());


//        Sorting a Stream
//        List<Trade> sortedTrades = tradeList.stream()
//                .sorted(comparing(Trade::getQuantity))
//                .collect(Collectors.toList());
//        System.out.println(sortedTrades);

//        Also easy to sort without a stream
//        tradeList.sort(comparing(Trade::getQuantity));
//        System.out.println(tradeList);


//Map reduce
//        int totalQty = tradeList.stream().map(Trade::getQuantity).reduce(0, (a, b) -> a + b);
//        System.out.println(totalQty);


//Not Just Collections
//        Stream.of("a1", "a2", "a3").findFirst().ifPresent(System.out::println);
//
//        IntStream.range(1, 4).forEach(System.out::println);

//        IntStream.generate(() -> (int) (Math.random() * 1000)).limit(3).forEach(System.out::println);

//        int parallelStreams = tradeList.parallelStream()



    }
}
