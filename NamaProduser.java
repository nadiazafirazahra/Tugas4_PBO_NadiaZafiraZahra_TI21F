/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 */
public class NamaProduser exstends Film{
    protected String nama_prod;
    
    public NamaProduser(String nama_prod, String nama_film)  {
        super(nama_film);
        this.nama_prod = nama_prod;
    }
    
public void infoLagu (){
    System.out.println("Nama film: " + super.nama_film);
    System.out.println("Nama Produser : " + this.nama_prod );
    }
}