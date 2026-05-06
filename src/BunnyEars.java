public class BunnyEars {
    public static int bunnyEars2(int n){
        // create base case
        if(n==0){
            return n;
        }
        // create recursive case
        else{
            if(n % 2 == 0){
                return 3 + bunnyEars2(n - 1);
            }
            return 2 + bunnyEars2(n - 1);
        }
    }
}
