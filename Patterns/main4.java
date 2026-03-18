public class main4{
	public static void main(String[] args) {
		int n = 5;
        System.out.println("Pattern-19: Symmetric-Void Pattern");
		for(int i=0;i<n;i++){
		    for(int j=n;j>i;j--){
		        System.out.print("*");
		    }
		    for(int space=0;space<2*i;space++){
		        System.out.print(" ");
		    }
		    for(int j=n;j>i;j--){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<i+1;j++){
		        System.out.print("*");
		    }
		    for(int space=0;space<2*(n-i-1);space++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<i+1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}

        System.out.println();
        System.out.println("Pattern - 20: Symmetric-Butterfly Pattern");
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int space =0;space<2*(n-i-1);space++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                System.out.print("*");
            }
            for(int space =0;space<2*(i+1);space++){
                System.out.print(" ");
            }
            for(int j=n-1;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern - 21: Hollow Rectangle Pattern");
        for(int i=0;i<n;i++){
            if(i==0||i==n-1){
                for(int j =0;j<n;j++){
                    System.out.print("*");
                }
                System.out.println();
            } else{
                System.out.print("*");
                for(int space =0;space<n-2;space++){
                    System.out.print(" ");
                }
                System.out.println("*");
                
            }
        }
	}
}
