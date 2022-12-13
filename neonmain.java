import java.io.*;
import java.util.Scanner;
class neonnum
{
public static int check(int num)
{
int sum=0,d,sq;
sq=num*num;
while(sq!=0)
{
d=sq%10;
sum=sum+d;
sq=sq/10;
}
if(num==sum)
{
System.out.println(num+" is a neon number");
}
else
{
System.out.println(num+" is not a neon number");
}
return num;
}
}
public class neonmain
{
public static void main(String[]args)
{
neonnum x=new neonnum();
x.check(9);
x.check(8);
}
}