

import java.util.ArrayList;
public class Barang {
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaPenjual = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Barang(){
        this.idMasyarakat.add(1);
        this.namaPenjual.add("Budi");
        this.alamat.add("Ngadirejo");
        this.telepon.add("083375884");
        this.namaBarang.add("Emas 300 gram");
        this.hargaAwal.add(30000);
        this.status.add(true);

        this.idMasyarakat.add(2);
        this.namaPenjual.add("Pou");
        this.alamat.add("Malang");
        this.telepon.add("085736573");
        this.namaBarang.add("Mobil");
        this.hargaAwal.add(90000);
        this.status.add(true);

        this.idMasyarakat.add(3);
        this.namaPenjual.add("Oyen");
        this.alamat.add("Jakarta");
        this.telepon.add("084657365");
        this.namaBarang.add("HP");
        this.hargaAwal.add(10000);
        this.status.add(true);

    }
    public void setidMasyarakat(int idMasyarakat){
        this.idMasyarakat.add(idMasyarakat);
    }
    public Integer getidMasyarakat(int idM){
        return this.idMasyarakat.get(idM);
    }
    public void setnamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public String getnamaBarang(int nama){
        return this.namaBarang.get(nama);
    }
    public void sethargaAwal(int harga){
        this.hargaAwal.add(harga);
    }
    public int gethargaAwal(int harga){
        return this.hargaAwal.get(harga);
    }
    public void setStatus(boolean Status){
        this.status.add(Status);
    }
    public Boolean getStatus(int status){
        return this.status.get(status);

    }
}
