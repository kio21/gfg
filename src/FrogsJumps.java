import java.util.Arrays;

public class FrogsJumps {
    public static void main(String[] args) {
        FrogsJumps main = new FrogsJumps();
        int[] frogs = {3,2,4};
        int n = frogs.length;
        int leaves = 4;
        System.out.println(Arrays.toString(frogs)+" "+leaves);
        int res = main.unvisitedLeaves(n, leaves, frogs);
        System.out.println("res = " + res);
    }
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        int res = 0;
        // TODO
        return res;
    }
}
