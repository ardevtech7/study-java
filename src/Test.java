import java.util.*;

public class Test {
    public static void main(String[] args) {
        String a = "100";
        String b = "abc";

        int intValue = Integer.parseInt(a);
        System.out.println(intValue);

        // NumberFormatException
        int stringValue = Integer.parseInt(b);
        System.out.println(stringValue);
        List<String> listOf = List.of("a", "b");
        System.out.println(listOf);

        Map<String, Integer> mapOf = Map.of("id", 1);
        Integer value = mapOf.get("id");
        Collection<Integer> values = mapOf.values();
        System.out.println(mapOf);
        System.out.println(value);
        System.out.println(values);

        Map<Integer, String> mapTest = new HashMap<>();
        mapTest.put(1, "test1");
        mapTest.put(2, "GenericTest");
        System.out.println(mapTest);

        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student("홍길동", 10));
        map.put(2, new Student("이순신", 20));
        System.out.println(map);

        List<Student> list = new ArrayList<>();
        list.add(new Student("송중기", 10));
        list.add(new Student("송혜교", 20));
        System.out.println(list);

        List<Student> list1 = Arrays.asList(
                new Student("이서진", 10),
                new Student("박서준", 20)
        );
        System.out.println(list1);

    }

    private static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
