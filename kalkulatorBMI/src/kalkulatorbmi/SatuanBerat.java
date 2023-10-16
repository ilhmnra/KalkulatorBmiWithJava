package kalkulatorbmi;

public class SatuanBerat {
    
    private static double pound = 0.453592;
    private static double ounce = 0.0283495;
    private static double gram = 0.001;

    public static double convertToKg(double value, String unit) {
        return switch (unit) {
            case "Kilogram" ->
                value;
            case "Pound" ->
                value * pound;
            case "Ounce" ->
                value * ounce;
            case "Gram" ->
                value * gram;
            default ->
                0.0;
        };
    }
}
