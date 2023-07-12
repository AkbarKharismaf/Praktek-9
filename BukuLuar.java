import java.util.Date;

public class BukuLuar extends Buku {

  private String imporOleh;
  private Date tglImpor;

  public BukuLuar(String idBuku, String namaBuku) {
    super(idBuku, namaBuku);
  }

  public void setImporOleh(String imporOleh) {
    this.imporOleh = imporOleh;
  }

  public String getImporOleh() {
    return imporOleh;
  }

  public void setTglImpor(Date tglImpor) {
    this.tglImpor = tglImpor;
  }

  public Date getTglImpor() {
    return tglImpor;
  }

}
