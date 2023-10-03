package printing;

import java.util.Iterator;

import java.util.Scanner;

public class StarPyramid {
	
	
	
//	star pyramid
//	public static void main(String arg[]) {
//		int k=6;
//		for(int i=1;i<k;i++) {
//			for(int j=i;j<k;j++) {
//				System.out.print("*");
//			}
//			System.out.println("\n");
//		}
//	}

	
	
//	diamond
	
	public static void main(String arg[]) {
		
	
//		int k=6;
//		for(int i=1;i<=k;i++) {
//			for(int j=1;j<=i;j++) {
//					System.out.print("*");
//			}
//			System.out.print("\n");
//			
//		}
		
//		for(int i=1;i<=k;i++) {
//			for(int l=k-1;l>=i;l--) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		
		
		
		
		
//number period starting from 5
		
//		for (int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j>=6-i) {
//					System.out.print(j);
//					}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.print("\n");
//		}
		
		
//reverse 
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j>=i) {
//					System.out.print(j);
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.print("\n");
//			
//		}
//		
//		
		
		
		
//		dimond pattern
		
		
//		for(int i=1;i<=5;i++) {
//			int a=1;
//			for(int j=1;j<10;j++) {
//				
//				if(j>=6-i && j<=4+i) {
//					
//					System.out.print(a);
//					a+=1;
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.print("\n");
//		}
//		
//		for(int i=1;i<=5;i++) {
//			int a=1;
//			for(int j=1;j<10;j++) {
//				if (j>=1+i && j<=9-i ) {
//					
//					System.out.print(a);
//					a+=1;
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.print("\n");
//		}
//		
		
		
		
		
//		pyramid
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<10;j++) {
//				
//					if(j>=6-i && j<=4+i) {
//						System.out.print("*");
//					}else
//					{
//						System.out.print(" ");
//					}
//				
//			}
//			System.out.print("\n");
//		}
		
		
		
		
//		fibannaci series
		
		
//		int temp=0;
//		int a=0,b=1;
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[] ar=new int[n+1];
//		ar[0]=a;
//		ar[1]=b;
//		for(int i=2;i<=n;i++) {
//			temp=a+b;
//			a=b;
//			b=temp;
//			ar[i]=temp;
//		}
//		System.out.println(ar[n]);
//		
//	}
//		
		
		
//star pyramid differently
//		for(int i=1;i<=5;i++) {
//			boolean k=true;
//			for(int j=1;j<10;j++) {
//				if(j>=6-i && j<=4+i &&k) {
//					System.out.print("*");
//					k=false;
//				}else {
//					System.out.print(" ");
//					k=true;
//				}
//				
//			}
//			System.out.print("\n");
//		}
		
		
		
		
		
//cube printing
		
//		int k=5;
//		for(int i=1;i<=k;i++) {
//			for(int j=1;j<=k;j++) {
//				if (i==1||j==1||i==k || j==k) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.print("\n");
//		}
		
		
		
		
//		two hills join
		
		
//		int k=10;
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<k;j++) {
//				if(j<=i || j>=k-i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.print("\n");
//		}
		
		
		
//		diamond one side
		
//	 for(int i=1;i<=5;i++) {
//		 for(int j=1;j<=5;j++) {
//			 if(j<=i){
//				 System.out.print("*");
//			 }
//		 }System.out.print("\n");
//	 }
//	
//	 for(int i=1;i<=5;i++) {
//		 for(int j=5;j>=1;j--) {
//			 if(j>i){
//				 System.out.print("*");
//			 }
//		 }System.out.print("\n");
//	 }
	
	
//		number pyramid
//		int b=0;
//		for(int i=1;i<=5;i++) {
//			int a=i;
//			for(int j=1;j<10;j++) {
//				
//				if( j>=6-i && j<=5) {
//					System.out.print(a);
//					b=a;
//					a++;
//					
//				}else if(j<=4+i && j>5) {
//					b-=1;
//					System.out.print(b);
//		
//				
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//				
//			}
//			
//		
//			System.out.print("\n");
//		}
		
		
		
//for(int i=1;i<=5;i++) {
//	for(int j=1;j<=5;j++) {
//		if(j<=6-i) {
//			System.out.print("*");
//		}
//	}
//	System.out.print("\n");
//}
//for(int i=2;i<=5;i++) {
//	for(int j=1;j<=5;j++) {
//		if(j<=i) {
//			System.out.print("*");
//		}
//	}
//	System.out.print("\n");
//}
		
		
		
//		butterfly
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<10;j++) {
//				if(j<=i || j>=10-i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.print("\n");
//		}
//		
//		for(int i=1;i<5;i++) {
//			for(int j=1;j<10;j++) {
//				if(j<=5-i || j>4+i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.print("\n");
//		}
//		
		
	
//		0,1 pyramid
		
//		for(int i=1;i<=6;i++) {
//			int n=i-1,b=1;
//			for(int j=1;j<12;j++) {
//				if(j>=7-i && j<=6) {
//					System.out.print(n);
//					n-=1;
//				}
//				else if(j<=5+i && j>=6){
//					System.out.print(b);
//					b+=1;
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.print("\n");
//		}
		
	
		
		
//		triange
//		for(int i=1;i<=8;i++) {
//			for(int j=1;j<9;j++) {
//				if(i==1||j==1||j==9-i) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.print("\n");
//		}
//		
//		
		
//		star pyramid
		
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<12;j++) {
//				if(j>=7-i && j<=5+i) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.print("\n");
//		}
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<12;j++) {
//				if(j>i&&j<12-i) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.print("\n");
//		}
		
		
//		star pyramid with double quates
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<12;j++) {
//				
//				if(j>=7-i && j<=5+i) {
//					System.out.print("*");
//				}
//				else if(j==1 || j==11) {
//					System.out.print("''");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.print("\n");
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=1;j--) {
//				if(j!=i) {
//					System.out.print(j);
//				}else {
//					System.out.print("*");
//				}
//			}System.out.print("\n");
//		}
		
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=7;j++) {
//				if(j<(i+i) && j%2!=0) {
//					System.out.print(i);
//				}else if(j%2==0 && j<(i+i)) {
//					System.out.print("*");
//				}
//			}System.out.print("\n");
//		}
//		for(int i=4;i>=1;i--) {
//			for(int j=1;j<=7;j++) {
//				if(j<(i+i) && j%2!=0) {
//					System.out.print(i);
//				}else if(j%2==0 && j<(i+i)) {
//					System.out.print("*");
//				}
//			}System.out.print("\n");
//		}
//		
		
		
//	int a=0,c=0;
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=8;j++) {
//			if(j<=4) {
//				if (i>1 && j>5-i ) {
//					System.out.print("*");
//					a=j;
//				} else  {
//					System.out.print(j);
//					a=j;
//				}
//				
//				
//			}
//			else if(j>4){
//				if(j<4+i && i>1) {
//					System.out.print("*");
//					a--;
//				}else {
//					System.out.print(a);
//					a--;
//				}
//				
//			}
//			
//		}System.out.print("\n");
//	}
		
		
		
//		Alphabet two hills
//		char k;
//		for(int i=1;i<=5;i++) {
//			k='A';
//			for(int j=1;j<8;j++) {
//				if(j<=5-i || j>=3+i) {
//					System.out.print(k);
//					if (j<4) {
//						 k++;}
//					else {
//						 k--;
//					}
//			}
//				else {
//					System.out.print(" ");
//					if(j==4) {
//						k--;
//					}
//			}
//		
//			}
//			System.out.print("\n");
//		}
//		
		
		
		
		
		
		
//hello pyramid
		
//		String str="Hello";
//		for(int i=1;i<=str.length();i++) {
//			for(int j=0;j<i;j++) {
//				if(i<=str.length()) {
//					System.out.print(str.charAt(j));
//				}
//			}
//			System.out.print("\n");
//
//		}
//		for(int i=4;i>=0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.print(str.charAt(j));
//			}
//			System.out.print("\n");
//
//		}
		
		
		
		
//computer pyramid
//		String str="COMPUTER";
//		for(int a=1;a<=str.length();a++) {
//			for(int b=0;b<a;b++) {
//				System.out.print(str.charAt(b));
//			}
//			System.out.print("\n");
//		}


//for(int i=1;i<=5;i++) {
//	for(int j=1;j<=5;j++) {
//		if(j>=6-i) {
//			System.out.print("*");
//		}else {
//			System.out.print(" ");
//		}
//	}System.out.print("\n");
//}

		
		
		
		
//for(int i=1;i<=3;i++) {
//	for(int j=1;j<=5;j++) {
//		if(i==1||j==1|i==3||j==5) {
//			System.out.print(" * ");
//
//		}else {
//			System.out.print("   ");
//		}
//	}
//	System.out.print("\n\n");
//}
		
		
		
		
		
//for(int i=1;i<=12;i++) {
//	for(int j=1;j<7;j++) {
//		if(i==1&&j<=2||i==5&&j<=4||i==12||j==1) {
//			System.out.print("*");
//		}
//	}System.out.print("\n");
//}
//		
		
		
//int a=1,b=1,k=1;
//for(int i=1;i<=5;i++) {
//	
//	
//	for(int s=6-k;s>=1;s--) {
//		System.out.print(" ");
//	}k++;
//	for(int j=1;j<=i;j++) {
//		if(i>2) {
//			if(j>1 && j<i) {
//				b++;
//				System.out.print(b+" ");
//			}else {
//				System.out.print(a+" ");
//			}
//		}else {
//			System.out.print(a+" ");
//		}
//		
//	}
//	b=a;
//	System.out.print("\n");
//}
		
//		    int i,j;
//		    char ch='A';
//		    for(i=0;i<5;i++){
//		        for(j=1;j<8;j++){
//		            if(j>=5-i&& j<=4){
//		                System.out.print(ch);
//		                ch++;
//		            }else if(j<3+i && j>4){
//		            	ch--;
//		            	System.out.print(ch);
//		   
//		            }else{
//		                System.out.print(" ");
//		            }
//		        }
//		        System.out.print("\n");
//		    }
		    
		
		
//		for(int i=1;i<=12;i++) {
//			for(int j=0;j<6;j++) {
//				if(j<=i&&i==1||i==5 && j<4||i==12) {
//					System.out.print("*");
//				}
//				else if(j==0) {
//					System.out.print("*");
//				}
//			}System.out.print("\n");
//		}
		
		
//		 int rows=6;
//		 for (int i = 1; i <= rows; i++) {
//	            // Print spaces before numbers
//	            for (int j = 1; j <= rows - i; j++) {
//	                System.out.print(" ");
//	            }
//	            
//	            // Print ascending numbers
//	            for (int j = 1; j < i; j++) {
//	                System.out.print(j + " ");
//	            }
//	            
//	            // Print the center 1
//	            System.out.print("1");
//	            
//	            System.out.println(); // Move to the next line
//	        }
		
		
		

//		    int i,j,k=5;
//		    for(i=1;i<=5;i++){
//		        for(j=1;j<=6-i;j++){
//		            if(i==1){
//		                System.out.print(j+"");
//		            }else if(j==1){
//		            	System.out.print(i);
//		            }else if(j==6-i){
//		                System.out.print(k);
//		            }else{
//		                System.out.print(" ");
//		            }
//		        }
//		        System.out.print("\n");
//		    }
		
//		int a=2;
//		for(int i=1;i<10;i++){
//	        for(int j=1;j<10;j++){
//	            if(j==6-i && i<5 || i==5){
//	                System.out.print("*");
//	            }
//	            else if(j==a && i>5){
//	            	System.out.print("*");
//	             
//	            }
//	            else{
//	            	System.out.print(" ");
//	            }
//	        }
//	        a++;
//	        System.out.print("\n");
//	    }	
		
		
		
//int s=1,c=1;		
//for(int i=1;i<=5;i++) {
//	int k=1;
//	for(int j=1;j<=9;j++) {
//		if(j==6-i&&i<5) {
//			System.out.print(1);
//		}else if(j==4+i&&i<5&&j>5) {
//			s++;
//			System.out.print(s);
//		}
//		else if(i==5&&k==1) {
//			System.out.print(c);
//			c++;
//			k=0;
//		}else {
//			System.out.print(" ");
//			k=1;
//		}
//		
//	}
//	System.out.println("\n");
//}
		
		
		

//for(int i=1;i<=10;i++) {
//	int k=1;
//	for(int j=1;j<=19;j++) {
//		if(j>=i&&j<=19-i&&k==1) {
//			System.out.print("*");
//			k=0;
//		}else {
//			System.out.print(" ");
//			k=1;
//		}
//	}
//	System.out.println("\n");
//}
//		
		
		
		
		
		
		
		
		
		
		
		
		}

		
	

}		
	


