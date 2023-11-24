public class Fakultas {
    private String Fakultas;
    private Jurusan[] DaftarProdi;
    private int jumlahprodi;

    public Fakultas(){
        this.DaftarProdi = new Jurusan[10];
        this.jumlahprodi =0;
    }
    public Fakultas(String fakultas){
        this.Fakultas = fakultas;
        this.DaftarProdi = new Jurusan[10];
        this.jumlahprodi = 0;
    }
    public String getFakultas(){
        return Fakultas;
    }
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }
    public void Tambahprodi(Jurusan jurusan){
        if (jumlahprodi < DaftarProdi.length){
            DaftarProdi[jumlahprodi] = jurusan;
            jumlahprodi++;
        }
        else {
            System.out.println("Kapasitas Penuh");
        }
    }
    public void DisplayDaftarProdi(){
        System.out.println("Fakultas : "+Fakultas);
        System.out.println("Daftar Prodi : ");
        for (int i = 0 ; i < jumlahprodi ; i++){
            System.out.print((i+1));
            DaftarProdi[i].DisplayProdi();
            System.out.println();
        }
    }

}
