import java.util.Scanner;
public class palindromeString
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String reversestr="";
int strlength=str.length();
for(int i=(strlength-1);i>=0;--i)
{
reversestr=reversestr+str.charAt(i);
}
if(str.equals(reversestr))
{
System.out.println(str+" is a palindrome string");
}
else
{
System.out.println(str+" is not a palindrome string");
}
}
}