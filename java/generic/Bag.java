package generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bag<E> implements Iterable<E> {

    private Map<E, Integer> elements = new HashMap<E, Integer>();

    public void add(E el) {
        if (elements.containsKey(el)) {
            elements.put(el, elements.get(el) + 1);
        } else {
            elements.put(el, 1);
        }
    }

    public void remove(E el) {
        if (elements.containsKey(el)) {
            int val = elements.get(el);
            if (val == 1) {
                elements.remove(el);
            } else {
                elements.put(el, val - 1);
            }
        }
    }

    public static <T> Bag<T> toBag(T... arr) {
        Bag<T> theBag = new Bag<>();
        for (T element : arr) {
            theBag.add(element);
        }
        return theBag;
    }

    @Override
    public Iterator<E> iterator() {
        return elements.keySet().iterator();
    }

    public int getCount(E el) {
        return (elements.containsKey(el) ? elements.get(el) : 0);
    }

    public Set<E> uniqueSet() {
        return elements.keySet();
    }

}
