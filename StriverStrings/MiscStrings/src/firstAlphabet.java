public class firstAlphabet {
    String firstLetter(String S) {
        // code here

        StringBuilder str = new StringBuilder();

        for(int i=0;i<S.length();i++){
            if(i==0)
            {
                str.append(S.charAt(i));
            }
            if(S.charAt(i)==' '){
                str.append(S.charAt(i+1));
            }
        }
        return str.toString();
    }
}
