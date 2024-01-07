public class Method {
    public static void main(String[] args) {

        sayHelloWorld("Farhan", "Septiansyah");
        sayHelloWorld("Aulia", "Jasmine");
        sayHelloWorld("Mahriza", "Arielsyah");

        var result = sum(10, 17);
        System.out.println(result);

        var kalkulator = kalkulator(3, "*", 2);
        System.out.println(kalkulator);

    }

    static void sayHelloWorld(String firtsName, String lastName) {
        System.out.println("Hallo " + firtsName + " " + lastName);
    }

    static int sum(int x, int y) {
        var total = x + y;
        return total;
    }

    static int kalkulator(int x, String operasi, int y) {
        switch (operasi) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            case "%":
                return x % y;
            default:
                return 0;
        }
    }
}
