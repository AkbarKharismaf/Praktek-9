public class Denda {
  private Peminjaman peminjaman;
  private int hariTerlambat;
  private static final int TARIF_DENDA = 1000;

  public Denda(Peminjaman peminjaman, int hariTerlambat) {
    this.peminjaman = peminjaman;
    this.hariTerlambat = hariTerlambat;
  }

  public Peminjaman getPeminjaman() {
    return peminjaman;
  }

  public int getTagihan() {
    return hariTerlambat * TARIF_DENDA;
  }
}
