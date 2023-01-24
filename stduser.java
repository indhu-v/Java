import java.io.*;
import java.util.*;
class stduser
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("total user:");
int tot=s.nextInt();
System.out.println("staff user:");
int staff=s.nextInt();
int ntstaff=(staff/3);
int std=tot-(staff+ntstaff);
System.out.println("student user:"+std);
}
}