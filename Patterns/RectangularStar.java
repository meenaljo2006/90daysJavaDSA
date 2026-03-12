import java.util.Scanner;
public class RectangularStar {

    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    } 
}

// Time Complexity = O(N^2)
// Space Complexity = O(1) --- No Aux.Space + 2 input space (i,j) = O(2) avoiding constants
