class Person {
    String name;
    int age;
    final String country = "Indonesia";

    // Constructor
    Person(String paramName, int paramAge) {
        name = paramName;
        age = paramAge;

    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + " My name is " + name);
    }
}
