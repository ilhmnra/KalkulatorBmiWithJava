/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorbmi;

public class RentangBerat {
    
    private double kurus = 18.5;
    private double normal = 24.9;
    private double gemuk = 29.9;    

    public String getStatusBMI(double bmi) {
        if (bmi < kurus) {
            return "Kurus";
        } else if (bmi < normal) {
            return "Normal";
        } else if (bmi < gemuk) {
            return "Gemuk";
        } else {
            return "Obesitas";
        }
    }
}
