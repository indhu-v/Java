import java.util.Scanner;
public class split_year
{
public static void main(String args[])
{
int m,year,week,day;
Scanner s=new Scanner(System.in);
System.out.print("enter no of days:");
m=s.nextInt();
year=m/365;
m=m%365;
System.out.println("no.of years:"+year);
week=m/7;
m=m%7;
System.out.println("no of weeks:"+week);
day=m;
System.out.println("no of days:"+day);
}
}
