import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	  
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the Size of Numbers");
		int a = sc.nextInt();
		
	    int arr[] = new int[a];
	    for(int i=0; i<a; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i=0; i<a; i++){
	        if(arr[i]%2==0)
	            System.out.println("Even");
	        else
	        System.out.println("odd");
	    }
		
		}
	}
