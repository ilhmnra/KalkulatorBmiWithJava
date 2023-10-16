package kalkulatorbmi;

public class RecordBerat {
    private Double berat;
    private Double tinggi;
    private String formattedBMI;
    private String status;
    private String beratIdealStr;

    public RecordBerat(Double berat, Double tinggi, String formattedBMI, String status, String beratIdealStr) {
        this.berat = berat;
        this.tinggi = tinggi;
        this.formattedBMI = formattedBMI;
        this.status = status;
        this.beratIdealStr = beratIdealStr;
    }

    public Double getBerat() {
        return berat;
    }

    public Double getTinggi() {
        return tinggi;
    }

    public String getFormattedBMI() {
        return formattedBMI;
    }

    public String getStatus() {
        return status;
    }

    public String getBeratIdealStr() {
        return beratIdealStr;
    }
    
    
    
}
