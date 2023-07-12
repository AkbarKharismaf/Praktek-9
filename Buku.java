public class Buku {

  private String namaBuku;
  private String idBuku;

  public Buku(String namaBuku, String idBuku) {
    this.namaBuku = namaBuku;
    this.idBuku = idBuku;
  }

  protected String getIdBuku() {
    return idBuku;
  }

  protected String getNamaBuku() {
    return namaBuku;
  }
}
