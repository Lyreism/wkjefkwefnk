import java.util.Scanner;

public class NestedAksesLab27 {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = ryuh.nextBoolean();

        System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
        sedangDisanksi = ryuh.nextBoolean();

        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = ryuh.nextBoolean();

        System.out.print("Apakah asisten lab? (true/false): ");
        asistenLab = ryuh.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}