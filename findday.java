import java.util.Scanner;
public class findday
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("date=");
int day=s.nextInt();
System.out.println("month=");
int month=s.nextInt();
System.out.println("year=");
int year=s.nextInt();
//guass method
double m;
int y;
int dow;
m=(month-2+12)%12;
if(month<=2)
{
year--;
}
y=5*(year%4)+4*(year%100)+6*(year%400);
dow=(day+(int)(2.6*m-0.2)+y)%7;
switch(dow)
{
case 0:
 System.out.println("sunday");
 break;
case 1:
 System.out.println("monday");
break;
case 2:
 System.out.println("tuesday");
break;
case 3:
 System.out.println("wednesday");
break;
case 4:
 System.out.println("thursday");
break;
case 5:
 System.out.println("friday");
break;
case 6:
 System.out.println("saturday");
break;
}
}
}