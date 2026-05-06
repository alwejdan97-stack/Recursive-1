public class ChangePi {
    public String changePi(String str){
        //base case
        if(str.length()==0){
            return "";
        }
        //recursive base
        else if(str.startsWith("pi")){
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0)+changePi(str.substring(1));
    }
}
