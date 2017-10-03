import java.util.ArrayList;

public class CepTelefonu {

    private ArrayList<Kisi> rehber;

    private String kendiNumaram;
    public CepTelefonu(String kendiNumaram){
        this.kendiNumaram=kendiNumaram;
        this.rehber=new ArrayList<>();

    }

    public boolean kisiEkle(Kisi yeniKisi) {

        if(varMi(yeniKisi.getAd()) >= 0){
            System.out.println(yeniKisi.getAd()+" zaten Rehberde var.");
            return false;
        }

        rehber.add(yeniKisi);
        System.out.println("Ekleme Başarılı!");
        return true;

    }

    public int varMi(Kisi aranacakKisi) {
        return this.rehber.indexOf(aranacakKisi);
    }

    public int varMi(String isim) {
        for(int i=0;i<this.rehber.size();i++) {
            Kisi oAnkiKisi = this.rehber.get(i);
            if(oAnkiKisi.getAd().toLowerCase().equals(isim.toLowerCase())){
                return i;
            }
        }
        return -1;
    }

    public void listele() {
        System.out.println("\n Tüm kişiler");
        for(int i=0;i<this.rehber.size();i++) {
            System.out.println((i+1)+"-) Ad: "+ this.rehber.get(i).getAd()
                    +"\t Tel no: "+this.rehber.get(i).getTelefonNo());
        }
        return;
    }

    public void kisiBul(String isim) {
        if(varMi(isim)>=0) {
            Kisi kisi = rehber.get(varMi(isim));
            System.out.println("Ad: " + kisi.getAd() + "Telefon Numarası: " + kisi.getTelefonNo());
        }else {
            System.out.println("Böyle biri yok!");
        }
        return;
    }

    public void kisiSil(String isim) {
        if(varMi(isim)>=0) {
            rehber.remove(varMi(isim));
        }else  {
            System.out.println("Böyle biri yok!");
        }
        return;
    }

    public void kisiGuncelle(String isim,Kisi yeniBilgiler) {
        if(varMi(isim)>=0) {
            rehber.set(varMi(isim),yeniBilgiler);
        }else {
            System.out.println("Böyle biri yok!");
        }
        return;
    }
}
