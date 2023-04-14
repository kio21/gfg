import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a number N.
 * Calculate the prime numbers up to N using Sieve of Eratosthenes.
 */
public class SieveOfEratosthenes {

    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n == 1) return res;
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) arr[i] = i;
        arr[1] = 0;
        System.out.println("arr = " + Arrays.toString(arr));
        int k = 1;
        boolean end = false;
        while (!end) {
            if (++k <= n) {
                if (arr[k] != 0) res.add(k);
                sieve(k, arr, n);
                System.out.println("arr = " + Arrays.toString(arr));
            } else {
                end = true;
            }
        }
        return res;
    }

    static void sieve(int k, int[] arr, int n) {
        for (int i = k; i <= n; i += k) {
            if (i % k == 0 && arr[i] != 0) arr[i] = 0;
        }
    }

    /* Constraints: 1<= N <= 10^4
     * Input:N=10 Output:2 3 5 7
     * Input:N=35 Output:2 3 5 7 11 13 17 19 23 29 31
     */
    public static void main(String[] args) {
        int n = 35;
        System.out.println("n = " + n);
        List<Integer> res = sieveOfEratosthenes(n);
        System.out.println("res = " + res);
    }
}
