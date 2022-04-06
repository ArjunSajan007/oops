import java.util.*;
class calculator
{
public static void main(String [] args)
{
int num1,num2,Result,ch;
Scanner s=new Scanner(System.in);
num1=s.nextInt();
num2=s.nextInt();
System.out.println("1:addition");
System.out.println("2:substraction");
System.out.println("3:multiplication");
System.out.println("4:division");
ch=s.nextInt();
switch(ch)
{
case 1:
            Result=num1+num2;
            System.out.println("result="+Result);
            break;
case 2:
            Result=num1-num2;
            System.out.println("result="+Result);
            break;
case 3:
            Result=num1*num2;
            System.out.println("result="+Result);
            break;
case 4:
            Result=num1/num2;
            System.out.println("result="+Result);
            break;
case 5: 
           System.out.println("Invalid");
           break;
            
}             
}
}
