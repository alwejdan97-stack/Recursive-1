public class Factorial {
    public static int  factorial(int n){
        // Base case
        if(n==1){
            return n;
        }
        //Recursive case
        else{
            return  factorial(n-1)*n;
        }
    }
}
