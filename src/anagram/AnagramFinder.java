package anagram;


public class AnagramFinder {

    public static void main(String[] args) {
        String sentance1="lampe";
        String sentance2="palme";
        System.out.println(areAnagrams(sentance1,sentance2));
    }


    public static boolean areAnagrams(String string1, String string2) {
        string1=removeChars(string1);
        string2=removeChars(string2);
        if (string1.length()==string2.length()){
            char[] char1=string1.toCharArray();
            char[] char2=string2.toCharArray();
            for (int i=0; i<char1.length; i++){
                for (int j=0; j<char2.length; j++){
                    if (char1[i]==char2[j]){
                        char2[j]='0';
                        break;
                    }
                }
            }
            //System.out.println(Arrays.toString(char2));
            for (int i=0; i<char2.length;i++){
                if (char2[i]!='0') return false;
            }
        } else {
            return false;
        }
     return true;
    }

    public static String removeChars(String text){
        text=text.replace(" ","");
        text=text.replace(".","");
        return text;
    }

}
