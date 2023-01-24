import java.io.*;
import java.util.*;
class eb_bill
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter consumer number:");
int cno=s.nextInt();
Scanner v=new Scanner(System.in);
System.out.println("enter consumer name:");
String cname=v.nextLine();
Scanner w=new Scanner(System.in);
System.out.println("previous month reading:");
int pmr=w.nextInt();
Scanner t=new Scanner(System.in);
System.out.println("current month reading:");
int cmr=t.nextInt();
int u=cmr-pmr;
int amt=0;
System.out.println("unit used this month="+u);
if(u<=100)
{
amt=u*1;
System.out.println("amount="+amt);
}
else if(u>=101&&u<=200)
{
amt=u*2;
System.out.println("amount="+amt);
}
else if(u>=201&&u<=500)
{
amt=u*4;
System.out.println("amount="+amt);
}
else if(u>=501)
{
amt=u*6;
System.out.println("amount="+amt);
}
else
{
System.out.println("invalid input");
}
}
}