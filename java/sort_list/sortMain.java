package sort_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("George", 40));
        people.add(new Person("David", 30));
        people.add(new Person("Andrew", 35));

//        Collections.sort(people);
//                for (Person p : people) {
//            System.out.println(p.getName());
//        }

        Collections.sort(people, new NameOrder());
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}
