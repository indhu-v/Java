import java.io.*;
import java.util.*;
class daystoyear
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter no of days:");
int m=s.nextInt();
int year=m/365;
m=m%365;
System.out.println("no.of.years:"+year);
int week=m/7;
m=m%7;
System.out.println("no.of.weeks:"+week);
int day=m;
System.out.println("no.of.days:"+day);
}
}

