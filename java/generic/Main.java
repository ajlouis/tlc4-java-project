package generic;

import sort_list.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bag<String> sBag = new Bag<>();
        Bag<Integer> iBag = new Bag<>();

        sBag.add("One");
        sBag.add("Two");
        sBag.add("One");
        sBag.add("Three");

        for (String s : sBag) {
            System.out.println(s + ": " + sBag.getCount(s));
        }

        System.out.println(sBag.uniqueSet().toString());

        iBag.add(1);
        iBag.add(2);
        iBag.add(3);
        iBag.add(2);
        iBag.remove(1);

        System.out.println(iBag.uniqueSet().toString());


        Bag<Integer> intBag = Bag.toBag(1, 4, 3, 2, 3);
        Bag<String> strBag = Bag.toBag("Hello", "world");


        System.out.println(intBag.uniqueSet().toString());
        System.out.println(strBag.uniqueSet().toString());

        List<String> sList = new ArrayList<>();
        List<Person> pList = new ArrayList<>();

        if (sList.getClass() == pList.getClass()) {
            System.out.println("slist and plist have same type" + sList.getClass());
        } else {
            System.out.println("slist class: " + sList.getClass() + " plist class: " + pList.getClass());

        }


    }


}

