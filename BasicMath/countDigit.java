public class countDigit {
    public static void main(String[] args){
        //Brute force approach
        int n = 12345;
        int count = 0;
        while(n>0){
            count++;
            n = n/10; // this is taking O(log10(n)) time
        }

        //optimized approach
        int num2 = 1000;
        int countDigit = (int)(Math.log10(num2)+1); // this is taking O(1) time


        System.out.println(count);
        System.out.println(countDigit);

    }
}