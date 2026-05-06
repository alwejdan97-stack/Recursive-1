public class StrCount {
    public int strCount(String str, String sub){
        // base case
        if(str.length()<sub.length()){
            return 0;
        }
        //recursive case
        else if(str.substring(0,sub.length()).equals(sub)){
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }
}
