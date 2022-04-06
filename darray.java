import java.util.*;
class oneDarray
{
public static void main(String[] args)
{
int a[]=new int[5];
int i;
Scanner s1=new Scanner(System.in);
System.out.println("enter the number:");
for(i=0;i<5;i++)
{
a[i]=s1.nextInt();
}
for(i=0;i<5;i++)
System.out.println("array is:"+a[i]);
}
}
