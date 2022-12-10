import java.util.Scanner;
class number_pyramid
{
public static void main(String[] args)
{
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number to be printed:");
int x=s.nextInt();
System.out.println("max number of times to be printed");
int n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<i;j++)
{
System.out.print("1"+"");
}
System.out.println();
}
for(i=0;i<=n;i++)
{
for(j=n;j>i;j--)
{
System.out.print("1"+"");
}
System.out.println();
}
s.close();
}
}