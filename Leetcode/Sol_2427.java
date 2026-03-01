//Given two positive integers a and b, return the number of common factors of a and b.
//An integer x is a common factor of a and b if x divides both a and b.

package Leetcode;
public class Sol_2427 {

    public static int commonFactors(int a, int b) {

        int count =1;
        int low =Math.min(a,b);
        // if(a>b){
        //     low = b;
        // } else {
        //     low =a;
        // }
        
        int i=2;
        while(i<=low){
            if(a%i==0 && b%i==0){
                count++;
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args) {

        commonFactors(12, 6);

    }
    
}

//TC = O(min(a,b))

