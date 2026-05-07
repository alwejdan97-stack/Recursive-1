public class Count8 {
    public int count8(int n) {
        //int last = n % 10;
        //int secondLast = (n / 10) % 10;
        if (n == 0) {
            return 0;
        } else if(n % 10 == 8){
            if( (n/10) % 10 == 8) {
                    return count8(n/10)+2;
                }
            return count8(n/10)+1;
            }
                return count8(n/10);
    }
}
