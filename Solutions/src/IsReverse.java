/**
 * Created by swest06 on 02/06/2018.
 */
public class IsReverse {
    public static boolean isReverse(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }else if (s1.length() == 0 && s2.length() == 0){
            return true;
        }else {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            return s1.charAt(0) == s2.charAt(s2.length()-1) &&
                    isReverse(s1.substring(1, s1.length()), s2.substring(0, s2.length()-1));
        }
    }
    
}
