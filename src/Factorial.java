public class Factorial {
    public static int  factorial(int n){
        if(n==1){
            return n;
        }
        else{
            return  factorial(n-1)*n;
        }
    }
}
