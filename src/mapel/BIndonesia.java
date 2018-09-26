package mapel;

/**
 *
 * @author Kiki Aulia
 */
public class BIndonesia extends Mapel {

    private String teksEksposisi;

    public BIndonesia(String teksEksposisi, String Guru, String BIndonesia) {
        super(Guru, BIndonesia);
        this.teksEksposisi = teksEksposisi;
    }

    public void info() {
        super.info();
        System.out.println("Materi: " + this.teksEksposisi);

    }

}
