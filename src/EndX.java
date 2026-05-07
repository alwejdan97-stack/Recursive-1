public class EndX {
    public String endX(String str){
        if(str.length()==0){
            return "";
        }
        else{
            if(str.charAt(0)=='x'){
                return endX(str.substring(1))+1;
            }
                return str.charAt(0)+endX(str.substring(1));
        }
    }
}
