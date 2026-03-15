public class main2{
	public static void main(String[] args) {
        System.out.println("Pattern - 8: Inverted Star Pyramid");
	    int n=3;
		for(int i=n;i>0;i--){
		    for(int j=0;j<3-i;j++){
		        System.out.print(" ");
		    }
		    for(int k=0;k<2*i-1;k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
        System.out.println();
        System.out.println("Pattern - 9: Diamond Star Pattern");
		n=5;
		for(int i=0;i<n;i++){
		    for(int j = n-i-1;j>0;j--){
		        System.out.print(" ");
		    }
		    for(int k = 0;k<2*i+1;k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i=n;i>0;i--){
		    for(int j=0;j<n-i;j++){
		        System.out.print(" ");
		    }
		    for(int k=0;k<2*i-1;k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}

        System.out.println();
        System.out.println("Pattern - 10: Half Diamond Star Pattern");
        n=5;
	    for(int i=0;i<n;i++){
	        for(int j =i+1;j>0;j--){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
		
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-i-1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
