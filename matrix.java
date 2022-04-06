import java.util.*;
class Matrixadd
{
public static void main(String[] args)
{
int a[][]=new int[3][3];
intb[][]=new int[3][3];
intc[][]=new int[3][3];
inti,j;
Scanner s1=new Scanner(system.in);
System.out.println("enter the first matrix:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=s1.nextInt();
}
}
System.out.println("enter the second matrix:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=s1.nextInt();
}
}
System.out.println("matrix after addition is:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.println("\t" +c[i][j]);
}
}
}
