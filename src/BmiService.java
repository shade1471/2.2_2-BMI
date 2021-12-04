public class BmiService {
    public double calculate(double mass, double height) {

        double bmi = mass / Math.pow(height, 2);

        return bmi;
    }
}
