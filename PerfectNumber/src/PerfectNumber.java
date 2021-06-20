
public class PerfectNumber {

    public static void main(String[] args) {
        boolean value = isPerfectNumber(28);
        System.out.println(value);
    }

    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }
        int factors = 1;
        int sum = 0;
        while (factors < number) {  // excluding number itself
           if (number % factors == 0) {
               sum += factors;
           }
           factors++;
        }

        return (sum == number);

    }

}
