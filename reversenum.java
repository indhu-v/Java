import java.util.Scanner;
class reversenum
{
public static void main(String args[])
{
int n,rev=0,rem;
Scanner sc=new Scanner(System.in);
System.out.println("enter a integer");
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("the reverse of the given number is:"+rev);
}
}