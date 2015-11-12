import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class Merge{

    public void merge(String berkas1, String berkas2, String berkas3, String sasaran) throws IOException {
        FileInputStream Pertama = null;
        FileInputStream Kedua = null;
        FileInputStream Ketiga = null;
        FileOutputStream keluaran= null;
        int karakter;
        // Deklarasi variabel
        try {  
            // Object stream untuk masukkan
            Pertama = new FileInputStream(berkas1);
            Kedua = new FileInputStream(berkas2);
            Ketiga = new FileInputStream(berkas3);
            keluaran = new FileOutputStream(sasaran);
            
            karakter = Pertama.read();
            // Selama masih adaata yangih bisa dibaca
            while (karakter != -1) {// kalau minus 1 dia selesai
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = Pertama.read();
            }
            
            karakter = Kedua.read();
            while (karakter != -1) {// kalau minus 1 dia selesai
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = Kedua.read();
            }
            
            karakter = Ketiga.read();
            while (karakter != -1) {// kalau minus 1 dia selesai
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = Ketiga.read();
            }
            
            keluaran.flush();
        } 
        finally {
            // Tutup stream masukan
            if (berkas1 != null)           
                Pertama.close();
            if (berkas2 != null)           
                Kedua.close();
            if (berkas3 != null)           
                Ketiga.close();
            if (keluaran != null)
                keluaran.close();

        }
    }
    
}
