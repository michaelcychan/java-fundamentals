package middleletters;

public class GetMiddle {
    public static String getMiddle(String inputText){
        int strLeng = inputText.length();
        if (strLeng % 2 == 0) {
            return inputText.substring((strLeng/ 2) - 1, strLeng/2 + 1);
        } else {
            return inputText.substring(strLeng/2, strLeng/2 + 1);
        }
    }
}
