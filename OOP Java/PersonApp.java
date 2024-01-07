public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("John", 12);

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.country);

        person1.sayHello("Anto");

    }
}