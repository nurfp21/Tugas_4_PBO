import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Karyawan kar = new Karyawan();
        Pembeli pem = new Pembeli();
        Komputer kom = new Komputer();
        Laptop lap = new Laptop();
        Elektronik elek = new Elektronik();
        transaksi tran = new transaksi();
        int pilih, banyak;
        int memori = 20000, monitor = 15000, tipe = 15000, jumlah;
        Scanner input = new Scanner(System.in);

        System.out.println("BARANG ELEKTRONIK YANG DIJUAL : ");
        System.out.println("1. KOMPUTER");
        System.out.println("2. LAPTOP");
        System.out.println("3. SILAHKAN PILIH : ");
        pilih = input.nextInt();

        switch (pilih){
            case 1:
                System.out.println("BERAPA BANYAK DATA : ");
                banyak = input.nextInt();
                for(int i=0; i<banyak; i++) {
                    System.out.println("MASUKKAN ID KARYAWAN : ");
                    int id_kry= input.nextInt();
                    kar.setId_kry(id_kry);
                    System.out.println("MASUKKAN NAMA KARYAWAN : ");
                    String nama_kry= input.next();
                    kar.setNama_kry(nama_kry);
                    System.out.println("MASUKKAN NO KTP PEMBELI : ");
                    int ktp= input.nextInt();
                    pem.setKtp(ktp);
                    System.out.println("MASUKKAN NAMA PEMBELI : ");
                    String nama_pembeli= input.next();
                    pem.setNama_pembeli(nama_pembeli);
                    System.out.println("MASUKKAN TIPE BARANG : ");
                    String tipe_barang= input.next();
                    elek.setTipe_barang(tipe_barang);
                    System.out.println("MASUKKAN JUMLAH BARANG : ");
                    jumlah = input.nextInt();
                    tran.setJumlah(jumlah);
                }
                for(int i=0; i<banyak; i++) {
                    System.out.println();
                    System.out.println("=====================================================");
                    System.out.println("\t\t\t\tTOKO ELEKTRONIK JAYA");
                    System.out.println("=====================================================");
                    System.out.println("\t\t\t\t\t\t\tID KARYAWAN   : " + kar.getId_kry());
                    System.out.println("\t\t\t\t\t\t\tNAMA KARYAWAN : " + kar.getNama_kry());
                    System.out.println("=====================================================");
                    System.out.println("NO KTP PEMBELI           : " + pem.getKtp());
                    System.out.println("NAMA PEMBELI             : " + pem.getNama_pembeli());
                    System.out.println("NAMA BARANG              : " + kom.namaBarang());
                    System.out.println("TIPE BARANG              : " + elek.getTipe_barang());
                    System.out.println("TOTAL HARGA              : " + tran.hargaElektronik(monitor, memori, tran.jumlah));
                    System.out.println("POTONGAN HARGA           : "+tran.potonganHarga());
                    System.out.println("PAJAK TAMBAHAN           : "+tran.pajak());
                    System.out.println("TOTAL YANG HARUS DIBAYAR : " + (tran.hargaElektronik(monitor, memori, tran.jumlah)-tran.potonganHarga()+tran.pajak()));
                }
                break;
            case 2 :
                System.out.println("BERAPA BANYAK DATA : ");
                banyak = input.nextInt();
                for(int i=0; i<banyak; i++) {
                    System.out.println("MASUKKAN ID KARYAWAN : ");
                    int id_kry= input.nextInt();
                    kar.setId_kry(id_kry);
                    System.out.println("MASUKKAN NAMA KARYAWAN : ");
                    String nama_kry= input.next();
                    kar.setNama_kry(nama_kry);
                    System.out.println("MASUKKAN NO KTP PEMBELI : ");
                    int ktp= input.nextInt();
                    pem.setKtp(ktp);
                    System.out.println("MASUKKAN NAMA PEMBELI : ");
                    String nama_pembeli= input.next();
                    pem.setNama_pembeli(nama_pembeli);
                    System.out.println("MASUKKAN TIPE BARANG : ");
                    String tipe_barang= input.next();
                    elek.setTipe_barang(tipe_barang);
                    System.out.println("MASUKKAN JUMLAH BARANG : ");
                    jumlah = input.nextInt();
                    tran.setJumlah(jumlah);
                }

                for(int i=0; i<banyak; i++) {
                    System.out.println();
                    System.out.println("=====================================================");
                    System.out.println("\t\t\t\tTOKO ELEKTRONIK JAYA");
                    System.out.println("=====================================================");
                    System.out.println("\t\t\t\t\t\t\tID KARYAWAN   : " + kar.getId_kry());
                    System.out.println("\t\t\t\t\t\t\tNAMA KARYAWAN : " + kar.getNama_kry());
                    System.out.println("=====================================================");
                    System.out.println("NO KTP PEMBELI           : " + pem.getKtp());
                    System.out.println("NAMA PEMBELI             : " + pem.getNama_pembeli());
                    System.out.println("NAMA BARANG              : " + lap.namaBarang());
                    System.out.println("TIPE BARANG              : " + elek.getTipe_barang());
                    System.out.println("PAJAK TAMBAHAN           : "+tran.pajak());
                    System.out.println("TOTAL YANG HARUS DIBAYAR : " + (tran.hargaElektronik(tipe, tran.jumlah)+tran.pajak()));
                }
                break;
            default:
                System.out.println("TIDAK ADA PILIHANNYA!!!");
        }
    }
}