import java.util.ArrayList;
public class Petugas implements User{
    private ArrayList<String> namaKaryawan= new ArrayList<String>();
    private ArrayList<String> alamat= new ArrayList<String>();
    private ArrayList<String> telepon= new ArrayList<String>();

    public Petugas(){
        this.namaKaryawan.add("Yuda");
        this.alamat.add("Kediri");
        this.telepon.add("084572957");

    }
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaKaryawan.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
