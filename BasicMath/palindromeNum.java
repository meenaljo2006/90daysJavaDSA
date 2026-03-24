public class palindromeNum {
    public static void main(String[] args) {
        int n = 1221;
        int original = n;
        int reverse = 0;
        while(n>0){
            int lastDigit = n%10;
            reverse = reverse*10+lastDigit;
            n = n/10;
        }

        if(reverse==original){
            System.out.println("It's a palindrome number");
        }
        
    }
    
}
