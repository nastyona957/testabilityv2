public class BmiService {
    public int calculate(double meter, int kilogram) {
        double heightSquared = meter * meter;
        double bmi = kilogram / heightSquared;
        return (int) bmi;
    }
}