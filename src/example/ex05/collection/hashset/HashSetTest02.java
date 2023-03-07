package example.ex05.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetTest02 {
    public static void main(String[] args) {
        // Example 1
        Set set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 20));
        set.add(new Person("David", 20));

        System.out.println(set);
        System.out.println();

        // Example 2
        Set<String> set1 = new HashSet<String>();
        set1.add("JAVA");
        set1.add("JDBC");
        set1.add("JSP");
        set1.add("SPRING");

        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            if (element.equals("JAVA")) {
                iterator.remove();
            }
        }
        System.out.println();

        set1.remove("JDBC");

        for (String element : set1) {
            System.out.println(element);
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
