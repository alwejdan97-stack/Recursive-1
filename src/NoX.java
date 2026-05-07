public class NoX {
    public String noX(String str){
        //base case
        if(str.length()==0){
            return "";
        }
        //recursive case
        else{
            if(str.charAt(0)=='x'){
                return noX(str.substring(1));
            }
        }
        return str.charAt(0)+noX(str.substring(1));
    }
}
