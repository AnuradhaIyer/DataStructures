public class SumToZeroes {

    public int[] sumZero(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; ++i)
            A[i] = i * 2 - n + 1;
        return A;
    }

    public static void main(String[] args) {
        SumToZeroes sm = new SumToZeroes();
        sm.sumZero(5);
    }
}
