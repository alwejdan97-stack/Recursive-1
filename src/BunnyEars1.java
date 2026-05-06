public class BunnyEars1 {
    public int bunnyEars(int n){
        //base case
        if(n==0){
            return 0;
        }
        //recursive case
        else{
            return 2 + bunnyEars(n - 1);
        }
    }
}
