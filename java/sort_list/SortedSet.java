package sort_list;

import java.util.TreeSet;

public class SortedSet {

    public static void main(String[] args) {
//        java.util.SortedSet<Person> people = new TreeSet<>();
        java.util.SortedSet<Person> people = new TreeSet<>(new NameOrder());
        people.add(new Person("George", 40));
        people.add(new Person("David", 30));
        people.add(new Person("Andrew", 35));

        for (Person p : people) {
            System.out.println(p.getName());
        }

    }
}
