public class Solution {
    public String reverseString(String s) {
        if (s == null) {
             return null;
        }
        String result;
        char[] ch = new char[s.length()];
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            ch[index++] = s.charAt(i);
        }
        //result = String.valueOf(ch);
        result = new String(ch);
        return result;
    }
}

//StringBuilder Version
public class Solution {
    public String reverseString(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}