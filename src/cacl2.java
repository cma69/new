public class cacl2 {
    public static double findAverage(double[] numbers) {

        double sum = 0.0;
        double avg = 0.0;
        for (double x : numbers) {
            sum += x;
        }
        avg = sum / numbers.length;
        return avg;
    }

    public static double findAverage(int[] numbers) {

        double avg = 0.0;
        double sum = 0.0;
        for (int x : numbers) {
            sum += x;
        }
        avg = sum / numbers.length;
        return avg;

    }

    public static int factorial(int number) {
        int fact = 1;
        for (int i = number; i> 0; i--) {
            fact *= i;
        }
        return fact;
    }
}