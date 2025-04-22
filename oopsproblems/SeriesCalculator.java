package oopsproblems;
//4. Create a class SeriesCalculator with a method calculateSum(int n)
// to calculate the sum of the first n numbers
// in the series 1 + 3 + 5 + 7 + ....
// Use the formula Sum = (n/2) * [2*a + (n-1)*d],
// where "a" is the first term and "b" is the common difference.
public class SeriesCalculator {

    public int Calculating(int n) {
        int a = 1;
        int b = 2;
        return    n/2 * (2 * a + (n - 1) * b);
    }

    public static void main(String[] args) {
        SeriesCalculator sum = new SeriesCalculator();


        System.out.println(sum.Calculating(6));
    }
}
