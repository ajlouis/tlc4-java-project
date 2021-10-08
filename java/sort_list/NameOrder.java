package sort_list;

import java.util.Comparator;

public class NameOrder implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
