package array;
import java.util.*;
public class Q6
{
	public static void union(int a[],int b[],int m,int n)
	{
		int i=0,j=0,k=0;
		int union[]=new int[m+n];
		Arrays.sort(a);
		Arrays.sort(b);
		while(i<m&&j<n)
		{
			if(a[i]<b[j])
			{
				union[k]=a[i];
				i++;
			}
			else
			{
				union[k]=b[j];
				j++;
			}
			k++;
		}
		 while(i<m)
		 {
		    
		        union[k] = a[i];
		        i++;
		        k++;
		    }
		    while(j<n)
		    {
		        union[k] = b[j];
		        j++;
		        k++;
		    }
		

		 for(int g=0;g<n+m;g++)
		 {
			 System.out.println(union[g]);
		 }


	}
	public static void intersection(int a[],int b[],int m,int n)
	{
		int i=0,j=0,k=0;
		int intersections[]=new int[m+n];
		Arrays.sort(a);
		Arrays.sort(b);
		while(i<m&&j<n)
		{
			if(a[i]==b[j])
			{
				intersections[k]=a[i];
				i++;
			}
			
			k++;
		}
		System.out.println("\tINTERSECTION \n");
		 for(int g=0;g<n;g++)
		 {
			 System.out.println(intersections[g]);
		 }
	}
	
	
	public static void main(String[] args)
{
	int a[]= {7,0,1,5,4,2};
	int b[]= {7,2,1,3,6,8};
	int m=a.length;
	int n=b.length;
	union(a,b,m,n);
	intersection(a,b,m,n);
}}
