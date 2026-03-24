public class reverseNum{
    public static void main(String[] args) {
        int n = 400100;
        int reverse = 0;
        while(n>0){
            int lastDigit = n%10;
            reverse=reverse*10+lastDigit;
            n = n/10;
        }

        System.out.println(reverse); // taking O(logn) time and space = O(1)
    }
}