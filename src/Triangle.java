public class Triangle {
    public int triangle(int n){
        //base case
        if(n==0){
            return 0;
        }
        //recursive case
        else{
            return n + triangle(n - 1);
        }
    }
}
