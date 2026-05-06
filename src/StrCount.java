public class StrCount {
    public int strCount(String str, String sub){
        if(str.length()<sub.length()){
            return 0;
        }
        else if(str.substring(sub.length()).equals(sub)){
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }
}
