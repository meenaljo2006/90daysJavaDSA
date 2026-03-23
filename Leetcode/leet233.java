package Leetcode;
public class leet233 {
    //Brute Force Approach
    public static int countDigitOne(int n) {
        int count = 0;
        while(n>0){
            int temp = n;
            while(temp>0){
                int lastDigit = temp%10;
                if(lastDigit ==1){
                    count++;
                }
                temp = temp/10; //O(logn)
            }
            n = n-1; // O(n)
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(countDigitOne(n)); // taking = O(n*logn) time
    }
}
