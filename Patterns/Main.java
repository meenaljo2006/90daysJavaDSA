// Implemented Pattern 2 to 6
public class Main {
    public static void main(String[] args){
        System.out.println("Pattern-2: Right-Angled Triangle Pattern");
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern - 3: Right-Angled Number Pyramid");
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Pattern - 4: Right-Angled Number Pyramid - II");
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern-5: Inverted Right Pyramid");
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Pattern - 6: Inverted Numbered Right Pyramid");
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            
            System.out.println();
        }
        
    }
}