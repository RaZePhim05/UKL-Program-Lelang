import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.DoubleFunction;
import java.lang.*;


public class Lelang {
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    private java.util.Collections Collections;

    public Lelang(){
        this.idBarang.add(1);

        this.idBarang.add(2);

        this.idBarang.add(3);
    }

    public void prosesLelang(Masyarakat masyarakat, Lelang lelang, Barang barang){
        Scanner Obj = new Scanner(System.in);
        System.out.println("Lelang dimulai!");
        int syarat = 0;
        int lanjut=0;
        int Math=0;
        int banding=0;
        int idPembeli2=0;
            System.out.println("Daftar Barang Pelelangan");
            System.out.println("ID Barang \tNama Barang");
            System.out.println("1. \tEmas 300 gram");
            System.out.println("2. \tMobil");
            System.out.println("3. \tHP");
            System.out.println("Masukkan ID Barang yang akan dilelang: ");
            int idBarang=Obj.nextInt();
            if(idBarang==1){
                System.out.println("Barang yang akan dilelang adalah "+barang.getnamaBarang(idBarang-1));
                System.out.println("Status barang: "+barang.getStatus(idBarang-1));
                System.out.println("Harga awal untuk "+barang.getnamaBarang(idBarang-1)+" adalah "+barang.gethargaAwal(idBarang-1));
            do{
                ++syarat;
                if(barang.getStatus(idBarang-1)==true) {

                    System.out.println("Apakah ada yang akan menaikkan harga awal?");
                    String tawar=Obj.next();
                        if(tawar.equalsIgnoreCase("Ya")) {
                            do{
                                syarat++;
                            System.out.println("");
                                System.out.println("ID \tNAMA PEMBELI");
                                System.out.println("0 \tRizla");
                                System.out.println("1 \tAlip");
                                System.out.println("2 \tDante");
                                System.out.println("3 \tDita");
                                System.out.println("Masukkan ID Pembeli: ");
                                int inputan = Obj.nextInt();
                                this.idPenawar.add(inputan);
                                System.out.println("Silakan " + masyarakat.getNama(getidPenawar(lanjut)) + " untuk menaikkan harga.");
                                System.out.println("Masukkan tawaran: ");
                                this.hargaTawar.add(Obj.nextInt());
                                if(gethargaTawar(0)>barang.gethargaAwal(idBarang-1)){
                                    do{
                                        System.out.println("");
                                        System.out.println("Apakah ada yang akan menaikkan tawaran?");
                                        String tawar1=Obj.next();
                                        if(tawar1.equalsIgnoreCase("Ya")) {
                                            do{
                                                syarat++;
                                                System.out.println("ID \tNAMA PEMBELI");
                                                System.out.println("0 \tRizla");
                                                System.out.println("1 \tAlip");
                                                System.out.println("2 \tDante");
                                                System.out.println("3 \tDita");
                                                System.out.println("Masukkan ID Pembeli: ");
                                                System.out.println("Masukkan ID Pembeli: ");
                                                this.idPenawar.add(Obj.nextInt());
                                                lanjut++;
                                                System.out.println("Silakan " + masyarakat.getNama(getidPenawar(lanjut)) + " untuk menaikkan harga.");
                                                System.out.println("Masukkan tawaran: ");
                                                this.hargaTawar.add(Obj.nextInt());
                                                --syarat;
                                            }while(syarat==0);
                                        }else if(tawar1.equalsIgnoreCase("Tidak")){
                                            int max=Collections.max(hargaTawar);
                                            int indexmax=hargaTawar.indexOf(max);
                                            int indexmaxorang=getidPenawar(indexmax);
                                            System.out.println("Dimenangkan oleh "+masyarakat.getNama(indexmaxorang)+" dengan tawaran "+max+" dari "+masyarakat.getAlamat(indexmaxorang));
                                            break;
                                        }
                                    }while(true);
                                }else if(gethargaTawar(0)<barang.gethargaAwal(idBarang-1)){
                                    idPenawar.remove(0);
                                    hargaTawar.remove(0);
                                    System.out.println("Maaf tawaran anda di bawah harga awal");
                                }
                                --syarat;
                            }while(syarat==0);
                        }else if(tawar.equalsIgnoreCase("Tidak")){
                            System.out.println("Maaf tidak bisa");
                        }
                    }else if(barang.getStatus(idBarang-1)==false){
                System.out.println("Maaf barang belum siap");
                break;
                }
                --syarat;
            }while(syarat==0);
            } else if(idBarang==2){
                System.out.println("Barang yang akan dilelang adalah "+barang.getnamaBarang(idBarang-1));
                System.out.println("Status barang: "+barang.getStatus(idBarang-1));
                System.out.println("Harga awal untuk "+barang.getnamaBarang(idBarang-1)+" adalah "+barang.gethargaAwal(idBarang-1));
                do{
                    ++syarat;
                    if(barang.getStatus(idBarang-1)==true) {

                        System.out.println("Apakah ada yang akan menaikkan harga awal?");
                        String tawar=Obj.next();
                        if(tawar.equalsIgnoreCase("Ya")) {
                            do{
                                syarat++;
                                System.out.println("");
                                System.out.println("ID \tNAMA PEMBELI");
                                System.out.println("0 \tRizla");
                                System.out.println("1 \tAlip");
                                System.out.println("2 \tDante");
                                System.out.println("3 \tDita");
                                System.out.println("Masukkan ID Pembeli: ");
                                int inputan = Obj.nextInt();
                                this.idPenawar.add(inputan);
                                System.out.println("Silakan " + masyarakat.getNama(getidPenawar(lanjut)) + " untuk menaikkan harga.");
                                System.out.println("Masukkan tawaran: ");
                                this.hargaTawar.add(Obj.nextInt());
                                if(gethargaTawar(0)>barang.gethargaAwal(idBarang-1)){
                                    do{
                                        System.out.println("");
                                        System.out.println("Apakah ada yang akan menaikkan tawaran?");
                                        String tawar1=Obj.next();
                                        if(tawar1.equalsIgnoreCase("Ya")) {
                                            do{
                                                syarat++;
                                                System.out.println("ID \tNAMA PEMBELI");
                                                System.out.println("0 \tRizla");
                                                System.out.println("1 \tAlip");
                                                System.out.println("2 \tDante");
                                                System.out.println("3 \tDita");
                                                System.out.println("Masukkan ID Pembeli: ");
                                                System.out.println("Masukkan ID Pembeli: ");
                                                this.idPenawar.add(Obj.nextInt());
                                                lanjut++;
                                                System.out.println("Silakan " + masyarakat.getNama(getidPenawar(lanjut)) + " untuk menaikkan harga.");
                                                System.out.println("Masukkan tawaran: ");
                                                this.hargaTawar.add(Obj.nextInt());
                                                --syarat;
                                            }while(syarat==0);
                                        }else if(tawar1.equalsIgnoreCase("Tidak")){
                                            int max=Collections.max(hargaTawar);
                                            int indexmax=hargaTawar.indexOf(max);
                                            int indexmaxorang=getidPenawar(indexmax);
                                            System.out.println("Dimenangkan oleh "+masyarakat.getNama(indexmaxorang)+" dengan tawaran "+max+" dari "+masyarakat.getAlamat(indexmaxorang));
                                            break;
                                        }
                                    }while(true);
                                }else if(gethargaTawar(0)<barang.gethargaAwal(idBarang-1)){
                                    idPenawar.remove(0);
                                    hargaTawar.remove(0);
                                    System.out.println("Maaf tawaran anda di bawah harga awal");
                                }
                                --syarat;
                            }while(syarat==0);
                        }else if(tawar.equalsIgnoreCase("Tidak")){
                            System.out.println("Maaf tidak bisa");
                        }
                    }else if(barang.getStatus(idBarang-1)==false){
                        System.out.println("Maaf barang belum siap");
                        break;
                    }
                    --syarat;
                }while(syarat==0);
            }else if(idBarang==3){
                System.out.println("Barang yang akan dilelang adalah "+barang.getnamaBarang(idBarang-1));
                System.out.println("Status barang: "+barang.getStatus(idBarang-1));
                System.out.println("Harga awal untuk "+barang.getnamaBarang(idBarang-1)+" adalah "+barang.gethargaAwal(idBarang-1));
                do{
                    ++syarat;
                    if(barang.getStatus(idBarang-1)==true) {
                        System.out.println("Apakah ada yang akan menaikkan harga awal?");
                        String tawar=Obj.next();
                        if(tawar.equalsIgnoreCase("Ya")) {
                            do{
                                syarat++;
                                System.out.println("");
                                System.out.println("ID \tNAMA PEMBELI");
                                System.out.println("0 \tRizla");
                                System.out.println("1 \tAlip");
                                System.out.println("2 \tDante");
                                System.out.println("3 \tDita");
                                System.out.println("Masukkan ID Pembeli: ");
                                int inputan = Obj.nextInt();
                                this.idPenawar.add(inputan);
                                System.out.println("Silakan " + masyarakat.getNama(getidPenawar(lanjut)) + " untuk menaikkan harga.");
                                System.out.println("Masukkan tawaran: ");
                                this.hargaTawar.add(Obj.nextInt());
                                if(gethargaTawar(0)>barang.gethargaAwal(idBarang-1)){
                                    do{
                                        System.out.println("");
                                        System.out.println("Apakah ada yang akan menaikkan tawaran?");
                                        String tawar1=Obj.next();
                                        if(tawar1.equalsIgnoreCase("Ya")) {
                                            do{
                                                syarat++;
                                                System.out.println("ID \tNAMA PEMBELI");
                                                System.out.println("0 \tRizla");
                                                System.out.println("1 \tAlip");
                                                System.out.println("2 \tDante");
                                                System.out.println("3 \tDita");
                                                System.out.println("Masukkan ID Pembeli: ");
                                                System.out.println("Masukkan ID Pembeli: ");
                                                this.idPenawar.add(Obj.nextInt());
                                                lanjut++;
                                                System.out.println("Silakan " + masyarakat.getNama(getidPenawar(lanjut)) + " untuk menaikkan harga.");
                                                System.out.println("Masukkan tawaran: ");
                                                this.hargaTawar.add(Obj.nextInt());
                                                --syarat;
                                            }while(syarat==0);
                                        }else if(tawar1.equalsIgnoreCase("Tidak")){
                                            int max=Collections.max(hargaTawar);
                                            int indexmax=hargaTawar.indexOf(max);
                                            int indexmaxorang=getidPenawar(indexmax);
                                            System.out.println("Barang "+barang.getnamaBarang(idBarang-1)+" dimenangkan oleh "+masyarakat.getNama(indexmaxorang)+" dari "+masyarakat.getAlamat(indexmaxorang)+" dengan tawaran "+max);
                                            break;
                                        }
                                    }while(true);
                                }else if(gethargaTawar(0)<barang.gethargaAwal(idBarang-1)){
                                    idPenawar.remove(0);
                                    hargaTawar.remove(0);
                                    System.out.println("Maaf tawaran anda di bawah harga awal");
                                }
                                --syarat;
                            }while(syarat==0);
                        }else if(tawar.equalsIgnoreCase("Tidak")){
                            System.out.println("Maaf tidak bisa");
                        }
                    }else if(barang.getStatus(idBarang-1)==false){
                        System.out.println("Maaf barang belum siap");
                        break;
                    }
                    --syarat;
                }while(syarat==0);
            }else{
                System.out.println("Maaf pilihan tidak tersedia");
            }
    }

    public int getidPenawar(int id){
        return this.idPenawar.get(id);
    }
    public int getidBarang(int id){
        return this.idBarang.get(id);
    }
    public int gethargaTawar(int id){
        return this.hargaTawar.get(id);
    }
    public int cariMin(int[]arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    static int cariMaks(int[]arr){
        int maks=arr[0];
        for(int i=1;i<arr.length;i++){
            if(maks<arr[i]){
                maks=arr[i];
            }
        }
        return maks;
    }
}
