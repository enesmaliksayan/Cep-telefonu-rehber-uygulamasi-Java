public class Kisi {
    private String ad;
    private String telefonNo;

    public Kisi(String ad, String telefonNo) {
        this.ad = ad;
        this.telefonNo = telefonNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public static Kisi olustur(String ad, String telefonNo) {
        return new Kisi(ad,telefonNo);
    }
}
