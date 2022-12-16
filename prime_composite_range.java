import java.util.*;
class test
{
int checkPrime(int n)
{
for(int i=2;i<n/2;i++)
{
if(n%i==0)
{
return 0;
}
}
return 1;
}
}
public class prime_composite_range
{
public static void main(String []args)
{
test t1=new test();
Scanner s=new Scanner(System.in);
int starting=s.nextInt3();
int ending=s.nextInt();
int pcnt=0,ccnt=0;
for (int i=starting;i<=ending;i++)
{
if(t1.checkPrime(i)==1)
{
pcnt++;
}
else
{
ccnt++;
}
}
System.out.println("NUmber of prime numbers in the given range is: "+pcnt);
System.out.println("NUmber of composite numbers in the given range is: "+ccnt);
}
}