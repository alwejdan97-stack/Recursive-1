public class CountX {
    public int countX(String str){
        // base case
        if(str.length()==0){
            return 0;
        }
        //recursive base
        else if(str.charAt(0)=='x'){
                return 1 + countX(str.substring(1));
            }
        return countX(str.substring(1));    //return countX(str.substring(1));
        }
    }

