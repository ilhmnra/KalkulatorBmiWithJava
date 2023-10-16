package kalkulatorbmi;

public class KalkulatorBMI {

    private double berat;
    private double tinggi;

    public KalkulatorBMI() {
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungBMI(String selectedSatuanBerat, String selectedSatuanTinggi) {
        double beratKg = SatuanBerat.convertToKg(berat, selectedSatuanBerat); //depedn
        double tinggiMeter = SatuanTinggi.convertToMeter(tinggi, selectedSatuanTinggi); //dependensi
        this.tinggi = tinggiMeter;
        this.berat = beratKg;
        return beratKg / (tinggiMeter * tinggiMeter);
    }

    public double getBerat() {
        return berat;
    }

    public double getTinggi() {
        return tinggi;
    }
}

