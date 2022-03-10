package HackerRank;

public class Staircase {
	
	 public static void staircase(int n) {
	     int i=0,j=0,k=0;
	     for(i=n;i>0;i--){
	         for (j=1;j<i;j++){
	             System.out.print(" ");
	         }
	         for( k = 1;k<=n-i+1;k++){
	             System.out.print("#");
	         }
	         System.out.print("\n");
	     }
	 }

	public static void main(String[] args) {
		staircase(6);
	}

}
