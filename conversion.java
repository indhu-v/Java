import java.util.Scanner;
public class conversion
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int decimal=s.nextInt();
String binary=Integer.toBinaryString(decimal);
System.out.println("binary is "+binary);
System.out.print("octal is ");
System.out.println(Integer.toOctalString(decimal));
}
}