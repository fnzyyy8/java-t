public class Array {
    public static void main(String[] args) {
        String[] array;
        array = new String[3];

        array[0] = "Hello";
        array[1] = "Farhan";
        array[2] = "Septiansyah";

    System.out.println(array[0]);

    // Array Instalization

    int[] arrayInt = new int[]{
        2,3, 4
    };

    int[] arraySingkat = {
        1,2,3,4
    };

    System.out.println(arraySingkat[2]);
    System.out.println(arraySingkat.length);

    // Array dalam array

    String[][] member = {
        {"Farhan","Septiansyah"},
        {"Aulia", "Jasmine"}
    };

    System.out.println(member[0][1]);

}};
