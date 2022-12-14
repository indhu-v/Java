import java.util.Scanner;
public class maxmin
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[]array=new int[n];
for(int i=0;i<n;i++)
{
array[i]=s.nextInt();
}
int max=array[0];
for(int j=0;j<array.length;j++)
{
if(array[j]>max)
max=array[j];
}
System.out.println("maximum="+max);
int min=array[0];
for(int k=0;k<array.length;k++)
{
if(array[k]<min)
min=array[k];
}
System.out.println("minimum="+min);
System.out.println("addition of max&min="+" "+(max+min));
System.out.println("subtraction of max&min="+" "+(max-min));
}
}
