public class BinaryNumTri{
	public static void main(String[] args) {
        System.out.println("Pattern - 11: Binary Number Triangle Pattern");
		int n = 5;
		int print =0;
		for(int i=0;i<n;i++){
		    if(i%2==0){
		        print=1;
		    } else{
		        print =0;
		    }
		    System.out.print(print);
		    int j = 1;
		    while(j<i+1){
		        if(print ==0){
		            print = 1;
		        } else {
		            print =0;
		        }
		        System.out.print(print);
		        j++;
		    }
		    System.out.println();
		}
	}
}
