import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nama Fakultas :");
        String namajurusan = scanner.nextLine();
        Fakultas fti =new Fakultas(namajurusan);

        System.out.println("Masukkan Jumlah Prodi :");
        int jumlahprodi = scanner.nextInt();

        for (int i = 0 ; i < jumlahprodi ; i++){
            System.out.println("Masukkan Data Prodi ke-"+(i+1)+" : ");
            System.out.println("Kode : ");
            String kodeprodi = scanner.next();
            scanner.nextLine();
            System.out.println("Nama Prodi :");
            String namaprodi = scanner.nextLine();

            Jurusan prodi = new Jurusan(kodeprodi,namaprodi);
            fti.Tambahprodi(prodi);
        }
        fti.DisplayDaftarProdi();
    }
}