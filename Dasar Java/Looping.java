public class Looping {
    public static void main(String[] args) {

        int count = 1;
        for (; count < 10;) {
            count++;
            System.out.println("Perulangan " + count);
        }

        for (int i = 1; i < count; i++) {
            System.out.println("Ini i : " + i);
        }

        String[] names = {
                "Farhan", "Septiansyah", "Hidayat"
        };

        for (String name : names) {
            System.out.println(name);

        }

    }

}
