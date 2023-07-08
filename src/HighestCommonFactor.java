public class HighestCommonFactor {
    public static void main(String[] args) {
        System.out.println(HighestCommonFactor(25,15));

    }
    static int HighestCommonFactor(int m, int n) {
        while (m !=  n){
            if (m > n) m =m- n;
            else n = n-m;
        }
        return m;
    }
}
