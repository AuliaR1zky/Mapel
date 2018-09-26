package mapel;

/**
 *
 * @author Kiki Aulia
 */
class Mapel {

    private String Guru, BIndonesia;

    public Mapel(String Guru, String BIndonesia) {
        this.Guru = Guru;
        this.BIndonesia = BIndonesia;
    }

    public void info() {
        System.out.println("Guru: " + this.Guru);
        System.out.println("Mapel: " + this.BIndonesia);

    }
}
