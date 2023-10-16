package kalkulatorbmi;

public class IdealBerat {
    
    private static double persen = 0.10;

    public static double hitungBeratIdeal(double tinggiMeter) {
        return ((tinggiMeter * 100) - 100) - (((tinggiMeter * 100) - 100) * persen);
    }
}
