// Write a function that displays first letter of each word in a sentence
// "Sai praveen Seva" return Sps



public class firstAlphabet {
    String firstLetter(String S) {
        StringBuilder str = new StringBuilder();

        //Logic Section
        /* Its best to use a StringBuilder since we have to return a string
            we have to print the first letter so we use i==0 condition
            For the rest we just search for a space(' ') and display the i+1th character
            We append the first alphabet of each word into str and then return it.
         */
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
