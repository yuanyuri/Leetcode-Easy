public class Solution {
    public String addBinary(String a, String b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;
        String result = "";
        while (indexB >= 0) {
            int sum = (int)a.charAt(indexA) - '0' + (int)b.charAt(indexB) - '0' + carry;
            result = String.valueOf(sum % 2) + result;
            carry = sum / 2;
            --indexA;
            --indexB;
        }
        while (indexA >= 0) {
            int sum = (int)a.charAt(indexA) - '0' + carry;
            result = String.valueOf(sum % 2) + result;
            carry = sum / 2;
            --indexA;
        }
        if (carry == 1) {
            result = "1" + result;
        }
        return result;
    }
}