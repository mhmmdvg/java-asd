import java.text.DecimalFormat;
public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(){
    }
    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    private String parseIPK(){
        DecimalFormat df = new DecimalFormat("#.##");
        String IPK = String.valueOf(getIpk());
        if (IPK.length() < 1){
            IPK = df.format(ipk);
        }
        return IPK;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String toString(){
        return String.format("%s %s %s\n",nim, nama, parseIPK());
    }
}


