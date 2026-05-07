public class Count8 {
    public int count8(int n){
        int last=n % 10;
        int secondLast=(n / 10) % 10;
        if(n==0){
            return 0;
        }
        else {
            if(last==8 && secondLast==8){
                return count8(2);
            }
            else if(last==8 && secondLast!=8){
                return count8(1);
            }
            else if(last!=8){
                return count8(0);
            }
        }

    }
}
