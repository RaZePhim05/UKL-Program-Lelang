import java.util.ArrayList;
public class Masyarakat implements User{
    private ArrayList<String> namaMasyarakat= new ArrayList<String>();
    private ArrayList<String> alamat= new ArrayList<String>();
    private ArrayList<String> telepon= new ArrayList<String>();

    public Masyarakat(){
        this.namaMasyarakat.add("Rizla");
        this.alamat.add("Blitar");
        this.telepon.add("09248902");

        this.namaMasyarakat.add("Alip");
        this.alamat.add("Maluku");
        this.telepon.add("08593758");

        this.namaMasyarakat.add("Dante");
        this.alamat.add("Papua");
        this.telepon.add("095829584");

        this.namaMasyarakat.add("Dita");
        this.alamat.add("Kediri");
        this.telepon.add("094829489");
    }

    @Override
    public void setNama(String namaMasya) {
        this.namaMasyarakat.add(namaMasya);
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
        return this.namaMasyarakat.get(id);
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
