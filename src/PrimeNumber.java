public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println( isPrime(7));
    }
    static boolean isPrime(int n){
        for(int i = 2; i < (n/2); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
