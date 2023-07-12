public class Main {

  public static void main(String[] args) {
    Buku buku1 = new Buku("B001", "Pemrograman java");
    Buku buku2 = new Buku("B002", "Pemrograman C++");
    BukuLuar buku3 = new BukuLuar("B003", "Harry Potter");

    Petugas petugas1 = new Petugas("Alex", "P001");
    Peminjam peminjam1 = new Mahasiswa();
    peminjam1.setNamaPeminjam("Budi");
    peminjam1.setKodePeminjam("M001");

    Peminjam peminjam2 = new Mahasiswa();
    peminjam2.setNamaPeminjam("Cinta");
    peminjam2.setKodePeminjam("M002");

    peminjam1.doLogin();
    peminjam2.doLogin();
    try {
      // Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku1);
      // Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku2);
      Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku3);
      Denda denda1 = new Denda(peminjaman1, 5);

      System.out.println("Nama Peminjam :" + peminjaman1.getPeminjam().getNamaPeminjam());
      System.out.println("Kode Peminjam :" + peminjaman1.getPeminjam().getKodePeminjam());
      System.out.println("Nama Petugas :" + peminjaman1.getPetugas().getNamaPetugas());
      System.out.println("Nama Buku :" + peminjaman1.getBuku().getNamaBuku());

      Denda denda2 = new Denda(peminjaman1, 7);
      System.out.println("Tagihan denda:" + denda1.getTagihan());

      System.out.println("======= Denda dihapuskan ! =======");
      peminjam1.addAntiDenda();
      // denda1 = new Denda(peminjaman1, 0);
      System.out.println("Tagihan denda:" + denda2.getTagihan());

      System.out.println("======= Denda ditambahkan ! =======");
      peminjam1.removeAntiDenda();
      System.out.println("Tagihan denda:" + denda1.getTagihan());

    } catch (Exception e) {
      System.out.println("Terjadi kesalahan" + e.getMessage());
    } finally {
      System.out.println("Program Selesai");
    }
    peminjam1.doLogout();

  }

}
