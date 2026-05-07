public class SumDigits {
    public int sumDigits(int n){
        //base case
        if(n==0) {
            return 0;
        }
        //recursive base
        else {
            return n % 10 + sumDigits(n / 10);
        }
    }
}
