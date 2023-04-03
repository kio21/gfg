import java.util.Arrays;

public class FrogsJumps {
    public static void main(String[] args) {
        FrogsJumps main = new FrogsJumps();
        int[] frogs = {6334,26500,19169,15724,11478,29358,26962,24464,5705,28145,23281,16827,9961,491,2995,11942,4827,5436,32391,14604,3902,153,292,12382,17421,18716,19718,19895,5447,21726,14771,11538,1869,19912,25667,26299,17035,9894,28703,23811,31322,30333} ;
//        int[] frogs = {1, 3, 5} ;
//        int[] frogs = {3, 2, 4};
        int n = frogs.length;
        int leaves = 18468;
//        int leaves = 6;
//        int leaves = 4;
        System.out.println(n + " " + leaves);
        System.out.println(Arrays.toString(frogs));
        int res = main.unvisitedLeaves(n, leaves, frogs);
        System.out.println("\nres = " + res);
    }

    public int unvisitedLeaves(int n, int leaves, int[] frogs) {
        int unvisited_total = 0;
        boolean visited_i;
        System.out.print("unvisited ");
        for (int i = 1; i <= leaves; i++) {
            visited_i = false;
            for (int frog : frogs) {
                if (i % frog == 0) {
                    visited_i = true;
                    break;
                }
            }
            if (!visited_i) {
                unvisited_total++;
                System.out.print(i + " ");
            }
        }
        // TODO optimize
        return unvisited_total;
    }
}
