public class OperasiBoolean {
    public static void main(String[] args) {
        
        var absen = 75;
        var nilaiAkhir = 75;

        Boolean lulusAbsen = absen >= 75;
        Boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);
    }
}
