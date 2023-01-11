import java.util.*;
public class inverted_pyramid
{
public static void main(String args[])
{
int rows=5;
for(int i=rows;i>=1;--i)
{
for(int j=rows-i;j>=1;--j)
{
System.out.print(" ");
}
for(int j=1;j<=2*i-1;++j)
{
System.out.print("*");
}
System.out.println();
}
}
}
