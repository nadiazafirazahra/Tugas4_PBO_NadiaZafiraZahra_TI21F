/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 */
public class NamaFilm {
     protected String Judul_Film;
    private final java.lang.String Nama_Film;
    
    public NamaFilm(String Nama_Film, String nama_genre) {
        super(nama_genre);
        this.Nama_Film = Nama_Film;
    }

    
    public void infoLagu(){
        System.out.println("Nama genre : " + super.nama_genre);
        System.out.println("Adalah judul genre : " +this.Nama_Film);
    }
    
}