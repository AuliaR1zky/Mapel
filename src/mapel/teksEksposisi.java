package mapel;

/**
 *
 * @author Kiki Aulia
 */
public class teksEksposisi extends BIndonesia {

    private String Struktur;

    public teksEksposisi(String Struktur, String teksEksposisi, String Guru, String BIndonesia) {
        super(teksEksposisi, Guru, BIndonesia);
        this.Struktur = Struktur;
    }

    public void info() {
        super.info();
        System.out.println("Struktur: " + Struktur);

    }
}
