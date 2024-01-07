public class SwitchStatement {
    public static void main(String[] args) {

        var nilaiAkhir = "A";

        switch (nilaiAkhir) {
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
                System.out.println("Anda lulus");
                break;
            case "C":
                System.out.println("Anda belum lulus coba remedial");
                break;
            case "D":
                System.out.println("Anda gagal, coba lagi tahun depan");
                break;
            default:
                System.out.println("Anda salah input");
                break;
        }

        // Switch Lambada

        switch (nilaiAkhir) {
            case "A", "B" -> System.out.println("Di lambada anda lulus");
            case "C", "D" -> System.out.println("Di lambada anda tidak lulus");
            default -> System.out.println("Di lambada anda salah input");
        }

        // Switch tanpa yield
        String ucapan;

        switch (nilaiAkhir) {
            case "A", "B" -> ucapan = "Mantap";
            case "C", "D" -> ucapan = "Kurang Mantap";
            default -> ucapan = "Salah isi bro!";
        }
        System.out.println(ucapan);

        // Switch dengan yield

        String hasil = switch (nilaiAkhir) {
            case "A", "B", "C", "D":
                yield "Sudah ada nilai";
            case "":
                yield "Tidak ada nilai";

            default:
                yield "Salah input";
        };
        System.out.println(hasil);

    }
}
