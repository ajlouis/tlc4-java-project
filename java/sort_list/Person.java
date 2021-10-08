package sort_list;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return this.name + " " + this.age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

}
