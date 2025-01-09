package Lambda_Expression;

// Write a Java program to implement a lambda expression to find the average of a list of doubles.
//-----------------------------------------------------------------------------------//

public class question30 {
    public void AverageOfDoubles() {
        Average average = (arr) -> {
            double sum = 0;
            for (double i : arr) {
                sum += i;
            }
            return sum / arr.length;
        };
        double[] arr = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        System.out.println(average.average(arr));
    }

    interface Average {
        double average(double[] arr);
    }
}
