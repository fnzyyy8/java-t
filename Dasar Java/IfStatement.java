public class IfStatement {
    public static void main(String[] args) {
        
        var nilaiUjian = 80;
        var absensi = 70;
        var standard = 75;

        if (nilaiUjian>=standard&&absensi>=standard) {
            System.out.println("Anda lulus");
        }else{
            System.out.println("Tidak Lulus");
        }
    }
}
