import java.util.Scanner;
public class reverse_str
{
public static void main(String[]args)
{
String str;
Scanner s=new Scanner(System.in);
System.out.println("enter a string:");
str=s.nextLine();
System.out.println("reverse of a string "+str+" is:");
for(int j=str.length();j>0;--j)
{
System.out.print(str.charAt(j-1));
}
}
}