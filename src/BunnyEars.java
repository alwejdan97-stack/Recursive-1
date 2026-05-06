public class BunnyEars {
    public int bunnyEars2(int n){
        if(n==1){
            return n;
        }else{
            if(n % 2 == 0){
                return 3 + bunnyEars2(n - 1);
            }
            return 2 + bunnyEars2(n - 1);
        }
    }
}
