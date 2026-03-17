public class main3{
	public static void main(String[] args) {
		int n = 5;
        System.out.println("Pattern - 12: Number Crown Pattern");
		for(int i=0;i<n;i++){
		    for(int j =0;j<i+1;j++){
		        System.out.print(j+1);
		    }
		    for(int space =0;space<2*(n-i-1);space++){
		        System.out.print(" ");
		    }
		    for(int j=i+1;j>0;j--){
		        System.out.print(j);
		    }
		    
		    System.out.println();
		}
		
        System.out.println();
        System.out.println("Pattern - 13: Increasing Number Triangle Pattern");
		int count = 1;
		for(int i=0;i<n;i++){
		    for(int j=0;j<i+1;j++){
		        System.out.print(count+" ");
		        count++;
		    }
		    System.out.println();
		}
		
		System.out.println();
        System.out.println("Pattern-14: Increasing Letter Triangle Pattern");
		for(int i=0;i<n;i++){
		    char letter = 'A';
		    for(int j=0;j<i+1;j++){
		        System.out.print(letter);
		        letter++;
		    }
		    System.out.println();
		}
		
        System.out.println();
        System.out.println("Pattern-15: Reverse Letter Triangle Pattern");
		for(int i=n;i>0;i--){
		    char letter = 'A';
		    for(int j=i;j>0;j--){
		        System.out.print(letter);
		        letter++;
		    }
		    System.out.println();
		}
		
        System.out.println();
        System.out.println("Pattern - 16: Alpha-Ramp Pattern");
		char letter = 'A';
		for(int i=0;i<n;i++){
		    for(int j=0;j<i+1;j++){
		        System.out.print(letter);
		    }
		    letter++;
		    System.out.println();
		}
		
        System.out.println();
        System.out.println("Pattern - 17: Alpha-Hill Pattern");
		for(int i=0;i<n;i++){
		    char alpha ='A';
		    for(int space=n-1;space>i;space--){
		        System.out.print(" ");
		    }
		    
		    for(int j =i+1;j>0;j--){
		        System.out.print(alpha);
		        alpha++;
		    }
		    alpha-=2;
		    for(int k =0;k<i;k++){
		        System.out.print(alpha);
		        alpha--;
		    }
		    System.out.println();
		}
		
        System.out.println();
        System.out.println("Pattern-18: Alpha-Triangle Pattern");
		char alpha = 'E';
		for(int i=0;i<n;i++){
		    for(int j = 0;j<i+1;j++){
		        System.out.print(alpha);
		        alpha++;
		    }
		    alpha-=i+2;
		    System.out.println();
		}
	}
}
