import java.awt.color.ProfileDataException;

public class Jurusan {
    private String kode,nama;
    public Jurusan(String kode,String nama){
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void DisplayProdi(){
        System.out.println(".|Kode Prodi : "+getKode()+" | Nama Prodi : "+getNama()+" |");
    }
}
