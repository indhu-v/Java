import java.util.Scanner;
public class lcm_gcd
{
public static void main(String[]args)
{
int a,b,t,aTemp,bTemp,lcm,gcd;
Scanner s= new Scanner(System.in);
System.out.println("Enter Two Number");
a=s.nextInt();
b=s.nextInt();
aTemp=a;
bTemp=b;
while(bTemp!=0) 
{
t=bTemp;
bTemp=aTemp%bTemp;
aTemp=t;
}
gcd=aTemp;
lcm=(a*b)/gcd;
System.out.println("LCM="+lcm);
System.out.println("GCD="+gcd);
}
}
