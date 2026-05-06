public class CountAbc {
    public int countAbc(String str){
        if(str.length()==3){
            return 0;
        }else if(str.substring(0,4)=="abc"||str.substring(0,4)=="aba"){
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }
}
