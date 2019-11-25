package com.company;

import java .util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        while(n>0)
        {
            int n1=sc.nextInt();
            int a[]=new int [n1];
            for(int j=0;j<n1;j++)
            {
                a[j]=sc.nextInt();
            }
            int gcd=a[0];
            for(int k=1;k<n1;k++)
            {
                int b=a[k];
                int c=gcd;
                int e=0;
                int d=0;
                while(b!=0||c!=0)
                {
                    if(b<c)
                    {
                        c=b;
                        b=c%b;
                        e++;
                    }
                    else{
                        b=c;
                        c=b%c;
                        d++;
                    }
                }
                if(e>1)
                {
                    gcd=c;
                }
                else if(d>1)
                    gcd=b;
            }
            for(int t=0;t<n1;t++)
                System.out.print(a[t]/gcd+" ");
n--;
            }

    }
}
