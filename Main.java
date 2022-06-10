public class Main {
    public static void main(String[] args) {
        Lelang lelang = new Lelang();
        Masyarakat masya = new Masyarakat();
        Barang brng = new Barang();
        lelang.prosesLelang(masya, lelang, brng);
    }
}
