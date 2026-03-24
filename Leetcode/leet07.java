package Leetcode;

public class leet07 {

    public static int reverse(int x) {

        int reverse = 0;
        while(x!=0){
            int lastDigit = x % 10;
            if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE){
                return 0;
            }
            reverse = reverse*10 + lastDigit;
            x = x/10;    
        }
        return reverse;
    }

    public static void main(String[] args) {

        int n1 = 1534236469;
        int n2 = -321;

        System.out.println(reverse(n1));
        System.out.println(reverse(n2));
        
    }
    
}
