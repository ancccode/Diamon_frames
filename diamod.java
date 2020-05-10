import java.util.Scanner;

class diamod{
	public int mid(int n){
		return (n/2);
	}
	public void midPattern(int n){
		//for(int i=0; i<(2*n+2); i++){
			System.out.print("|");
			System.out.print("<");
			for(int j=0; j<2*n-2; j++){
				if(n%2 == 0){
					System.out.print("-");
				}
				else{
					System.out.print("=");
				}
			}
			System.out.print(">");
			System.out.print("|");
		

	}
	public void BegEndPattern(int n){
		System.out.print("+");
		for(int i = 0; i<(2*n); i++){
			System.out.print("-");
		}
		System.out.print("+");
			
	}
	
	
	
	public static void main(String[] args){
		diamod d = new diamod();
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any size");
		int size = sr.nextInt();
		
		int m=2;
		for(int i =0; i<(size*2+1); i++){
			if(i == d.mid(size*2+1)){
				d.midPattern(size);
			}
			else if(i==0 || i==(size*2)){
				d.BegEndPattern(size);
			}
			else{
				System.out.print("|");
				if(i< d.mid(size*2+1)){
					for(int j=size-1; j>i-1; j--){
						System.out.print(" ");
					}
					System.out.print("/");
					for(int k=0; k<2*i-2; k++){
						if(i%2 == 0){
							System.out.print("-");
						}
						else{
							System.out.print("=");
						}
					}
					System.out.print("\\");
					for(int j=size-1; j>i-1; j--){
						System.out.print(" ");
					}
					
				}
				else{
					for(int j=size-1; j<i-1; j++){
						System.out.print(" ");
					}
					System.out.print("\\");
					for(int k=m; k<2*i-4; k++){
						if(i%2 == 0){
							System.out.print("-");
						}
						else{
							System.out.print("=");
						}
						
					}	
					m +=4;
					
					System.out.print("/");
					for(int j=size-1; j<i-1; j++){
						System.out.print(" ");
					}					
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}
		
		
		
}	
