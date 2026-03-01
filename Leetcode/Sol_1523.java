//Given two non-negative integers low and high. 
//Return the count of odd numbers between low and high (inclusive).

package Leetcode;
public class Sol_1523 {

    public static int countOdds(int low, int high) {

        // int count = 0;
        // for(int i = low;i<=high;i++){
        //     if(i%2!=0){
        //         count++;
        //     }
        // }

        //TC = O(high-low)
        
        //3,4,5,6,7
        int numberInRange = high-low+1;
        int evenInRange = (high/2)-(low-1)/2;
        int odd = (high+1)/2-(low/2);
        System.out.println(numberInRange+" "+evenInRange+" "+odd);

        return odd;

        
    }

    public static void main(String[] args) {
        int low = 3;
        int high =7;
        countOdds(low, high);

        
    }
    
}

// TC = O(1)