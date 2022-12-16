import java.util.*;
public class multiplication_table
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
for(int i=0; i<=n; i++)
System.out.println(m+"X"+i+"="+(i*m));
}
}