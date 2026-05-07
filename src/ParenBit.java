public class ParenBit {
    public String parenBit(String str){
        //base case
        if(str.length()<2 || !str.contains("(")){
            return "";
        }
        //recursive case
        else{
            if(str.startsWith("(") && str.endsWith(")")){
                return str;
            }else if(str.charAt(0)!='('){
                return parenBit(str.substring(1));
            }
                return parenBit(str.substring(0, str.length() - 1));
        }
        //return parenBit(str);
    }
}
