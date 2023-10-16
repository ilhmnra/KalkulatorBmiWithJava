package kalkulatorbmi;

public class SatuanTinggi {

    private static double feet= 0.3048;
    private static double inch = 0.0254;
    private static double centimeter = 0.01;

    public static double convertToMeter(double value, String unit) {
        return switch (unit) {
            case "Meter" ->
                value;
            case "Feet" ->
                value * feet;
            case "Inch" ->
                value * inch;
            case "Centimeter" ->
                value * centimeter;
            default ->
                0.0;
        };
    }
}
