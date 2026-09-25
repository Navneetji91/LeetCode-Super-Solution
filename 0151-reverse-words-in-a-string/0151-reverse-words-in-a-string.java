class Solution {
    public String reverseWords(String s) {
        
        
        s=s.trim();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();

        StringBuilder result=new StringBuilder();
        int n=sb.length();
        int i=0;

        while(i<n){
            if(sb.charAt(i) == ' '){
                i++;
                continue;
            }

            int wordStart=i;
            while(i < n && sb.charAt(i) != ' '){
                i++;
            }
            int wordEnd=i;
            StringBuilder word=new StringBuilder(sb.substring(wordStart, wordEnd));
            word.reverse();

            if(result.length() > 0){
                result.append(" ");
            }
            result.append(word);
        }
        return result.toString();
        
    }
}