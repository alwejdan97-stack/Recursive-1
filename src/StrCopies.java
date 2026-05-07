public class StrCopies {
    public Boolean strCopies(String str, String sub, int n){
        //base case
        if(n==0){
            return true;
        }else if(str.length()<sub.length()){
            return false;
        }
        //recursive case
        else if(str.substring(0,sub.length()).equals(sub)){
                return strCopies(str.substring(1), sub, n - 1);
            }
            return strCopies(str.substring(1), sub, n);
    }
}
