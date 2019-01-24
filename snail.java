/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner ip=new Scanner(System.in);
		double h,d,n,f;
		while(ip.hasNextInt())
		{
		    h=ip.nextDouble();
		    d=ip.nextDouble();
		    n=ip.nextDouble();
		    f=ip.nextDouble();
		    if(h==0)
		    {
		        break;
		    }
		    double fati=(d/100)*f;
		    int count=1;
		    double completed=0;
		    while(true)
		    {
		        completed=completed+d;
		        if(completed>h)
		        {
		            System.out.println("success on day "+count);
		            break;
		        }
		        else if(completed<0)
		        {
		            System.out.println("failure on day "+count);
		            break;
		        }
		        completed=completed-n;
		        if(completed<0)
		        {
		            System.out.println("failure on day "+count);
		            break;
		        }
		        d-=fati;
		        count++;
		        if(d<0)
		        {
		            d=0;
		        }
		    }
		}
	}
}
