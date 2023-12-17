package DSA;

public class ToLowerCase {

    public static String toLowerCase(String s){
        char[] temp = s.toCharArray();
        for (int i=0; i<temp.length; i++){
            if (temp[i]>=65 && temp[i]<=90){
                temp[i] = (char) (temp[i] + 32);
            }
        }

        return new String(temp);
    }

    public static void main(String[] args) {

    }
}
